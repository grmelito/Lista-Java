package ex16;

public class ArrayCriado {

	public static void main(String[] args) {
		 double[] salarios;
		 salarios = new double [10];
		 salarios[0] = 2600;
		 salarios[1] = 1500;
		 salarios[2] = 4500;
		 salarios[3] = 120;
		 salarios[4] = 11600;
		 salarios[5] = 3000;
		 salarios[6] = 6578;
		 salarios[7] = 2313;
		 salarios[8] = 2222;
		 salarios[9] = 6788;
		 
		 System.out.println("Elementos no array: " + salarios.length);
		 System.out.println("Quinto salario: " + salarios[5]);
		 System.out.println("Nono salario: " + salarios[9]);
		 
		 for(double i = 0; i < 10; i++) {
			 
			 System.out.println("Gerado pelo for: " + salarios[(int)i]);
		 }
		 
		double i = 0;
		while(i < 10) {
			
			 System.out.println("Gerado pelo while: " + salarios[(int)i]);
			 i++;
		 }
		
		double ido = 0;
		do {
			
			System.out.println("Gerado pelo do while: " + salarios[(int)ido]);
			ido++;
			
		} while(ido < 10);

	}

}
