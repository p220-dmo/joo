package fr.htc.formations.salary;
/* **********************************************************************
 *  Une premi�re sous-classe d'employ� � risque
 * **********************************************************************/

class TechnARisque extends Technicien implements ARisque {
 
    public TechnARisque(String prenom, String nom, int age, String date, int unites) {

        super(prenom, nom, age, date, unites);
    }
 
    public double calculerSalaire() {

        return super.calculerSalaire() + PRIME;
    }

}