package ex22;

public class TelevisaoCozinha {
	private int canalAtual;
	private int volumeAtual;
	
	public TelevisaoCozinha(int canalAtual, int volumeAtual) {
		this.canalAtual = canalAtual;
        this.volumeAtual = volumeAtual;
		
	}
	
	public void  Aumentar() {
		this.volumeAtual++;
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
