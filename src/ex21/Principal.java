package ex21;

import java.io.ObjectInputStream.GetField;

import ex22.TelevisaoSala;

public class Principal {

	public static void main(String[] args) {
		
		ElevadorServico elevadorservico = new ElevadorServico(10,5);
		ElevadorSocial1 elevadorsocial1 = new ElevadorSocial1(2,8);
		ElevadorSocial2 elevadorsocial2 = new ElevadorSocial2(3,2);

		elevadorservico.subirAndar();
		elevadorservico.subirAndar();
		elevadorservico.qtdDiminuir();
		elevadorservico.qtdDiminuir();
		elevadorservico.qtdAumentar();
		
		elevadorsocial1.descerAndar();
		elevadorsocial1.qtdDiminuir();
		elevadorsocial1.qtdDiminuir();
		elevadorsocial1.qtdDiminuir();
		elevadorsocial1.qtdAumentar();
		
		elevadorsocial2.escolherAndar(1);
		elevadorsocial2.qtdDiminuir();
		elevadorsocial2.qtdDiminuir();
		
		System.out.println("Elevador Serviço- Andar atual: " + elevadorservico.getAndarAtual());
		System.out.println("Elevador Serviço- Numero de pessoas: " + elevadorservico.getQtdPessoas());
		System.out.println("Elevador Social1- Andar atual: " + elevadorsocial1.getAndarAtual());
		System.out.println("Elevador Social1- Numero de pessoas: " + elevadorsocial1.getQtdPessoas());
		System.out.println("Elevador Social2- Andar atual: " + elevadorsocial2.getAndarAtual());
		System.out.println("Elevador Social2- Numero de pessoas: " + elevadorsocial2.getQtdPessoas());
		
	}

}
