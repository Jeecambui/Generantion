package exerciciosJava3;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInsira a idade: ");
		int idade = ler.nextInt();
		int contMenor=0,contMaior=0;
		
		while(idade!=-99)
		{
			
			if(idade<21)
			{
				contMenor++;
			}
			if(idade>50)
			{
				contMaior++;
			}
			System.out.println("\nInsira a idade: ");
			idade = ler.nextInt();
		}
	System.out.println("Foi inserido "+contMenor+" idade menores de 21 anos. \nE "+contMaior+" idade maior de 50 anos");	
	}

}
