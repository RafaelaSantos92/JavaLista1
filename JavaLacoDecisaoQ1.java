package Familia51;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class JavaLacoDecisaoQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com o Terceiro número: ");
		c = leia.nextInt();
		
		if(a>b && b>c)
		{
		System.out.println("\nO maior valor é: "+a);
		}
		else if(b>a && b>c)
		{
		System.out.println("\nO maior valor é: "+b);
		}
		else
		{
		System.out.println("\nO maior valor é: "+c);
		}
			

	}

}
