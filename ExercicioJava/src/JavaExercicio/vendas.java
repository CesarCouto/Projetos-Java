package JavaExercicio;

import java.util.Scanner;

public class vendas {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

		    
		        System.out.print("Digite o nome do vendedor: ");
		        String nome = scanner.nextLine();

		
		        System.out.print("Digite o sal�rio fixo do vendedor: ");
		        double salarioFixo = scanner.nextDouble();

		   
		        System.out.print("Digite o total de vendas efetuadas pelo vendedor no m�s: ");
		        double totalVendas = scanner.nextDouble();

		       
		        double comissao = totalVendas * 0.15;

		        
		        double salarioFinal = salarioFixo + comissao;

		 
		        System.out.println("\nNome do Vendedor: " + nome);
		        System.out.println("Sal�rio Fixo: R$ " + String.format("%.2f", salarioFixo));
		        System.out.println("Sal�rio Final no M�s: R$ " + String.format("%.2f", salarioFinal));

		        scanner.close();
		    }
		}

}
