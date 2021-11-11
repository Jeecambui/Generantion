package exerciciosJava4;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int [][] numeros = new int[3][2];
		int linha,coluna,somaValor=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nEntre com um valor: ");
				numeros[linha][coluna]=ler.nextInt();
				somaValor+=numeros[linha][coluna];
			}
		}
		System.out.println("\nSoma dos valores do meu Array: "+somaValor);
		
	}

}
