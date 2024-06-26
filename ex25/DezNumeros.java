package JavaExercicio;

import java.util.Scanner;

public class DezNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 // Inicializa a soma em zero
        int soma = 0;
        
        // Loop para ler 10 números do usuário
        for (int i = 0; i < 10; i++) {
            // Solicita ao usuário para digitar um número
            System.out.print("Digite o número " + (i + 1) + ": ");
            // Lê um número do usuário e adiciona à soma
            int numero = teclado.nextInt();
            soma += numero;	
            System.out.println(soma);

        }
}
}