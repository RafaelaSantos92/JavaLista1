package Familia51;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class JavaLacoDecisaoQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com o Terceiro n�mero: ");
		c = leia.nextInt();
		
		if(a>b && b>c)
		{
		System.out.println("\nO maior valor �: "+a);
		}
		else if(b>a && b>c)
		{
		System.out.println("\nO maior valor �: "+b);
		}
		else
		{
		System.out.println("\nO maior valor �: "+c);
		}
			

	}

}
