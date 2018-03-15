package pasoxvalor;

public class PasoPorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		imprimir(x);
		cambiarValor(x);
		imprimir(x);
	}
	
	public static void cambiarValor(int i){
		i=200;
	}

	private static void imprimir(int arg) {
		// TODO Auto-generated method stub
		System.out.println("Valor recibido: " + arg);
	}
}