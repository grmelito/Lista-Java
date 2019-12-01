package revisao;

import revisao.Televisao;
import revisao.Smartv;

public class Principal {

	public static void main(String[] args) {
		
		Televisao tvSala = new Televisao(0, 0);
		Televisao tvQuarto = new Televisao(10, 15);
		Smartv tvVaranda = new Smartv(2, 15);
		
		tvSala.aumentarCanal();
		tvQuarto.aumentarVolume();
		
		System.out.println("TV da Sala - Canal atual: "+tvSala.getCanalAtual());
		System.out.println("TV do Quarto - Volume Atual: "+tvQuarto.getVolumeAtual());

	}

}
