package fr.htc.oo.entity;

public class Member {
	//D�clarations d'attributs
	int age;
	String firstName;
	String lastName;
	boolean married;
	
	
	
		//D�claration des m�thodes
	
	@Override
	public String toString() {
		return "Member [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", married=" + married
				+ "]";
	}

	/**
	 * this methode will return a brief description of the person
	 * @return
	 */
	public String whoAmI(){
		
		return "Je m'appel " + firstName + " " + lastName.toUpperCase() + ", j'ai " + age + "ans";
	}
	
	/**
	 * This methode will return the age of the person
	 * @return
	 */
	public int getAge(){
		
		return age;
	}

}
