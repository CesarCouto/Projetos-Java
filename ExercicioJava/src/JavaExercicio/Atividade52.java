package JavaExercicio;
import java.util.Scanner;

public class Atividade52 {
	
	public class NumerosParesDoWhile {
	    public static void main(String[] args) {
	        int numero = 1;
	        do {
	            if (numero % 2 == 0) {
	                System.out.println(numero);
	            }
	            numero++;
	        } while (numero <= 50);
	    }
	}

}