package Familia51;

import java.util.Scanner;

public class JavaQExtra1 {

	public static void main(String[] args) {
		
		double a,b,c,r,s,d;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um valor: ");
		a = leia.nextDouble();
		
		System.out.println("\nEntre com o segunto valor: ");
		b = leia.nextDouble();
				
		System.out.println("\nEntre com o terceiro valor: ");
		c = leia.nextDouble();
		
		if(a>0 && b>0 && c>0)
		{
			r = Math.pow((a+b), 2);
			s = Math.pow((b+c), 2);
			d = (r + s) / 2;
			
			System.out.println("\nO resultado da expressão é: "+d);
			
		}
		else 
		{
			System.out.println("\nNenhum dos valores inseridos podem ser negativos! Tente novamente.");
		}
		// TODO Auto-generated method stub

	}

}
