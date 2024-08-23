import javax.swing.JOptionPane;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Qual o valor do salario? ");
		
		double salario = Double.parseDouble(valor);
		
		double aumento = (salario * (15/100.00)) + salario;
		String aum3casasdec = String.format("%.2f", aumento);
		
		JOptionPane.showMessageDialog(null, "<html>Antigo salario: " + salario + "<br>Salario reajustado: " + aum3casasdec + "</html>");
	}

}
