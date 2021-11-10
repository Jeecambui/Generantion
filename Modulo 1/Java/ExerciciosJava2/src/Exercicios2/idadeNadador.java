package Exercicios2;

import java.util.Scanner;

public class idadeNadador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nPara saber se o nadador faz parte dos grupos :");
		System.out.println("\nInfantil A. \nInfantil B. \nJuvenil A. \nJuvenil B. \nAdultos.");
		int idade = ler.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.println("\nEssa faixa etária faz parte do grupo infantil A.");
		}
		else if(idade>=8 && idade<=11)
		{
			System.out.println("\nEssa faixa etária faz parte do grupo infantil B.");
		}
		else if(idade>=12 && idade<=13)
		{
			System.out.println("\nEssa faixa etária faz parte do grupo juvenil A.");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.println("\nEssa faixa etária faz parte do grupo juvenil B.");
		}
		else if(idade>=18)
		{
			System.out.println("\nEssa faixa etária faz parte do grupo adulto.");
		}
	}

}
