package metodos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas gnotas = new Notas();
		Scanner sc = new Scanner(System.in);
		int op;
		do{
			System.out.println("1.- Agragar nota");
			System.out.println("2.- Ver nota media");
			System.out.println("3.- Ver aprobados");
			System.out.println("4.- Salir");
			
			op= Integer.parseInt(sc.nextLine());
			switch(op){
			case 1:
				System.out.println("Nota: ");
				double d = Double.parseDouble(sc.nextLine());
				if (!gnotas.agregarNota(d)) {
					System.out.println("No ha podido agregar");
				}
				break;
			case 2:
				System.out.println("Media: "+gnotas.media());
				break;
			case 3:
				System.out.println("Aprobados" + gnotas.aprobados());
				break;
			case 4:
				break;
			default:
				System.out.println("debes escribir una opcion");
			}
		}while(op!=4);
		
	}

}
