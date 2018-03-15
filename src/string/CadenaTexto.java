package string;

import java.util.Scanner;

public class CadenaTexto {
	public static void main(String[] args) {
		String cadena;
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		char letra;
		
		System.out.println("Introduce una cadena de texto");
		cadena = sc.nextLine();
		cadena = cadena.toLowerCase(); 
		for (int i = 0; i < cadena.length(); i++) {
			letra = cadena.charAt(i);
			switch(letra){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contador++;
			}
		}
		System.out.println("Total de vocales: "+contador);
	}
}
