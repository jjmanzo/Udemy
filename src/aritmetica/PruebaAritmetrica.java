package aritmetica;

public class PruebaAritmetrica {
	public static void main(String[] args) {
		
		int operandoA = 6;
		int operandoB = 2; 
		
		Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
		
		System.out.println("Operando A: " + operandoA + "y "
				+ " operando B" + operandoB);
		
		System.out.println("\nResultado suma : " +obj1.sumar());
		
		System.out.println("\nResultado suma : " +obj1.restar());
		
		System.out.println("\nResultado suma : " +obj1.multiplicar());
		
		System.out.println("\nResultado suma : " +obj1.dividir());
		
	}
}
