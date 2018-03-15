package arrays;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
		int num, aux;
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero");
			num = sc.nextInt();
			while (num < 0) {
				System.out.println("No es positivo, vuelve a intentar");
				num = sc.nextInt();
			}
			numeros[i] = num;
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] > numeros[i]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		for (int n : numeros) {
			System.out.print(n + ",");
		}
	}
}