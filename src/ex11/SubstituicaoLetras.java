package ex11;

import javax.swing.JOptionPane;

public class SubstituicaoLetras {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		if(palavra.contains("a")) {
			String palavraAlt = palavra.replace("a", "o");
			JOptionPane.showMessageDialog(null, "Palavra alterada: " + palavraAlt);
			
		}else {
			JOptionPane.showMessageDialog(null, "Digite uma palavra que tenha letras A.");
		}

	}

}
