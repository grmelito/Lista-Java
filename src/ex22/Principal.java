package ex22;

public class Principal {

	public static void main(String[] args) {
		
		TelevisaoSala televisaosala = new TelevisaoSala(54,10);
		TelevisaoCozinha televisaocozinha = new TelevisaoCozinha(8,5);
		TelevisaoFilhos televisaofilhos = new TelevisaoFilhos(30,20);
		TelevisaoCasal televisaocasal = new TelevisaoCasal(77,10);
		
		televisaosala.Aumentar();
		televisaocozinha.AumentarCanal(1);
		televisaofilhos.Diminuir(1);
		televisaocasal.DiminuirCanal(1);
		
		System.out.println("Canal TVSala: " + televisaosala.getCanalAtual());
		System.out.println("Volume TVSala: " + televisaosala.getVolumeAtual());
		System.out.println("Canal TVCozinha: " + televisaocozinha.getCanalAtual());
		System.out.println("Volume TVCozinha: " + televisaocozinha.getVolumeAtual());
		System.out.println("Canal TVFilhos: " + televisaofilhos.getCanalAtual());
		System.out.println("Volume TVFilhos: " + televisaofilhos.getVolumeAtual());
		System.out.println("Canal TVCasal: " + televisaocasal.getCanalAtual());
		System.out.println("Volume TVCasal: " + televisaocasal.getVolumeAtual());

	}

}
