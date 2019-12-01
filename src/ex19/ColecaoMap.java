package ex19;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String , Integer> mapaSalario = new HashMap<String, Integer>(); 
	    mapaSalario.put("111111111", 2500);
	    mapaSalario.put("222222222", 4566);
	    mapaSalario.put("333333333", 1370);
	    mapaSalario.put("444444444", 2000);
	    mapaSalario.put("555555555", 6455);
	    mapaSalario.put("666666666", 3121);
	    mapaSalario.put("777777777", 8000);
	    mapaSalario.put("888888888", 8755);
	    mapaSalario.put("999999999", 5400);
	    mapaSalario.put("101010101", 2908);
	    
	    mapaSalario.remove("222222222");
	    mapaSalario.remove("555555555");
	    
	    for(String cpf : mapaSalario.keySet()) {
	    	Integer salario = mapaSalario.get(cpf);
	    	System.out.println("CPF: " + cpf + "-" +"Salario: "+ salario);
	    	
	    }
	    System.out.println("Tamanho do mapa: " + mapaSalario.size());

	}

}
