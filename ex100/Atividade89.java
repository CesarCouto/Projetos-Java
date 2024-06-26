package JavaExercicio;
import java.util.Scanner;
public class Atividade89 {
	
	// Atividade89 cesar
	public class ParesImparesDezFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int pares = 0;
	        int impares = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        System.out.println("Quantidade de n�meros pares: " + pares);
	        System.out.println("Quantidade de n�meros �mpares: " + impares);
	        scanner.close();
	    }
	}

}
