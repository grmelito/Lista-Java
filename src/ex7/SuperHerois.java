package ex7;

import java.util.*;


public class SuperHerois {

	public static void main(String[] args) {
		 
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String[] Herois = new String [5];
			Herois[0] = "Robert Downey Jr.";
			Herois[1] = "Mark Ruffalo";
			Herois[2] = "Chris Evans";
			Herois[3] = "Scarlett Johansson";
			Herois[4] = "Chris Hemsworth";
			
			System.out.println("Digite o nome do seu heroi: ");
			String nome = scan.nextLine();
			switch(nome) {
			case "Homem de Ferro":
				System.out.println("Nome do ator: " + Herois[0]);
				break;
			case "Hulk":
				System.out.println("Nome do ator: " + Herois[1]);
				break;
			case "Capitao America":
				System.out.println("Nome do ator: " + Herois[2]);
				break;
			case "Viuva Negra":
				System.out.println("Nome da atriz: " + Herois[3]);
				break;
			case "Thor":
				System.out.println("Nome do ator: " + Herois[4]);
				break;
				
			}
			
			

	}

}
