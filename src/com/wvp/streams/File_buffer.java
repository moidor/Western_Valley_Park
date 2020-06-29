package com.wvp.streams;

import java.io.*;

public class File_buffer {
    // Déclaration des objets hors du try/catch
    FileInputStream fis;
    FileOutputStream fos;
    BufferedInputStream bis;
    BufferedOutputStream bos;

    public void fileCreation() {
        // Déclaration des objets hors du try/catch
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bis;
        BufferedOutputStream bos;

        try {
            fis = new FileInputStream(new File("C:\\Users/Cham/Desktop/dossier1/test.txt"));
            fos = new FileOutputStream(new File("C:\\Users/Cham/Desktop/dossier1/test2.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("C:\\Users/Cham/Desktop/dossier1/test.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users/Cham/Desktop/dossier1/test3.txt")));

            // On crée un tableau de byte pour indiquer le nombre de bytes lus à chaque tour
            byte[] buf = new byte[8];

            // Récupération du temps du système
            long startTime = System.currentTimeMillis();

            while (fis.read(buf) != -1) {
                fos.write(buf);
            }
            // Affichage du temps d'exécution
            System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : " +
                    (System.currentTimeMillis() - startTime));
            // On réinitialise
            startTime = System.currentTimeMillis();

            while (bis.read(buf) != -1) {
                bos.write(buf);
            }
            // On réaffiche
            System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : "
                    + (System.currentTimeMillis() - startTime));
            // On ferme nos flux de données
            fis.close();
            bis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
