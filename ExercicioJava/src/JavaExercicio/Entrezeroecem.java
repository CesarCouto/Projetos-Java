package JavaExercicio;
import java.util.Scanner;
public class Entrezeroecem {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDeNumeros = 20;
		        int contadorEntreZeroECem = 0;

		        // Lendo 20 n�meros do usu�rio e contando quantos est�o entre 0 e 100
		        for (int i = 1; i <= numeroDeNumeros; i++) {
		            System.out.print("Digite o n�mero " + i + ": ");
		            int numero = scanner.nextInt();
		            if (numero >= 0 && numero <= 100) {
		                contadorEntreZeroECem++;
		            }
		        }

		        // Exibindo a quantidade de n�meros que est�o entre 0 e 100
		        System.out.println("A quantidade de n�meros entre 0 e 100 �: " + contadorEntreZeroECem);

		        scanner.close();
		    }
		}


	}

}
