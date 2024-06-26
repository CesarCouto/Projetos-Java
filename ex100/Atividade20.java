package JavaExercicio;
import java.util.Scanner;
public class Atividade20 {

	public static void main(String[] args) {
		
				// Atividade20 cesar
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();
		        
		        if (numero % 2 == 0) {
		            System.out.println("O n�mero " + numero + " � par.");
		        } else {
		            System.out.println("O n�mero " + numero + " � �mpar.");
		        }
		        
		        scanner.close();
		    }
		}



