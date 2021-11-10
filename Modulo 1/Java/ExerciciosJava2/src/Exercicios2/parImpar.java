package Exercicios2;

import java.util.Scanner;

public class parImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite um número: ");
		double numero = ler.nextDouble();
		
		if (numero%2 == 0)
		{
			System.out.println("Esse número é par.");
			numero = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do número par é: "+numero);
		}
		else 
		{
			System.out.println("\nEsse número é ímpar.");
			numero = Math.pow(numero,2);
			System.out.println("\nO quadrado do numero ímpar é: "+numero);
		}
	}

}
