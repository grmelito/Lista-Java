package ex22;

public class TelevisaoSala {
	private int canalAtual;
	private int volumeAtual;
	
	public TelevisaoSala(int canalAtual, int volumeAtual) {
		this.canalAtual = canalAtual;
        this.volumeAtual = volumeAtual;
		
	}
	
	public void  Aumentar() {
		this.volumeAtual++;
	}
	
	public void  mudarCanal(int Canal) {
		this.canalAtual++;
	}
	
	public void Diminuir(int volumeAtual) {
		this.volumeAtual--;
	}
	
	public void DiminuirCanal(int canalAtual){
		this.canalAtual--;
	}
	
	public void AumentarCanal(int canalAtual){
		this.canalAtual++;
	}
	
	
	
	public int getCanalAtual() {
		return canalAtual;
	}
	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}
	public int getVolumeAtual() {
		return volumeAtual;
	}
	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
}
