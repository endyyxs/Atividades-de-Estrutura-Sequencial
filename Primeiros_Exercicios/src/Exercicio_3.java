import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o numero de horas trabalhadas?");
		int horas = sc.nextInt();
		
		System.out.println("Qual é o valor recebido por hora?");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.printf("Seu salario e: %.2f", salario);
		
		sc.close();
	}

}
