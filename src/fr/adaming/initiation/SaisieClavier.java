package fr.adaming.initiation;
import java.util.Scanner;

/**
 * @author Thomas MATHIEU
 * 29 janv. 2019
 * SaisieClavier.java
 * Java_TD
 * 
 * Cette classe permet de saisir au clavier deux entiers,
 * puis de calculer leur somme et leur produit
 */

public class SaisieClavier {
	
	static int nb1 = 0;
	static int nb2 = 0;
	
	public static void main(String[] args) {
		saisirVariable();
		somme();
		produit();
	}
	
	private static void saisirVariable() {
		System.out.println("Veuillez saisir le premier nombre");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		nb1 = sc.nextInt();
		System.out.println("Veuillez saisir le deuxième nombre");
		nb2 = sc.nextInt();
		System.out.println("Les nombres nb1 : " + nb1 + " et nb2 : " + nb2);
	}
	
	private static int somme() {
		int somme = nb1 + nb2;
		System.out.println("La somme de nb1 et nb2 : " + somme);
		return somme;
	}
	
	private static int produit() {
		int produit = nb1 * nb2;
		System.out.println("Le produit de nb1 et nb2 : " + produit);
		return produit;
	}

}
