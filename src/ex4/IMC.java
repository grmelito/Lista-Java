package ex4;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		float peso, altura, IMC;

		String str1 = JOptionPane.showInputDialog("Informe o seu peso: ");
		peso = Float.parseFloat(str1);

		String str2 = JOptionPane.showInputDialog("Informe a sua altura: ");
		altura = Float.parseFloat(str2);
		
		IMC = peso/(altura*altura);
		
		if(IMC <= 18) {
			JOptionPane.showMessageDialog(null,"Abaixo do peso. " + IMC);
		}else if(IMC >= 18.5 && IMC < 25) {
			JOptionPane.showMessageDialog(null,"Peso normal. " + IMC);
		}else if(IMC >= 25 && IMC < 30 ) {
			JOptionPane.showMessageDialog(null,"Acima do peso. " + IMC);
		}else if(IMC >= 30 && IMC <35) {
			JOptionPane.showMessageDialog(null,"Obesidade nivel 1. " + IMC);
		}else if(IMC >= 35 && IMC < 40) {
			JOptionPane.showMessageDialog(null,"Obesidade nivel 2. " + IMC);
		}else if(IMC >= 40)
			JOptionPane.showMessageDialog(null,"Obesidade nivel 3. " + IMC);
		}

	}


