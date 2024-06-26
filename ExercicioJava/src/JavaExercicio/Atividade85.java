package JavaExercicio;
import java.util.Scanner;
public class Atividade85 {
	

	public class MaiorMenorFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int maior = numero;
	        int menor = numero;
	        for (int i = 1; i < 10; i++) {
	            System.out.print("Digite um n�mero: ");
	            numero = scanner.nextInt();
	            if (numero > maior) {
	                maior = numero;
	            }
	            if (numero < menor) {
	                menor = numero;
	            }
				// Atividade85 cesar
	        }
	        System.out.println("O maior n�mero �: " + maior);
	        System.out.println("O menor n�mero �: " + menor);
	        scanner.close();
	    }
	}

}
