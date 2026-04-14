package com.formation;

import java.util.Scanner;

public class Calculate {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Retourne double pour avoir les decimales (ex: 7/2 = 3.5)
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur : division par zero impossible !");
            return 0; // valeur de secours, on n'affichera pas le résultat
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation;

        do {
            // Affichage du menu
            System.out.println("\n====== CALCULATRICE ======");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            operation = scanner.nextInt();

            if (operation == 5) {
                System.out.println("Au revoir !");
                break; // on sort de la boucle
            }

            if (operation < 1 || operation > 5) {
                System.out.println("Choix invalide, recommencez.");
                continue; // on recommence sans demander les nombres
            }

            // Saisie des nombres
            System.out.print("Premier nombre  : ");
            int nbr1 = scanner.nextInt();
            System.out.print("Deuxieme nombre : ");
            int nbr2 = scanner.nextInt();

            // Routage vers la bonne operation
            switch (operation) {
                case 1:
                    System.out.println("Resultat : " + addition(nbr1, nbr2));
                    break;
                case 2:
                    System.out.println("Resultat : " + soustraction(nbr1, nbr2));
                    break;
                case 3:
                    System.out.println("Resultat : " + multiplication(nbr1, nbr2));
                    break;
                case 4:
                    if (nbr2 != 0) {
                        System.out.println("Resultat : " + division(nbr1, nbr2));
                    } else {
                        division(nbr1, nbr2); // affiche le message d'erreur
                    }
                    break;
            }

        } while (true); // la condition de sortie est gérée par le break au-dessus

        scanner.close();
    }
}