package packageScanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		int edad;
		float altura;
		boolean valor;
		
		System.out.print("Ingrese nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Ingrese edad: ");
		edad = entrada.nextInt();
		
		System.out.print("Ingrese altura: ");
		altura = entrada.nextFloat();
		entrada.nextLine();
		System.out.print("El programa es de tu agrado: (si/no) ");
		valor = entrada.nextLine().equals("si");
		
		entrada.close();
		
		System.out.println("\nHola "+nombre+"\nedad: "+edad+"\naltura: "+altura+
				"\nvalor: "+valor);
	
	
	
		
		
	}

}
