package JavaExercicio;
import java.util.Scanner;
public class USD {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitando o valor da cota��o do d�lar
		        System.out.print("Digite o valor da cota��o do d�lar (em R$): ");
		        double cotacaoDolar = scanner.nextDouble();

		        // Solicitando a quantidade de d�lares dispon�veis com o usu�rio
		        System.out.print("Digite a quantidade de d�lares (US$) dispon�veis: ");
		        double quantidadeDolares = scanner.nextDouble();

		        // Calculando o valor em reais
		        double valorEmReais = quantidadeDolares * cotacaoDolar;

		        // Exibindo o resultado
		        System.out.println("O valor em reais (R$) �: " + String.format("%.2f", valorEmReais));

		        scanner.close();
		    }
		


	}


