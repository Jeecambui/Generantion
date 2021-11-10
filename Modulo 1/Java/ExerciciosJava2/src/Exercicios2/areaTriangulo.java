package Exercicios2;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	System.out.println("\nQue tal fazermos uma atividade?");
	System.out.println("\n\t\tVamos calcular a área de um triangulo! \nDigite o valor da base: ");
	double base = ler.nextDouble();
	System.out.println("\nDigite o valor da altura: ");
	double altura = ler.nextDouble();
	
	if(base<=0)
	{
		System.out.println("\nCalculo não realizável");
	}
	if(altura<=0)
	{
		System.out.println("\nCalculo não realizável.");
	}
	else if(base>=1 && altura>=1)
	{
		System.out.println("Curioso para saber a área do triângulo?");
		double area = (base * altura)/2;
		System.out.println("\nO valor da área é: "+area);
	}
  }
}
