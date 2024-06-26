package JavaExercicio;

import java.util.Arrays;

public class vetroesforint {

	public static void main(String[] args) {
		double v[] = {3.5, 2.7, 4.8, 1.6};
		
		Arrays.sort(v);
		
		for(double valor:v) {
			System.out.print(valor + " ");
		}
		
		String z[] = {"Zed", "Cleito", "Fagner", "Amelia"};
		
		Arrays.sort(z);
		
		for(String nome:z) {
			System.out.print(nome + " ");
		}
		
		
	}

}
