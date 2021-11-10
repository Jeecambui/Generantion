package Exercicios2;

import java.util.Scanner;

public class numeroCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEntre com o primeiro número número");
		double n1 = ler.nextDouble();
		System.out.println("\nEntre com o segundo número número");
		double n2 = ler.nextDouble();
		System.out.println("\nEntre com o terceiro número número");
		double n3 = ler.nextDouble();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println(n1+" "+n2+" "+n3);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println(n2+" "+n1+" "+n3);
		}
		else if(n3<=n2 && n2<=n1)
		{
			System.out.println(n3+" "+n2+" "+n1);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println(n1+" "+n3+" "+n2);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.println(n3+" "+n1+" "+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println(n2+"5 "+n1+" "+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.println(n2+" "+n3+" "+n1);
		}	
	}

}
