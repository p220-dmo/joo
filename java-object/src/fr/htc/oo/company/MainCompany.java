package fr.htc.oo.company;

public class MainCompany {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//Le nombre d'employ�s est : 
		System.out.println("Le nombre d'employ�s est : " + e1.getNbEmployes());
		
		Employee e2 = new Employee();
		System.out.println("Le nombre d'employ�s est : " + e1.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e2.getNbEmployes());
		Employee e3 = new Employee();
		
		//Le nombre d'employ�s est : 
		System.out.println("Le nombre d'employ�s est : " + e1.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e2.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e3.getNbEmployes());
		Employee e4 = new Employee();
		System.out.println("Le nombre d'employ�s est : " + e1.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e2.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e3.getNbEmployes());
		System.out.println("Le nombre d'employ�s est : " + e4.getNbEmployes());
	}
		

}
