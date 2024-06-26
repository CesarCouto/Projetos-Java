package JavaExercicio;
import java.util.Scanner;

public class Atividade32 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade32 cesar
	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        String conceito;
	        if (nota >= 9) {
	            conceito = "A";
	        } else if (nota >= 7) {
	            conceito = "B";
	        } else if (nota >= 5) {
	            conceito = "C";
	        } else if (nota >= 3) {
	            conceito = "D";
	        } else {
	            conceito = "E";
	        }

	        System.out.println("A conceitua��o da nota �: " + conceito);

	        scanner.close();
	    }
	}


