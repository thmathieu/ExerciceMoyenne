package fr.adaming.initiation;
import java.util.Scanner;

public class Moyenne {
	
	/** Cette classe calcule et affiche la moyenne de n nombres entiers, saisis au clavier par l'utilisateur
	 * Ces n entiers sont stock�s dans un tableau
	 * Auteur : Thomas MATHIEU
	 * Date derni�re modification : 28/01/2019
	 */
	
	static int tab[] = new int[4];
	
	public static void saisirVariableTableau() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Veuillez saisir l'�l�ment d'indice " + i);
			tab[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static float moyenne() {
		float somme = 0;
		float moyenne = 0; 
		
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		moyenne = somme / tab.length;
		return moyenne;
		
	}
	
	public static void main(String[] args) {
		saisirVariableTableau();
		System.out.println("La moyenne des nombres du tableau est : " + moyenne());
	}

}
