package JavaExercicio;
import java.util.Scanner;
public class Mioresqueoito {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDeNumeros = 20;
		        int contadorMaioresQueOito = 0;

		        // Lendo 20 números do usuário e contando quantos são maiores do que 8
		        for (int i = 1; i <= numeroDeNumeros; i++) {
		            System.out.print("Digite o número " + i + ": ");
		            int numero = scanner.nextInt();
		            if (numero > 8) {
		                contadorMaioresQueOito++;
		            }
		        }

		        // Exibindo a quantidade de números maiores do que 8
		        System.out.println("A quantidade de números maiores do que 8 é: " + contadorMaioresQueOito);

		        scanner.close();
		    }
		


	

}
