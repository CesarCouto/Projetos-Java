package JavaExercicio;
import java.util.Scanner;
public class Atividade29 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade29 cesar
	        System.out.print("Digite o nome do aluno: ");
	        String nome = scanner.next();

	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        if (nota >= 7) {
	            System.out.println(nome + " est� aprovado.");
	        } else {
	            System.out.println(nome + " est� em recupera��o.");
	        }

	        scanner.close();
	    }
	}


