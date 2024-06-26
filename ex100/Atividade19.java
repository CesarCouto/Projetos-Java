package JavaExercicio;
import java.util.Scanner;
public class Atividade19 {

	public static void main(String[] args) {

				// Atividade19 cesar
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite a primeira nota: ");
		        double nota1 = scanner.nextDouble();
		        
		        System.out.print("Digite a segunda nota: ");
		        double nota2 = scanner.nextDouble();
		        
		        System.out.print("Digite a terceira nota: ");
		        double nota3 = scanner.nextDouble();
		        
		        double media = (nota1 + nota2 + nota3) / 3;
		        
		        if (media >= 7) {
		            System.out.println("Aluno aprovado com m�dia: " + media);
		        } else {
		            System.out.println("Aluno reprovado com m�dia: " + media);
		        }
		        
		        scanner.close();
		    }
		}


