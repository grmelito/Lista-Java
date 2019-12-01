package ex20;

import java.util.*;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
	        Map<Integer, String> mapcorredores = new HashMap<>();
	        mapcorredores.put(1, "Gabriel");
	        mapcorredores.put(2, "Gabriela");
	        mapcorredores.put(3, "Steve");
	        
	        Map<Integer, Integer> mapcolocacao = new HashMap<>();        
	        
	        for (Integer idCorredor : mapcorredores.keySet()) {
	            mapcolocacao.put(idCorredor, Gerador.gerar());
	             
	        }
	        Integer buscarIdCorredor = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para consultar a posição do corredor."));
	        JOptionPane.showMessageDialog(null, "Corredor: " + mapcorredores.get(buscarIdCorredor) + " Posição: " + mapcolocacao.get(buscarIdCorredor));
	        
		 
			
	}
}
	
	
