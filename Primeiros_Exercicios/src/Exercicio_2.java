import javax.swing.JOptionPane;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		String entrada1 = JOptionPane.showInputDialog("Valor do raio do circulo:");
		
		double raio = Double.parseDouble(entrada1);
		double area = Math.PI * Math.pow(raio, 2);
		String areacom4casasdec = String.format("%.4f", area);
		
		JOptionPane.showMessageDialog(null, "A area do circulo e: " + areacom4casasdec);
		
	}

}
