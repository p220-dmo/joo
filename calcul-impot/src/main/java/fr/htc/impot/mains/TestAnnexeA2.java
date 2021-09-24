package fr.htc.impot.mains;

import fr.htc.impot.core.Habitation;
import fr.htc.impot.core.HabitationProfessionnelle;

public class TestAnnexeA2 {

	public static void main(String[] args) {

		// creation d’un objet de type Habitation
		Habitation hab = new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130);

		// calcul de l’impôt
		double impot = hab.impot();

		// affichage des attributs de la classe Habitation
		hab.Affiche();
		System.out.println("Impot = " + impot + "€");

	}
}
