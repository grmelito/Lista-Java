package ex15;


public class ArrayDado {

	public static void main(String[] args) {
		int[] elementos = { 1, 2, 3, 6, 9, 12, 15, 20, 4, 17, 19, 33, 44, 55, 5, 2, 1 };

		System.out.println("Elementos no array: " + elementos.length);
		System.out.println("Quinto elemento: " + elementos[5]);
		System.out.println("Nono elemento: " + elementos[9]);
		
		for(double i = 0; i < 10; i++) {
			 
			 System.out.println("Gerado pelo for: " + elementos[(int)i]);
		 }
		
		double i = 0;
		while(i < 10) {
			
			 System.out.println("Gerado pelo while: " + elementos[(int)i]);
			 i++;
		 }
		
		double ido = 0;
		do {
			
			System.out.println("Gerado pelo do while: " + elementos[(int)ido]);
			ido++;
			
		} while(ido < 10);
	}

}
