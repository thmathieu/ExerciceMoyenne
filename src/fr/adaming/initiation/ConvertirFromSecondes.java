package fr.adaming.initiation;
import java.util.Scanner;

public class ConvertirFromSecondes {
	
	/** Cette classe
	 * Auteur : Thomas MATHIEU
	 * Date dernière modification : 28/01/2019
	 */
	
	static int dureeSecondes;
	
	public static void saisirVariable() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la durée en secondes");
		dureeSecondes = sc.nextInt();
		System.out.println("La durée en secondes: " + dureeSecondes + " s");
	}
	
	public static void calcul() {
		
		int h = dureeSecondes / 3600;
		int m = (dureeSecondes - h * 3600) / 60;
		int s = dureeSecondes%60;
		
		System.out.println("La durée : " + h + " h " + m + " m " + s + "s");
	}
	
	public static void main(String[] args) {
		saisirVariable();
		calcul();
	}

}
