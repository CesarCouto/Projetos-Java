package JavaExercicio;
import java.util.Scanner;

public class Atividade25 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Atividade25 cesar
	        System.out.print("Digite o n�mero de faltas do aluno: ");
	        int faltas = scanner.nextInt();
	        
	        if (faltas > 15) {
	            System.out.println("Aluno reprovado por falta.");
	        } else {
	            System.out.println("Aluno n�o reprovado por falta.");
	        }
	        
	        scanner.close();
	    }
	}


