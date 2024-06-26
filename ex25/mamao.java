package JavaExercicio;
import java.util.Scanner;
public class mamao {

	public static void main(String[] args) {
	

	
		        Scanner scanner = new Scanner(System.in);

		        // Solicitando o valor da compra
		        System.out.print("Digite o valor da compra: R$ ");
		        double valorCompra = scanner.nextDouble();

		        // Calculando o valor de cada prestação
		        int numeroDePrestacoes = 5;
		        double valorPrestacao = valorCompra / numeroDePrestacoes;

		        // Exibindo o valor de cada prestação
		        System.out.println("O valor de cada uma das " + numeroDePrestacoes + " prestações é: R$ " + String.format("%.2f", valorPrestacao));

		        scanner.close();
		    }
		}


	


