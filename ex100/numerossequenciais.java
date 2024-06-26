package JavaExercicio;
import java.util.Scanner;

public class numerossequenciais {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;
		        
		        System.out.println("Digite uma sequ�ncia de n�meros (digite um n�mero negativo para encerrar):");

		        // Loop para ler e somar os n�meros at� que um n�mero negativo seja digitado
		        while (true) {
		            System.out.print("Digite um n�mero: ");
		            int numero = scanner.nextInt();
		            
		            if (numero < 0) {
		                break; // Encerra o loop se o n�mero digitado for negativo
		            }
		            
		            soma += numero; // Adiciona o n�mero � soma total
		        }
		        
		        // Exibindo a soma dos n�meros digitados (incluindo o negativo que encerrou o loop)
		        System.out.println("A soma dos n�meros digitados (incluindo o negativo) �: " + soma);

		        scanner.close();
		    }
		}

	}

}
