package Exercicios2;

import java.util.Scanner;

public class variavelNumerica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite um valor: ");
		double variavel = ler.nextDouble();
		
		if(variavel>100)
		{
			System.out.println("\nO valor é: "+variavel);
		}
		else
		{
			System.out.println("\nValor igual a ZERO.");
		}
	}

}
