package revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Treino {
	
	public static void main(String[] args) {
	String nome = "10";
	
	int num1 = Integer.parseInt(nome);
	
	System.out.println("numeruzin:" + num1);
		
		if(num1 > 10) {
			System.out.println("Numeruzin é maior de 10");
			
		}else if(num1 == 10){
			System.out.println("Numeruzin é igual de 10");
			
		}else {
			System.out.println("Numeruzin é menor que 10");
		}
		
		System.out.println("----------------------------------");
		
		for(int i=0; i < 3; i++) {
			System.out.println("Bloco é verdade");
			System.out.println("valor do i: "+i);
			if(i >= 2) {
				System.out.println("maior ou igual a 2");
			}
		}
		
		System.out.println("----------------------------------");
		int x = 0;
		while(x < 3) {
			x++;
			System.out.println("Valor de x: "+x);
		}
		int l = 0;
		do {
			
			l++;
			System.out.println("Valor de l: "+l);
			
		}while(l < 6);
		
		int [] Arraynum = {5, 2, 12, 3, 7, 9, 10};
		
		System.out.println("Segunda posição da array: " + Arraynum[1]);
		System.out.println("Terceira posição da array: " + Arraynum[2]);
		
		String valor = JOptionPane.showInputDialog("Digite a posição da array: ");
		int posicao = Integer.parseInt(valor);
		System.out.println("Posicao solicitada pelo usuario: "+ posicao);
		System.out.println("Valor contido na posicao solicitada pelo usuario: "+Arraynum[posicao - 1]);
		
		for(int w = 0; w < Arraynum.length; w++) {
			System.out.println("Posicao do array: "+ w +" - valor contido na posicao: "+Arraynum[w]);
		}
		
		List<String> lista = new ArrayList<>();
		lista.add("texto1");
		lista.add("texto2");
		lista.add("texto3");
		
		System.out.println("Conteudo 1 da lista:" + lista);
		
		for(String valordaLista : lista) {
			System.out.println("Valor da lista:" + valordaLista);
		}
		lista.remove(2);
		for(String valordaLista : lista) {
			System.out.println("Valor da lista atualizada:" + valordaLista);
		}
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("teste1");
		conjunto.add("teste2");
		conjunto.add("teste3");
		conjunto.add("teste4");
		for(String valorDoConjunto:conjunto) {
			System.out.println("Valor do conjunto: "+valorDoConjunto);
		}
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Gabriel");
		mapa.put(2, "Maria");
		mapa.put(3, "Tania");
		mapa.put(4, "Augusto");
		
		System.out.println("Chave 2 do mapa: "+ mapa.get(2));
	}
}
	

