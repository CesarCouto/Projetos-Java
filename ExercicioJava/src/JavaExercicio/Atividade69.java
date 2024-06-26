package JavaExercicio;
import java.util.Scanner;
public class Atividade69 {
	
	// Atividade69 cesar
	public class MediaNumerosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        for (int contador = 0; contador < 5; contador++) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	        }
	        double media = soma / 5.0;
	        System.out.println("A m�dia aritm�tica �: " + media);
	        scanner.close();
	    }
	}

}
