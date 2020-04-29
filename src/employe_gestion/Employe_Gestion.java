/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe_gestion;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Employe_Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   Scanner clavier=new Scanner(System.in);
    //l'utilisateur va Saisir les informations par le clavier
    System.out.println("\n\n===== Saisir les informations ===== \n");
    System.out.print("Saisir la matricule :");
     String m=clavier.nextLine();
     System.out.print("Saisir le nom:");
    String n=clavier.nextLine();
    System.out.print("Saisir le prenom :");
    String p=clavier.nextLine();
    System.out.print("Saisir le Salaire DH :");
    int sa=clavier.nextInt();
    
    
    System.out.println("Saisir l'année de naissance");
 
    int an=clavier.nextInt();
    
    System.out.println("Saisir l'année d'embauche ");
  
   int am=clavier.nextInt();
   */
    //création de l'objet
  // Employe e1=new Employe(m,n,p,an,am,sa);
  Employe e1=new Employe("L1425","Alami","Hassan",1982,2010,5000);
   e1.AfficherEmploye();
   e1.AugmentationSalair();
e1.AfficherEmploye();
Employe e2=new Employe();
Employe e3=new Employe();
System.out.println(" le nombre des objets créés est : "+e3.n);
    }
    
}
