package ex17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		List<Integer> salarios = new ArrayList<Integer>();
		
		salarios.add(2330);
		salarios.add(2500);
		salarios.add(8730);
		salarios.add(9200);
		salarios.add(5000);
		salarios.add(4345);
		salarios.add(8793);
		salarios.add(2000);
		salarios.add(3810);
		salarios.add(7750);
		
		salarios.remove(2);
		salarios.remove(6);
		
		for(int i = 0; i < salarios.size(); i++) {
			System.out.println(salarios.get(i));
			
		}

		
		System.out.println("Salarios na lista: " + salarios.size());
		Collections.sort(salarios);
		System.out.println("Salarios ordenados: " + salarios);
		
		
	}

}
