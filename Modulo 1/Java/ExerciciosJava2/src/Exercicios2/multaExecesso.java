package Exercicios2;

import java.util.Scanner;

public class multaExecesso {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nInsira o valor do peso: ");
		double peso = ler.nextDouble();
		double pesoTomate =50;
		double multa = 4.00;
		
		if(peso<=50)
		{
			System.out.println("\nPeso não excedico, total a pagar é: "+peso);
		} 
		else
		{
			System.out.println("\nPeso execedido, iremos calcular a multa por excesso de peso.");
			System.out.println("\nValor da multa por quilo é 4,00 reais");
			double excesso =(peso - pesoTomate) * multa;
			System.out.println("\n\tValor da multa: "+excesso+" reais");
		}
	}

}
