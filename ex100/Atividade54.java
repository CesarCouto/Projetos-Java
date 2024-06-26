package JavaExercicio;
import java.util.Scanner;
public class Atividade54 {
	
	// Atividade54 cesar
	public class MediaNumerosDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int contador = 0;
	        do {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            contador++;
	        } while (contador < 5);
	        double media = soma / 5.0;
	        System.out.println("A m�dia aritm�tica �: " + media);
	        scanner.close();
	    }
	}

}
