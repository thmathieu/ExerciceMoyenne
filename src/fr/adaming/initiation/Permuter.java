package fr.adaming.initiation;

/**
 * @author Thomas MATHIEU
 * 29 janv. 2019
 * Permuter.java
 * Java_TD
 * 
 * Cette classe permet de permuter les contenus de deux variables entières
 */

public class Permuter {
	
	static int a = 3;
	static int b = 5;

	public static void main(String[] args) {
		afficher();
		permuter();
		afficher();
		
	}

	private static void afficher() {
		System.out.println("Le premier argument : " + a + " Le second argument : " + b);
		
	}

	private static void permuter() {
		// On crée une variable temporaire pour stocker la valeur initiale de a, avant de l'écraser
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("ABRACADABRA !");
	}
	
}
