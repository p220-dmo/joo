package fr.htc.formations.salary;
/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et Repr�sentant)
 * **********************************************************************/
abstract class Commercial extends Employe {

    private double chiffreAffaire;
 
    public Commercial(String prenom, String nom, int age, String date,

               double chiffreAffaire) {
        super(prenom, nom, age, date);
        this.chiffreAffaire = chiffreAffaire;

    }
 
    public double getChiffreAffaire()
        {
            return chiffreAffaire;

        }
 
}
 