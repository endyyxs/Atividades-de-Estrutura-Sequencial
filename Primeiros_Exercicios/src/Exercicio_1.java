import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] valores = new double[5];
		double soma = 0.0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Numero " + (i + 1) + ":");
			valores[i] = sc.nextDouble();
			soma += valores[i];
		}
		double media = soma/5;
		
		System.out.println("Valores digitados: ");
		for(int i = 0; i < 5; i++) {
			System.out.println("Numero " + (i + 1) + ":" + valores[i]);

		}
		
		System.out.println("Media: " + media);
		
		sc.close();
	}
}
