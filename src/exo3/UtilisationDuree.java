/*
 * UtilisationDuree.java
 */

package exo3;

import java.util.Scanner;

/**
 * Utilisation des méthodes traitant les durées
 */
public class UtilisationDuree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testEstChaineDuree();
    }
    
    // ////////////////////////////////////////////////////////////////////
    //      Méthodes utilisées pour tester les méthodes précédentes      //
    // ////////////////////////////////////////////////////////////////////

    
    /** 
     * Méthode de test de la méthode combienDifferentes
     */
    public static void testCombienDifferentes() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("Parmi ces 3 durées, "
                + DureeHMS.combienDifferentes(d1, d2, d3) + " sont différentes.");

    }

    /** 
     * Méthode de test de la méthode Ordre
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("ces 3 durées sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));

    }

  

    /** 
     * Méthode de test de la méthode estChaineDuree
     */
    public static void testEstChaineDuree() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.print("Entrez une chaine : ");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.println("OK !!");
        } else {
            System.out.println("ERREUR !!! ");
        }
        entree.close();
    }

}