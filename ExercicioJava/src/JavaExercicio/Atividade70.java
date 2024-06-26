package JavaExercicio;
import java.util.Scanner;
public class Atividade70 {

	// Atividade70 cesar
	public class TabuadaFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        for (int contador = 1; contador <= 10; contador++) {
	            System.out.println(numero + " x " + contador + " = " + (numero * contador));
	        }
	        scanner.close();
	    }
	}

}
