package JavaExercicio;
import java.util.Scanner;
public class Atividade15 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

				// Atividade15 cesar
		        
		        System.out.print("Digite o sal�rio atual do funcion�rio: ");
		        double salarioAtual = scanner.nextDouble();
		        
		        double novoSalario = salarioAtual * 1.15;
		        
		        System.out.printf("O novo sal�rio com aumento de 15%% �: %.2f\n", novoSalario);
		        
		        scanner.close();
		    }
		



}
