package pasoxvalor;

public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		p.cambiarNombre("Juan");
		imprimirNombre(p);
		modificarPersona(p);
		imprimirNombre(p);
	}
	
	public static void modificarPersona(Persona arg){
		arg.cambiarNombre("Carlos");
	}
	
	public static void imprimirNombre(Persona p){
		System.out.println("Valor recibido: " + p.obtenerNombre());
	}

}
