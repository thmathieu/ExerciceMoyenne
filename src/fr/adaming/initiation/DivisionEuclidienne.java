package fr.adaming.initiation;
import java.util.Scanner;

public class DivisionEuclidienne {
	
	/** Cette classe calcule le quotient et le reste de la division euclidienne de l'entier relatif a par l'entier relatif b
	 * Elle réalise également un contrôle de saisie pour empêcher la division par 0
	 * Auteur : Thomas MATHIEU
	 * Date dernière modification : 28/01/2019
	 */
	
	static int a; // dividende de la division euclidienne
	static int b; // diviseur de la division euclidienne
	
	public static void saisirVariable() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre");
		a = sc.nextInt();
		System.out.println("Veuillez saisir le deuxième nombre");
		b = sc.nextInt();
		System.out.println("Les nombres a : " + a + " et b : " + b);
	}
	
	public static void calcul() {
		int quotient = 0;
		int reste = 0;
		if (b>0 || b<0) {
			quotient = a/b;
			reste = a%b;
			System.out.println("Quotient : " + quotient + " et reste : " + reste);
		}
		
		else {
			System.out.println("Erreur : il est impossible de diviser par 0");
		}
	}
	
	public static void main(String[] args) {
		saisirVariable();
		calcul();
	}

}
