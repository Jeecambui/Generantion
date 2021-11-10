package Exercicios2;

import java.util.Scanner;

public class salarioExcedente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com seu código: ");
		int codigo = ler.nextInt();
		System.out.println("\nInsira o total de horas trabalhadas: ");
		double horas = ler.nextDouble();
		double salario = 500;
		double excesso = horas - 50;
		
		System.out.println("\nCódigo: "+codigo);	
		if (horas>50)
		{
			System.out.println("\nO valor do seu salario é: "+salario);
			System.out.println("Você possui horas excedidas.");
			double salario2 = (excesso * 20);
			System.out.println("Suas horas excedidas são: "+excesso+" horas.");
			System.out.println("\nO valor do seu salário excedente é: "+salario2+" reais.");
			double total = salario + salario2;
			System.out.println("O valor total do seu salário é: "+total+" reais.");
		
		}
		else
		{
			System.out.println("\nValor do seu salário é: "+salario);
		}
	}

}
