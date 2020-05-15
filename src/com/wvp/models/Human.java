package com.wvp.models;

public abstract class Human {
    // Attributes
    private int id;
    private String name;
    private int age;
    private final String gender;
    private final String[] visitedRegions;
    protected final String nationality;
    protected final String country;

    // Constructor
    public Human(int id, String name, int age, String gender, String nationality, String country, String... visitedRegions) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.country = country;
        this.visitedRegions = visitedRegions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCountry() {
        return country;
    }

    public String getVisitedRegions() {
        if (visitedRegions.length == 2) {
            return String.join(" and ", visitedRegions);
        }
        else if (visitedRegions.length > 2) {
            String secondToLastIndex = visitedRegions[visitedRegions.length -2];
            String lastIndex = visitedRegions[visitedRegions.length - 1];
            String visitedRegionsString = String.join(", ", visitedRegions);
            /* Le prog. va supprimer l'avant-dernier et le dernier index, les virgules avant et après l'avant-dernier index,
             * puis rajouter l'avant-dernier et dernier index afin d'éviter les doublons. */
            if (visitedRegionsString.contains(secondToLastIndex + ",")) {
                // Suppression de l'avant-dernier index
                String removalSecondToLastIndex = visitedRegionsString.replace(secondToLastIndex, "");
                // Suppression du dernier index
                String removalLastIndex = removalSecondToLastIndex.replace(lastIndex, "");
                return removalLastIndex.replace(" ,", "") + secondToLastIndex + "" + " and " + lastIndex;
            }
        }
        return String.join("", visitedRegions);
    }

    // Methods
    // Aucune région encore visitée
    public boolean hasVisitedRegions() {
        return getVisitedRegions().length() <= 0;
    }

    // Plus tard, insérer plutôt un objet Animal à la place du String afin de rendre plus dynamique
    public String takePicture(String animalName, String visitedRegion) {
        return getName() + " took a picture of a " + animalName + " in " + visitedRegion;
    }
}
