package ArithmeticException;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
	
		int a;
		int b;
		int res;
		
		Scanner monScanner = new Scanner(System.in); 

		System.out.println("Saisissez votre première valeur pour a "); 

		a = monScanner.nextInt(); 

		System.out.println("Saisissez votre deuxième valeur pour b");

		b = monScanner.nextInt();
		
		{
			
		}
		try {
			res = a / b;
			System.out.println("le résultat de " + a + " divisé par " + b + " est " + res); 
			}

		catch (ArithmeticException e) {
			System.out.println("Problème dans la division ");
			System.out.println("le message officiel est " + e.getMessage());
		}

		System.out.println("Fin du programme");

	}
	finally {         
	    System.out.println("le bloc finally sera toujours exécuté") ;
	    System.out.println("et c'est ici  que l'on fermera par exemple les fichiers") ;          
	} 

}
}

