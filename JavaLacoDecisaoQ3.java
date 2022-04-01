package Familia51;

import java.util.Scanner;

public class JavaLacoDecisaoQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nSua categoria é: Infantil.");
		}
		if(idade>=15 && idade <=17)
		{
			System.out.println("\nSua categoria é: Juvenil. ");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nSua categoria é: Adulto");
		}
		else 
		{
			System.out.println("\nErro!");
		}
	}

}
