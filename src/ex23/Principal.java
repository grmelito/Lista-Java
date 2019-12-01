package ex23;

public class Principal {

	public static void main(String[] args) {
		Bonificacao colaborador1 = new Bonificacao("Marcos", 2000.00, 1);
		Bonificacao colaborador2 = new Bonificacao("Manoela", 2500.00, 1);
	    Bonificacao colaborador3 = new Bonificacao("Caio", 2250.00, 1);
	    Bonificacao colaborador4 = new Bonificacao("Simone", 3000.00, 1);
	    Bonificacao colaborador5 = new Bonificacao("Sanchez", 3000.00, 1);
	    Bonificacao colaborador6 = new Bonificacao("Bia", 1750.00, 1);
	    Bonificacao colaborador7 = new Bonificacao("Ana", 5250.00, 2);
	    Bonificacao colaborador8 = new Bonificacao("Rodrigo", 5100.00, 2);
	  
	    System.out.println("Total gasto na folha de pagamento: " + Bonificacao.getTotalgastos());

	}

}
