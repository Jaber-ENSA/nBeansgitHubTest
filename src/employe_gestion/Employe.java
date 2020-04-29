/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe_gestion;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Employe {
    private String matricule,nom,prenom;
    private int anneeNaiss,anneeEmba;
    float salaire;
 public int n=0;
    public Employe() {
        n++;
    }

    public Employe(String matricule, String nom, String prenom, int anneeNaiss, int anneeEmba, float salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaiss = anneeNaiss;
        this.anneeEmba = anneeEmba;
        this.salaire = salaire;
        n++;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneeNaiss() {
        return anneeNaiss;
    }

    public void setAnneeNaiss(int anneeNaiss) {
        this.anneeNaiss = anneeNaiss;
    }

    public int getAnneeEmba() {
        return anneeEmba;
    }

    public void setAnneeEmba(int anneeEmba) {
        this.anneeEmba = anneeEmba;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    
    public int getAge(){
        LocalDate d=LocalDate.now();
        int an=d.getYear();
    return an-anneeNaiss;
    }
    public int getAnciennete(){
        LocalDate d=LocalDate.now();
        int an=d.getYear();
    return an-anneeEmba;
    }
    public void AugmentationSalair(){
    if(getAnciennete()<5)
        this.salaire=this.salaire+this.salaire*0.02f;
    else  if(getAnciennete()<10)
         this.salaire=this.salaire+this.salaire*0.05f;
    else 
        this.salaire=this.salaire+this.salaire*0.1f;
    }

    
    public void AfficherEmploye() {
       System.out.println("Employe{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", anneeNaiss=" + anneeNaiss + ", anneeEmba=" + anneeEmba + ", salaire=" + salaire +" DHs}");
    }
   
    
    
}
