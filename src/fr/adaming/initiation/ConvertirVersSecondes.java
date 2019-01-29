package fr.adaming.initiation;
import java.util.Scanner;

public class ConvertirVersSecondes {
	
	/** Cette classe convertit une dur�e repr�sent�e par le format " hh:mm:ss " en une dur�e en secondes, et affiche le r�sultat
	 * Auteur : Thomas MATHIEU
	 * Date derni�re modification : 28/01/2019
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
		System.out.println(" La dur�e: " + h + " h " + m + " m " + s + " s");
	}
	
	public static void dureeSecondes() {
		int dureeSecondes = h * 3600 + m * 60 + s;
		System.out.println("La dur�e en secondes : " + dureeSecondes + " secondes");
	}
	
	public static void main(String[] args) {
		saisirVariable();
		dureeSecondes();
	}

}
