package JavaExercicio;
import java.util.Scanner;
public class Entrezeroecem {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDeNumeros = 20;
		        int contadorEntreZeroECem = 0;

		        // Lendo 20 números do usuário e contando quantos estão entre 0 e 100
		        for (int i = 1; i <= numeroDeNumeros; i++) {
		            System.out.print("Digite o número " + i + ": ");
		            int numero = scanner.nextInt();
		            if (numero >= 0 && numero <= 100) {
		                contadorEntreZeroECem++;
		            }
		        }

		        // Exibindo a quantidade de números que estão entre 0 e 100
		        System.out.println("A quantidade de números entre 0 e 100 é: " + contadorEntreZeroECem);

		        scanner.close();
		    }
		}


	}

}
