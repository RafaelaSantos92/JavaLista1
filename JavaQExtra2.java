package Familia51;

import java.util.Scanner;

public class JavaQExtra2 {

	public static void main(String[] args) {
		
		int dia,mes,ano,idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual o dia do seu anivers�rio? ");
		dia = leia.nextInt();
		
		System.out.println("\nQual o m�s do seu anivers�rio? ");
		mes = leia.nextInt();
		
		System.out.println("\nQuantos anos voc� tem? ");
		ano = leia.nextInt();
		
		idade = dia + (mes * 30) + (ano * 365);
		System.out.println("\nVoc� j� viveu "+idade+ " dias");
		
		// TODO Auto-generated method stub

	}

}
