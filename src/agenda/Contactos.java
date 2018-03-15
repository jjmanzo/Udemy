package agenda;

public class Contactos {
	private Contacto[] contactos;
	private int total;
	
	public Contactos(){
		contactos = new Contactos[10];
		total = 0;
	}
	
	public boolean espacioLibre(){
		if (total < 10) {
			return true;
		}else{
			return false;
		}
	}
	
	public void
}
