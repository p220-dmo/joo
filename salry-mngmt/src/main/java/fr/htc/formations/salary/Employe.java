package fr.htc.formations.salary;
/* **********************************************************************
 *  La classe Employe
 * **********************************************************************/
abstract class Employe {

    private String nom;
    private String prenom;
    private int age;

    private String date;
 
 
    public Employe(String prenom, String nom, int age, String date) {

        this.nom = nom;
        this.prenom = prenom;

        this.age = age;
        this.date = date;

    }
 
    public abstract double calculerSalaire();
 

    public String getTitre()
        {
            return "L'employ� " ;

        }
 
    public String getNom() {
        return getTitre() + prenom + " " + nom;

    }
}