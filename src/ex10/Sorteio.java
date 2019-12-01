package ex10;
import java.util.*;

public class Sorteio {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int r =  (int)(Math.random()* 20);
		Integer[] sorteio = new Integer[2];
		System.out.println("Digite um numero:");
        sorteio[0] = (int) input.nextInt();
        sorteio[1] = r ;
        
        Integer sorteado = sorteio[(int)(Math.random() * sorteio.length)];
        System.out.println("O numero sorteado foi: " + sorteado);
        

}
	
}
