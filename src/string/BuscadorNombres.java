package string;

import java.util.Scanner;

public class BuscadorNombres {

	public static void main(String[] args) {
		String list, name;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la lista de nombres");
		list = sc.nextLine();
		System.out.println("Introduce nombre a buscar");
		name = sc.nextLine();
		
		String [] nombres = list.split(",");
		//recorremos el array en busca del nombre a buscar
		for (String n : nombres) {
			if(n.equals(name)){
				contador++;
			}
		}
		System.out.println("El nombre aparece " + contador + " veces");
	}

}
