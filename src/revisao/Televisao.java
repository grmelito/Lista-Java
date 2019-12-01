package revisao;

public class Televisao {
	private int canalAtual;
	private int volumeAtual;
	
	public Televisao(int canalInicial, int volumeInicial) {
		canalAtual = canalInicial;
		volumeAtual = volumeInicial;
	}

	public void aumentarVolume() {
		volumeAtual++;
	}
	
	public void diminuirVolume() {
		volumeAtual--;
	}
	
	public void aumentarCanal() {
		canalAtual++;
	}
	
	public void diminuirCanal() {
		canalAtual--;
	}
	
	public int getCanalAtual(){
		return canalAtual;
	}
	
	public int getVolumeAtual(){
		return volumeAtual;
	}
	
}
