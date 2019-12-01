package ex12;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
        int pontos = 1;
        int escolherNumeros[] = new int[2];
        String resultado;
        String jogadores[] = new String[2];
        String escolherParImpar[] = new String[2];
        
        System.out.println(" Jogo do Par ou Impar");
        
        for (int i = 0; i < jogadores.length;) {
            System.out.printf("Digite o nome do Jogador: ", i + 1);
            jogadores[i] = scan.nextLine();
            i++;
        }
        
        for (int j = 0; j < 5; j++) {
            System.out.printf("%1dº Rodada ", j + 1);
            
            for (int i = 0; i < escolherParImpar.length; i++) {
                System.out.println(jogadores[i] + ", escolha entre Par ou Impar?");
                escolherParImpar[i] = scan.next();
            }
            
            for (int k = 0; k < escolherNumeros.length; k++) {
                System.out.println(jogadores[k] + ", escolha um número :");
                escolherNumeros[k] = scan.nextInt();
                soma += escolherNumeros[k];
            }

            if (soma % 2 == 0) {
                resultado = "par";
            } else {
                resultado = "impar";
            }
            System.out.printf("%1dº Rodada ", j + 1);
            for (int l = 0; l < escolherParImpar.length; l++) {
                if (resultado.equals(escolherParImpar[l])) {
                    System.out.println("A soma deu: " + soma + ", " + resultado);
                    System.out.println("Ganahdor da partida: " + jogadores[l]);
                }
            }
	}
        
	}
}
