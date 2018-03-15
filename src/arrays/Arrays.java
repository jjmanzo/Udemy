package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
		int max;
		int [] datos = {4,8,2,11,8,9,23,11,14,35};
		max = datos[0];
		
		for(int n : datos){
			media = media + n;
			if (n > max){
				max = n;
			}
		}
		media = media / datos.length;
		System.out.println("La media es = "+ media);
		System.out.println("El numero mayor es = " + max);
	}	

}
