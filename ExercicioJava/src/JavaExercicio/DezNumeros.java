package JavaExercicio;

import java.util.Scanner;

public class DezNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 // Inicializa a soma em zero
        int soma = 0;
        
        // Loop para ler 10 n�meros do usu�rio
        for (int i = 0; i < 10; i++) {
            // Solicita ao usu�rio para digitar um n�mero
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            // L� um n�mero do usu�rio e adiciona � soma
            int numero = teclado.nextInt();
            soma += numero;	
            System.out.println(soma);

        }
}
}