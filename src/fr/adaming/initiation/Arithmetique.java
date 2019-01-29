package fr.adaming.initiation;

/**
 * @author Thomas MATHIEU
 * 29 janv. 2019
 * Arithmetique.java
 * Java_TD
 * 
 * Cette classe permet d'affecter à deux entiers des valeurs,
 * et de calculer leur somme ainsi que leur produit
 */

public class Arithmetique {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		somme(a, b);
		produit(a, b);
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	
	private static int somme(int a, int b) {
		int somme = a + b;
		System.out.println("La somme de a et b est égale à " + somme);
		return somme;
		
	}
	
	private static int produit(int a, int b) {
		int produit = a * b;
		System.out.println("La somme de a et b est égale à " + produit);
		return produit;
		
	}
	
}
