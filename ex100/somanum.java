package JavaExercicio;

import java.util.*;

public class somanum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha teu numero");
		int num1 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num2 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num3 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num4 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num5 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num6 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num7= scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num8 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num9 = scanner.nextInt();
		
		System.out.println("Escolha teu numero");
		int num10 = scanner.nextInt();
		
		int n[] = {num1, num2, num3,num4,num5,num6,num7,num8,num9,num10};
		
		int a = 0;
		for(int i = 0; i < 10; i++) {
			a += n[i];
		}
		System.out.println(a);
	}

}
