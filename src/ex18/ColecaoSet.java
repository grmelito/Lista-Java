package ex18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(2);
		numeros.add(4);
		numeros.add(5);
		numeros.add(3);
		numeros.add(2);
		numeros.add(8);
		numeros.add(3);
		numeros.add(2);
		numeros.add(9);
		numeros.add(10);
		
		System.out.println("Conteudo do set: ");
		Iterator<Integer> numerosAsIterator = numeros.iterator();
		while (numerosAsIterator.hasNext()) {
			System.out.println(numerosAsIterator.next());
			
		}
			
			System.out.println("Elementos no set: " + numeros.size());
			System.out.println("O set não retorna valores iguais dos elementos nele.");
		
		}

	}


