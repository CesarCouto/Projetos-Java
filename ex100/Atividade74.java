package JavaExercicio;
import java.util.Scanner;
public class Atividade74 {
	
	// Atividade74 cesar
	public class MediaIdadesFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        for (int contador = 0; contador < 5; contador++) {
	            System.out.print("Digite o nome: ");
	            String nome = scanner.next();
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            somaIdades += idade;
	        }
	        double media = somaIdades / 5.0;
	        System.out.println("A m�dia das idades �: " + media);
	        scanner.close();
	    }
	}

}
