package JavaExercicio;
import java.util.Scanner;
public class Atividade91 {
	
	// Atividade91 cesar
	public class SomaImparesCincoFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaImpares = 0;
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            if (numero % 2 != 0) {
	                somaImpares += numero;
	            }
	        }
	        System.out.println("A soma dos n�meros �mpares �: " + somaImpares);
	        scanner.close();
	    }
	}

}
