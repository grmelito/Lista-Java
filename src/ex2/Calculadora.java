package ex2;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int num1 = 0;
	    int num2 = 0;
	    int soma = 0;
	    
	    String n1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
	    num1 = Integer.parseInt(n1);
	    String selecionar = JOptionPane.showInputDialog("Escolha o tipo da operação: ");
	    String n2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
	    num2 = Integer.parseInt(n2);
	    
	    
	    switch(selecionar) {
	    case("+"):
	    	soma = num1 + num2;
	    	JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
	    	break;
	    case("-"):
	    	soma = num1 - num2;
	    	JOptionPane.showMessageDialog(null, "O valor da subtração é: " + soma);
	    	break;
	    case("*"):
	    	soma = num1 * num2;
	    	JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + soma);
	    	break;
	    case("/"):
	    	soma = num1 / num2;
	    	JOptionPane.showMessageDialog(null, "O valor da divisão é:  " + soma);
	    	break;
	    }
	    
	    

	}

}
