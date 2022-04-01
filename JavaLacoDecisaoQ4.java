package Familia51;

import java.util.Scanner;

public class JavaLacoDecisaoQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		double res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		x = leia.nextInt();
		
		
		
		
		if(x % 2 == 0)
		{
			res = Math.sqrt(x);
			System.out.println("\nO valor digitado é par e a raiz quadrada dele é: "+res);
		}
		
		else 
		{
			res = Math.pow(x, 2);
			System.out.println("\nO valor digitado é impar e ele elevado ao quadrado "+res);
		}

	}

}
