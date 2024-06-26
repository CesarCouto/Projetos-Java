package JavaExercicio;
import java.util.Scanner;
public class Atividade71 {
	
	// Atividade71 cesar
	public class DivisoresFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero inteiro positivo: ");
	        int numero = scanner.nextInt();
	        for (int divisor = 1; divisor <= numero; divisor++) {
	            if (numero % divisor == 0) {
	                System.out.println(divisor);
	            }
	        }
	        scanner.close();
	    }
	}

}
