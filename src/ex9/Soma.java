package ex9;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		
		int num = 0;
	    int soma = 0;
	    
	    
	    for(; num >= 0;) {
	    	 String numero = JOptionPane.showInputDialog("Digite um numero");
	 	     num = Integer.parseInt(numero);
	 	     soma += num;
	    }
	   
	    System.out.println("A soma dos numeros foi de:" + soma);
	    
	    
	    
	    
	}

}
