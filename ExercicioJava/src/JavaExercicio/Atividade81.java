package JavaExercicio;
import java.util.Scanner;
public class Atividade81 {
	
	// Atividade81 cesar
	public class InversoFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um n�mero: ");
	            numeros[i] = scanner.nextInt();
	        }
	        System.out.println("N�meros na ordem inversa:");
	        for (int i = 4; i >= 0; i--) {
	            System.out.println(numeros[i]);
	        }
	        scanner.close();
	    }
	}

}
