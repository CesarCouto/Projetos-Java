package JavaExercicio;
import java.util.Scanner;
public class USD {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitando o valor da cotação do dólar
		        System.out.print("Digite o valor da cotação do dólar (em R$): ");
		        double cotacaoDolar = scanner.nextDouble();

		        // Solicitando a quantidade de dólares disponíveis com o usuário
		        System.out.print("Digite a quantidade de dólares (US$) disponíveis: ");
		        double quantidadeDolares = scanner.nextDouble();

		        // Calculando o valor em reais
		        double valorEmReais = quantidadeDolares * cotacaoDolar;

		        // Exibindo o resultado
		        System.out.println("O valor em reais (R$) é: " + String.format("%.2f", valorEmReais));

		        scanner.close();
		    }
		


	}


