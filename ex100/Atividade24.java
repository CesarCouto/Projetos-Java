package JavaExercicio;
import java.util.Scanner;
import java.util.Arrays;

public class Atividade24 {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        // Atividade24 cesar
		        int[] numeros = new int[3];
		        
		        System.out.print("Digite o primeiro n�mero: ");
		        numeros[0] = scanner.nextInt();
		        
		        System.out.print("Digite o segundo n�mero: ");
		        numeros[1] = scanner.nextInt();
		        
		        System.out.print("Digite o terceiro n�mero: ");
		        numeros[2] = scanner.nextInt();
		        
		        Arrays.sort(numeros);
		        
		        System.out.println("N�meros em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
		        
		        scanner.close();
		    }
		}



