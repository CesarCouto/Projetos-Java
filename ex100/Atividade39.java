package JavaExercicio;
import java.util.Scanner;
public class Atividade39 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade39 cesar
	        int soma = 0;
	        int contador = 0;
	        while (contador < 5) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            contador++;
	        }
	        double media = soma / 5.0;
	        System.out.println("A m�dia aritm�tica �: " + media);
	        scanner.close();
	    }
	}


