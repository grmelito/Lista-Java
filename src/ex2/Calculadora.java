package ex2;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int num1 = 0;
	    int num2 = 0;
	    int soma = 0;
	    
	    String n1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
	    num1 = Integer.parseInt(n1);
	    String selecionar = JOptionPane.showInputDialog("Escolha o tipo da opera��o: ");
	    String n2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
	    num2 = Integer.parseInt(n2);
	    
	    
	    switch(selecionar) {
	    case("+"):
	    	soma = num1 + num2;
	    	JOptionPane.showMessageDialog(null, "O valor da soma �: " + soma);
	    	break;
	    case("-"):
	    	soma = num1 - num2;
	    	JOptionPane.showMessageDialog(null, "O valor da subtra��o �: " + soma);
	    	break;
	    case("*"):
	    	soma = num1 * num2;
	    	JOptionPane.showMessageDialog(null, "O valor da multiplica��o �: " + soma);
	    	break;
	    case("/"):
	    	soma = num1 / num2;
	    	JOptionPane.showMessageDialog(null, "O valor da divis�o �:  " + soma);
	    	break;
	    }
	    
	    

	}

}
