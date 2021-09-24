package fr.htc.oo.company;

public class Employee {
	private int nbEmplyes = 0;
	private String matricule;
	private String name;
	private double sal;
	
	public Employee() {
		nbEmplyes++;
	}
	
	public int getNbEmployes(){
		return nbEmplyes;
	}
	
	

}
