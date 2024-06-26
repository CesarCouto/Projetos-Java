package JavaExercicio;
import java.util.Scanner;
public class IdadeMenor {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numeroDePessoas = 10;

		        // Inicializando variáveis para armazenar o nome e a idade da pessoa mais nova
		        String nomeMaisNovo = "";
		        int idadeMaisNova = Integer.MAX_VALUE;

		        // Lendo o nome e a idade de 10 pessoas
		        for (int i = 1; i <= numeroDePessoas; i++) {
		            System.out.print("Digite o nome da pessoa " + i + ": ");
		            String nome = scanner.nextLine();
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

		            // Verificando se a pessoa atual é mais nova do que a mais nova encontrada até agora
		            if (idade < idadeMaisNova) {
		                idadeMaisNova = idade;
		                nomeMaisNovo = nome;
		            }
		        }

		        // Exibindo o nome da pessoa mais nova
		        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

		        scanner.close();
		    }
		}


	}

}
