package Exercicios2;

import java.util.Scanner;

public class potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nPor favor, digite o primeiro número: ");
		double n1 = ler.nextDouble();
		System.out.println("\nPor favor, digite o segundo número: ");
		double n2 = ler.nextDouble();
		System.out.println("\nPor favor, digite o terceiro número: ");
		double n3 = ler.nextDouble();
		System.out.println("\nPor favor, digite o quarto número: ");
		double n4 = ler.nextDouble();
		
		System.out.println("\nAgora iremos calcular o quadrado dos números inseridos.");
		
		double r1 = Math.pow(n1,2);
		double r2 = Math.pow(n2,2);
		double r3 = Math.pow(n3,2);
		double r4 = Math.pow(n4,2);
		
		if(r3>1000)
		{
			System.out.println("\nO valor do quadrado do terceiro número é: "+r3);
		}
		else
		{
			System.out.println("\nOquadrado de "+n1+" é: "+r1);
			System.out.println("\nOquadrado de "+n2+" é: "+r2);
			System.out.println("\nOquadrado de "+n3+" é: "+r3);
			System.out.println("\nOquadrado de "+n4+" é: "+r4);
		}
	}

}
