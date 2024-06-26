package JavaExercicio;
import java.util.Scanner;
public class Atividade17 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        
				// Atividade17 cesar

		        System.out.print("Digite a idade da pessoa: ");
		        int idade = scanner.nextInt();
		        
		        if (idade >= 0 && idade <= 12) {
		            System.out.println("Crian�a");
		        } else if (idade >= 13 && idade <= 17) {
		            System.out.println("Adolescente");
		        } else if (idade >= 18 && idade <= 64) {
		            System.out.println("Adulto");
		        } else if (idade >= 65) {
		            System.out.println("Idoso");
		        } else {
		            System.out.println("Idade inv�lida");
		        }
		        
		        scanner.close();
		    }
		}


	}

}
