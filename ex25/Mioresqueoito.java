package JavaExercicio;
import java.util.Scanner;
public class Mioresqueoito {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDeNumeros = 20;
		        int contadorMaioresQueOito = 0;

		        // Lendo 20 n�meros do usu�rio e contando quantos s�o maiores do que 8
		        for (int i = 1; i <= numeroDeNumeros; i++) {
		            System.out.print("Digite o n�mero " + i + ": ");
		            int numero = scanner.nextInt();
		            if (numero > 8) {
		                contadorMaioresQueOito++;
		            }
		        }

		        // Exibindo a quantidade de n�meros maiores do que 8
		        System.out.println("A quantidade de n�meros maiores do que 8 �: " + contadorMaioresQueOito);

		        scanner.close();
		    }
		


	

}
