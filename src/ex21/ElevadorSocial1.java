package ex21;

public class ElevadorSocial1 {
		private int andarAtual;
		private int qtdPessoas;
		
		public ElevadorSocial1(int andarAtual, int qtdPessoas) {
			this.andarAtual = andarAtual;
			this.qtdPessoas = qtdPessoas;
		}
	
		public void  subirAndar() {
			this.andarAtual++;
		}
		
		public void  descerAndar() {
			this.andarAtual--;
		}
		
		public void  qtdAumentar() {
			this.qtdPessoas++;
		}
		
		public void  qtdDiminuir() {
			this.qtdPessoas--;
		}

		public void escolherAndar(int andarAtual) {
			this.andarAtual = andarAtual;
		}
		
		public int getAndarAtual() {
			return andarAtual;
		}

		public void setAndarAtual(int andarAtual) {
			this.andarAtual = andarAtual;
		}

		public int getQtdPessoas() {
			return qtdPessoas;
		}

		public void setQtdPessoas(int qtdPessoas) {
			this.qtdPessoas = qtdPessoas;
		}
		
		
	}
