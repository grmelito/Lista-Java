package ex8;

import java.util.Scanner;

public class QtdLetras {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		System.out.println("Quantidade de letras: "+ palavra.length());

  }
}
