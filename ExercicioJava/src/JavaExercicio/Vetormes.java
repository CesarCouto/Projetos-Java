package JavaExercicio;

public class Vetormes {

	public static void main(String[] args) {
		String mes[] = {"jan","fev","mar","abril","maio","jun","jul","ago","set","out","nov","dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < mes.length; i++) {
			System.out.println("O mes de " + mes[i] + " tem um total de " + tot[i] + " dias");
		}
	}

}
