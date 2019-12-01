package ex25;

public class Herois {
		private static Herois heroi;
		public static Herois nome = heroi;
		public static Herois empresa;
		public static Herois ator;
		
		
		public Herois getNome() {
			return nome;
		}
		public void setNome(Herois nome) {
			this.nome = nome;
		}
		public Herois getEmpresa() {
			return empresa;
		}
		public void setEmpresa(Herois empresa) {
			this.empresa = empresa;
		}
		public Herois getAtor() {
			return ator;
		}
		public void setAtor(Herois ator) {
			this.ator = ator;
		}
		
		
}
