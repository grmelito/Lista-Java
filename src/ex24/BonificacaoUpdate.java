package ex24;

public class BonificacaoUpdate {
		private String nome;
		private Double salario;
		private Double bonificacao;
		private Integer Colaboradortipo;
		private static Double Totalgastos = 0.0;
		
		public BonificacaoUpdate(String nome, Double salario, Integer Colaboradortipo) {
	        this.nome = nome;
	        this.salario = salario;
	        this.Colaboradortipo = Colaboradortipo;   
	        
	        switch(Colaboradortipo){
            case 1:
                this.bonificacao = (salario * 2);
                break;
            case 2:
                this.bonificacao = (salario * 3);
                break;
            case 3:
                this.bonificacao = (salario * 0.5);
                break;
            case 4:
                this.bonificacao = (salario * 0.8);
                break; 
               }
	        Totalgastos += this.bonificacao;
	        
	    }
		

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Double getSalario() {
	        return salario;
	    }

	    public void setSalario(Double salario) {
	        this.salario = salario;
	    }

	    public Integer getColaboradortipo() {
			return Colaboradortipo;
		}

		public void setColaboradortipo(Integer Colaboradortipo) {
			this.Colaboradortipo = Colaboradortipo;
		}

		public Double getBonificacao() {
	        return bonificacao;
	    }

	    public void setBonificacao(Double bonificacao) {
	        this.bonificacao = bonificacao;
	    }

	    public static Double getTotalgastos() {
	        return Totalgastos;
	    }
}
