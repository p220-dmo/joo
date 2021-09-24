package fr.htc.oo.entity;

public class App {

	public static void main(String[] args) {
		Member blackListed = new Member();
		System.out.println("Member = " + blackListed);
		System.out.println("FirstName : " + blackListed.firstName);
		System.out.println("LastName  : " + blackListed.lastName);
		System.out.println("Age       : " + blackListed.age);
		System.out.println("Married   : " + blackListed.married);
		
		blackListed.age = 32;
		blackListed.firstName = "Axel";
		blackListed.lastName = "Segouane";
		blackListed.married = true;
		
		System.out.println("=============================");
		System.out.println("Member = " + blackListed);
		System.out.println("FirstName : " + blackListed.firstName);
		System.out.println("LastName  : " + blackListed.lastName);
		System.out.println("Age       : " + blackListed.age);
		System.out.println("Married   : " + blackListed.married);
		System.out.println("=============================");
		System.out.println(blackListed.whoAmI());
		System.out.println(blackListed.getAge());
		

	}

}
