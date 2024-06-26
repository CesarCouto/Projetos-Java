package JavaExercicio;
import java.util.*;
public class MediaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pessoas = 20;
		int somaidade = 0;
		
		for(int i = 1; i <= pessoas; i++) {
			System.out.println("Diga a idade da pessoa " + i + " :");
			int idade = scanner.nextInt();
			
			somaidade += idade;
		}
		
		int res = (somaidade / 2);
		System.out.println("A media das idades é: " + res);
		
		scanner.close();
	}

}
