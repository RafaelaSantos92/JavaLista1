package Familia51;

import java.util.Scanner;

public class lacoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nMenu de Elogios!!");
		
		System.out.println("\nEscolha qual ser� o seu elogio....");
		System.out.println("\n1. Acolhedora");
		System.out.println("\n2. Unida");
		System.out.println("\n3. Familia inteligente");
		System.out.println("\n4. Animada");
		System.out.println("\nPor favor, escolha a sua op��o: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nVoc�s s�o Acolhedores");
			break;
		case 2:
			System.out.println("\nVoc�s s�o Unides");
			break;
		case 3:
			System.out.println("\nVoc�s s�o uma familia inteligente");
			break;
		case 4:
			System.out.println("\nVoc�s s�o animades");
			break;
		default:
			System.out.println("\nDesculpa, voc� escolheu op��o inv�lida!");
			
		}

	}

}
