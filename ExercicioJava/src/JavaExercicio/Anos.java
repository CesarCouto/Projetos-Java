package JavaExercicio;

import java.util.Scanner;

public class Anos {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a idade em anos, meses e dias:");

	        System.out.print("Anos: ");
	        int anos = scanner.nextInt();

	        System.out.print("Meses: ");
	        int meses = scanner.nextInt();

	        System.out.print("Dias: ");
	        int dias = scanner.nextInt();

	        scanner.close();

	        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

	        System.out.println("A idade em dias é: " + idadeEmDias);
	    }


	    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
	        
	        int idadeEmDias = anos * 365 + meses * 30 + dias;
	        return idadeEmDias;
	    }
	

	}


