package metodos;

public class Notas {
	private double[] notas;
	private int total;
	
	public Notas(){
		notas = new double[10];
		total = 0;
	}
	
	public boolean agregarNota(double d){
		if(total < 10){
			notas[total]=d;
			total++;
			return true;
		}else{
			return false;
		}
	}
	
	public double media(){
		double m = 0;
		for (int i = 0; i < total; i++) {
			m += notas[i];
		}
		return m/total;
	}
	
	public int aprobados(){
		int ap=0;
		for (int i = 0; i < total; i++) {
			if (notas[i]>=5) {
				ap++;
			}
		}
		return ap;
	}
}
