package JavaExercicio;
import java.util.Scanner;
public class Atividade27 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade27 cesar
	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scanner.nextInt();
	        
	        System.out.print("Digite o sexo da pessoa (M/F): ");
	        char sexo = scanner.next().charAt(0);

	        if ((sexo == 'M' || sexo == 'm') && idade >= 65) {
	            System.out.println("Pode se aposentar.");
	        } else if ((sexo == 'F' || sexo == 'f') && idade >= 60) {
	            System.out.println("Pode se aposentar.");
	        } else {
	            System.out.println("N�o pode se aposentar.");
	        }

	        scanner.close();
	    }
	}


