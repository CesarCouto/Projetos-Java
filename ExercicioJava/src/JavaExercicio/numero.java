package JavaExercicio;
import java.util.Scanner;
public class numero {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDeNumeros = 20;
		        int contadorEntreZeroECem = 0;
		        int contadorEntreCentoEUmEDuzentos = 0;
		        int contadorMaioresQueDuzentos = 0;

		        // Lendo 20 números do usuário e contando quantos estão em cada intervalo
		        for (int i = 1; i <= numeroDeNumeros; i++) {
		            System.out.print("Digite o número " + i + ": ");
		            int numero = scanner.nextInt();
		            if (numero >= 0 && numero <= 100) {
		                contadorEntreZeroECem++;
		            } else if (numero >= 101 && numero <= 200) {
		                contadorEntreCentoEUmEDuzentos++;
		            } else if (numero > 200) {
		                contadorMaioresQueDuzentos++;
		            }
		        }

		        // Exibindo a quantidade de números em cada intervalo
		        System.out.println("A quantidade de números entre 0 e 100 é: " + contadorEntreZeroECem);
		        System.out.println("A quantidade de números entre 101 e 200 é: " + contadorEntreCentoEUmEDuzentos);
		        System.out.println("A quantidade de números maiores que 200 é: " + contadorMaioresQueDuzentos);

		        scanner.close();
		    }
		}


	}

}
