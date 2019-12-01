package ex6;

import java.util.Scanner;

public class LoopJava {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas vezes o loop deve executar: ");
		int x = scan.nextInt();
		
		for(int i = 0; i < x; i++) {
			System.out.println("Linguagem Java");
		}
	}

}
