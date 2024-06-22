package JavaExercicio;
import java.util.Scanner;
public class graus {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Lendo a temperatura em graus Celsius
		        System.out.print("Digite a temperatura em graus Celsius: ");
		        double celsius = scanner.nextDouble();

		        // Convertendo a temperatura para graus Fahrenheit
		        double fahrenheit = (9 * celsius + 160) / 5;

		        // Exibindo o resultado
		        System.out.println("A temperatura em graus Fahrenheit é: " + String.format("%.2f", fahrenheit));

		        scanner.close();
		    }
		


	}

}
