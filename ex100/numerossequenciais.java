package JavaExercicio;
import java.util.Scanner;

public class numerossequenciais {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;
		        
		        System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");

		        // Loop para ler e somar os números até que um número negativo seja digitado
		        while (true) {
		            System.out.print("Digite um número: ");
		            int numero = scanner.nextInt();
		            
		            if (numero < 0) {
		                break; // Encerra o loop se o número digitado for negativo
		            }
		            
		            soma += numero; // Adiciona o número à soma total
		        }
		        
		        // Exibindo a soma dos números digitados (incluindo o negativo que encerrou o loop)
		        System.out.println("A soma dos números digitados (incluindo o negativo) é: " + soma);

		        scanner.close();
		    }
		}

	}

}
