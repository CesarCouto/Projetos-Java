package JavaExercicio;
import java.util.Scanner;
public class Atividade21 {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);
		        // Atividade21 cesar
		        System.out.print("Digite o n�mero de pessoas no grupo: ");
		        int numeroDePessoas = scanner.nextInt();
		        
		        int menoresDeIdade = 0;
		        int maioresDeIdade = 0;
		        
		        for (int i = 0; i < numeroDePessoas; i++) {
		            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
		            int idade = scanner.nextInt();
		            
		            if (idade < 18) {
		                menoresDeIdade++;
		            } else {
		                maioresDeIdade++;
		            }
		        }
		        
		        System.out.println("Menores de idade: " + menoresDeIdade);
		        System.out.println("Maiores de idade: " + maioresDeIdade);
		        
		        scanner.close();
		    }
		}


