package JavaExercicio;
import java.util.Scanner;
public class Atividade58 {
	

	public class FibonacciDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int a = 0, b = 1;
	        do {
	            System.out.println(a);
	            int temp = a;
	            a = b;
	            b = temp + b;
	        } while (a <= numero);
	        scanner.close();
	    }
	}

}
