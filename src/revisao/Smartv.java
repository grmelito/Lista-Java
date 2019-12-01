package revisao;

public class Smartv extends Televisao {
	
	public Smartv(int canalInicial, int volumeInicial) {
		super(canalInicial, volumeInicial);
		
	}

	private boolean estaNoNetflix;
	
	public void entrarNoNetflix() {
		estaNoNetflix = true;
	}
	
	public void sairDoNetflix() {
		estaNoNetflix = false;
	}
	
	public boolean estaNoNetflix() {
		return estaNoNetflix;
	}
	
	@Override
	public void aumentarCanal() {
		if(estaNoNetflix) {
			System.out.println("Voce esta no netflix, portanto nao pode aumentar o canal.");
		}else {
			super.aumentarCanal();
		}
	}
	
}
