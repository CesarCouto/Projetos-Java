package JavaExercicio;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		float n1 = valor.nextFloat();
		
		System.out.println("Entre com a primeira nota");
		float n2 = valor.nextFloat();
		
		System.out.println("Entre com a primeira nota");
		float n3 = valor.nextFloat();
		
		float media = (n1 + n2 + n3) / 3;
		
		if(media >=6) {
			System.out.println("O aluno esta aprovado sua media foi: " + media);
		}else if(media >=5) {
			System.out.println("O aluno esta em recuperação sua media foi: " + media);
		}else {
			System.out.println("O aluno esta reprovado sua media foi: " + media);
		}

	}

}
