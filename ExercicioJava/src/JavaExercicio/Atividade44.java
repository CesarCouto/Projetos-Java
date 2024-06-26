package JavaExercicio;
import java.util.Scanner;

public class Atividade44 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        int contador = 0;
	        while (contador < 5) {
	            System.out.print("Digite o nome: ");
	            String nome = scanner.next();
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            somaIdades += idade;
	            contador++;
	        }
	        double media = somaIdades / 5.0;
			// Atividade44 cesar
	        System.out.println("A m�dia das idades �: " + media);
	        scanner.close();
	    }
	}


