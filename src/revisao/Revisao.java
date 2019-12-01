package revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class Revisao {

	public static void main(String[] args) {
		
		//Declaracao de variavel do tipo String
		String numeroStr = "10";
		
		//Conversao de String para int
		int numero = Integer.parseInt(numeroStr);
		
		//Conversao de String para double
		double numeroDecimal = Double.parseDouble(numeroStr);
		System.out.println("Numero convertido para double: "+numeroDecimal);
		System.out.println("------------------------------------------------");
		
		System.out.println("--- if - else -------------------------------------");
		if(numero > 10) {
			// executa esse bloco se a condicao dentro do parenteses for verdadeira
			System.out.println("maior que 10");
		}else {
			// executa esse bloco se a condicao dentro do parenteses for falsa
			System.out.println("nao e maior que 10");
		}
		
		System.out.println("--- if - else - if --------------------------------");
		if(numero > 10) {
			// executa esse bloco se a condicao dentro do parenteses for verdadeira
			System.out.println("maior que 10");
		}else if(numero == 10){
			// executa esse bloco se a condicao dentro do parenteses for falsa
			System.out.println("numero igual a 10");
		}else {
			System.out.println("numero menor que 10");
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println(" --- for ----------------------------------------------");
		// executa esse for ate que i seja menor que 3
		for(int i=0; i < 3; i++) {
			System.out.println("Bloco executado porque a condicao eh verdadeira");
			// concatenacao de texto com variavel
			System.out.println("valor do i: "+i);
			if(i >= 2) {
				System.out.println("maior ou igual a 2");
			}
		}
		System.out.println(" --------------------------------------------------------");
		
		System.out.println("-- while ------------------------------------------------");
		int x = 0;
		while(x < 3) {
			x++;
			System.out.println("Valor de x: "+x);
		}
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("--- do while ---------------------------------------------");
		do {
			x++;
			System.out.println("Valor de x: "+x);
		} while(x < 6);
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("---- Array -------------------------------------------------");
		// Array: declaracao, instanciacao e atribuicao de valores em uma unica linha
		int[] arrayDado = {1, 3, 10, 20, 2, 1, 2, 5};
		String[] arrayString = {"um", "dois", "tres"};
		
		
		//pega a terceira posicao do array porque o indice com em 0
		System.out.println("Terceira posicao do arrayDado: "+arrayDado[2]);
		
		//pega a segunda posicao do array porque o indice com em 0
		System.out.println("Segunda posicao do arrayString: "+arrayString[1]);
		
		String valor = JOptionPane.showInputDialog("Por favor, digite a posicao do array");
		int valorNumerico = Integer.parseInt(valor);
		// pega a posicao do array subtraindo 1 do valor da variavel
		System.out.println("Posicao solicitada pelo usuario: "+valorNumerico);
		System.out.println("Valor contido na posicao solicitada pelo usuario: "+arrayDado[valorNumerico - 1]);
		
		// percorre o array ate o seu tamanho
		for(int w = 0; w < arrayDado.length; w++) {
			System.out.println("Posicao do array: "+ w +" - valor contido na posicao: "+arrayDado[w]);
		}
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("---- List ----------------------------------------------");
		//List
		// Garante a ordem e permite duplicacao
		List<String> lista = new ArrayList<>();
		lista.add("texto1");
		lista.add("texto2");
		lista.add("texto3");
		lista.add("texto4");
		for(String valorDaLista:lista) {
			System.out.println("Valor da lista antes de remover: "+valorDaLista);
		}
		lista.remove(2);
		for(String valorDaLista:lista) {
			System.out.println("Valor da lista depois de remover: "+valorDaLista);
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("---- Set ---------------------------------------------------");
		//Set
		// Nao garante a ordem e nao permite duplicacao
		Set<String> conjunto = new HashSet<>();
		conjunto.add("texto1");
		conjunto.add("texto2");
		conjunto.add("texto3");
		conjunto.add("texto4");
		for(String valorDoConjunto:conjunto) {
			System.out.println("Valor do conjunto: "+valorDoConjunto);
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("---- Map ---------------------------------------------------");
		//Map
		//Colecao chave-valor, onde armazenos os valores relacionados a sua respectiva chave
		// e recupero esses valores pela sua chave
		Map<Integer,String> mapa = new HashMap<>();
		mapa.put(1, "um");
		mapa.put(2, "dois");
		mapa.put(3, "tres");
		mapa.put(4, "quatro");
		
		System.out.println("Chave: 2 - Valor do mapa : "+mapa.get(2));
		System.out.println("------------------------------------------------------------");
		
						
	}

}
