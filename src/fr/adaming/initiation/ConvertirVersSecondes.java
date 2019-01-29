package fr.adaming.initiation;
import java.util.Scanner;

public class ConvertirVersSecondes {
	
	/** Cette classe convertit une durée représentée par le format " hh:mm:ss " en une durée en secondes, et affiche le résultat
	 * Auteur : Thomas MATHIEU
	 * Date dernière modification : 28/01/2019
	 */
	
	static int h;
	static int m;
	static int s;
	
	public static void saisirVariable() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre d'heures");
		h = sc.nextInt();
		System.out.println("Veuillez saisir le nombres de minutes");
		m = sc.nextInt();
		System.out.println("Veuillez saisir le nombre de secondes");
		s = sc.nextInt();
		System.out.println(" La durée: " + h + " h " + m + " m " + s + " s");
	}
	
	public static void dureeSecondes() {
		int dureeSecondes = h * 3600 + m * 60 + s;
		System.out.println("La durée en secondes : " + dureeSecondes + " secondes");
	}
	
	public static void main(String[] args) {
		saisirVariable();
		dureeSecondes();
	}

}
