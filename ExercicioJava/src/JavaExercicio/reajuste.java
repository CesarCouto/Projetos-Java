package JavaExercicio;

import java.util.*;

public class reajuste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	       
        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        
        double reajuste = saldo * 0.015;
        double saldoReajustado = saldo + reajuste;

       
        System.out.printf("Saldo com reajuste de 1.5%%: %.2f%n", saldoReajustado);

       
        scanner.close();

	}

}
