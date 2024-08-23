import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual e o nome do produto?");
		String nome = sc.next();
		
		System.out.println("Qual e o valor do produto?");
		double valor = sc.nextDouble();
		
		System.out.println("Qual e o desconto a ser aplicado?");
		int desc = sc.nextInt();
		
		double descaplic = valor * (desc/100.000);
		
		System.out.println("Nome do produto: " + nome);
		System.out.println("Antigo preco: " + valor);
		System.out.printf("Preco com desconto: %.3f", valor - descaplic);

		sc.close();
	}

}
