package JavaExercicio;

import java.util.Arrays;

public class buscavetor {

	public static void main(String[] args) {
		int vet[] = {1,5,6,7,4,9,0};
		
		int pos = Arrays.binarySearch(vet, 9);
		
		for(int valor:vet) {
			System.out.print(valor + " ");
		}
		System.out.println(" ");
		System.out.println("Encontrei o valor na pocição " + pos);

	}

}
