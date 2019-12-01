package ex3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDados {
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int num1 = 0;
        //String num1 = Integer.parseInt(args[0]);
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		scan.hasNextLine();
		
		String numero = JOptionPane.showInputDialog("Digite o terceiro numero: ");
	    int num3 = Integer.parseInt(numero);
		
	    soma = num1 + num3;
	    
	    if(soma > 10) {
	    	System.out.println("Maior que 10");
	    }else if(soma == 10) {
	    	System.out.println("Igual a 10");
	    }else if(soma < 10) {
	    	System.out.println("Menor que 10");
	    }
	}

	
}
