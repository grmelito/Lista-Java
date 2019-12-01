package ex5;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero");
		int n2 = scan.nextInt();
		System.out.println("Digite o terceiro numero");
		int n3 = scan.nextInt();
		
		if(n1 > n2 && n1> n3) {
			System.out.println("O maior numero é: " + n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior numero é: " + n2);
		}else if(n3 > n1 && n3 > n2) {
			System.out.println("O maior numero é: " + n3);
		}

	}

}
