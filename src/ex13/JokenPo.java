package ex13;

import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		int jogador;
		int rodadas = 5;
		@SuppressWarnings("resource")
		Scanner mao = new Scanner(System.in);
		System.out.println("JokenPo Jogo");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Escolha uma jogada: ");
		jogador = mao.nextInt();
		
		switch(jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Jogada invalida");
			
		}
		
		int computador = (int)(Math.random()*3+1);
		switch(computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		default:
			System.out.println("Jogada invalida");
		}
		for(int i = 0; i < rodadas; i++) {
		if(jogador != computador) {
			if((jogador==1 && computador==3) || (jogador==2 && computador==1) || (jogador==3 && computador==2)) {
				System.out.println("Você venceu");
				
			}else {
				System.out.println("Computador venceu");
			}
		}else {
			System.out.println("Empate");
		}
	}

}
}
