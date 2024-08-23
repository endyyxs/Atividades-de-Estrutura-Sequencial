import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual e o seu nome?");
		String data = JOptionPane.showInputDialog("Qual e o seu ano de nascimento?");
		
		int datanasc = Integer.parseInt(data);
		int idade = 2024 - datanasc;
		
		JOptionPane.showMessageDialog(null, "Você se chama " + nome + " e possui " + idade + " anos de idade!");

	}

}
