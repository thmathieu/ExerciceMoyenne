package fr.adaming.initiation;
import java.util.Scanner;

public class Exercice9 {
	
	/** Cette classe convertit 
	 * Auteur : Thomas MATHIEU
	 * Date dernière modification : 29/01/2019
	 */
	
	static float prixHT;
	
	public static void saisirVariable() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le prix HT");
		prixHT = sc.nextInt();
		System.out.println("Le prix HT : " + prixHT);
	}
	
	public static void taxe() {
		double prixTTC = 1.18 * prixHT + 0.2;
		System.out.println("Le prix TTC correspondant : " + prixTTC);
	}
	
	public static void main(String[] args) {
		saisirVariable();
		taxe();
	}

}
