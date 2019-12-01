package ex1;

import javax.swing.JOptionPane;

public class AreaRetangulo {

	public static void main(String[] args) {
		double base = 0;
	    double altura = 0;
	    double area = 0;
	    
	    String base1 = JOptionPane.showInputDialog("Informe o valor da base: ");
	    base = Integer.parseInt(base1);
	    String altura1 = JOptionPane.showInputDialog("Informe o valor da altura: ");
	    altura = Integer.parseInt(altura1);
	    
	    area = base * altura;
	    
	    JOptionPane.showMessageDialog(null, "O valor da area do quadrado é: " + area);

	}

}
