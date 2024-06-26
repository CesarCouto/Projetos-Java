package JavaExercicio;

public class vetor {

	public static void main(String[] args) {
		int n[] = new int[4];
		n[0] = 10;
		n[1] = 5;
		
		
		int b[] = {8,7,6,5,4,3,2,1};
		
		for(int i = 0; i <=7; i++) {
			System.out.println("Na posição " + i + " temos o valor " + b[i]);
		}
		
		int i = 0;
		while(i < b.length) {
			System.out.println("Na posição " + i + " temos o valor " + b[i]);
			i++;
		}
		
	}

}
