package Familia51;

import java.util.Scanner;

public class JavaQExtra2 {

	public static void main(String[] args) {
		
		int dia,mes,ano,idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual o dia do seu aniversário? ");
		dia = leia.nextInt();
		
		System.out.println("\nQual o mês do seu aniversário? ");
		mes = leia.nextInt();
		
		System.out.println("\nQuantos anos você tem? ");
		ano = leia.nextInt();
		
		idade = dia + (mes * 30) + (ano * 365);
		System.out.println("\nVocê já viveu "+idade+ " dias");
		
		// TODO Auto-generated method stub

	}

}
