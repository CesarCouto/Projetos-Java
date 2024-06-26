package JavaExercicio;
import java.util.Scanner;
public class Atividade87 {
	
	// Atividade87 cesar
	public class ParesImparesFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int pares = 0;
	        int impares = 0;
	        for (int i = 0; i < 5; i++) {
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
