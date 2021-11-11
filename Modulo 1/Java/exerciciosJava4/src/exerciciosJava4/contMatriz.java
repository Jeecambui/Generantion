package exerciciosJava4;

import java.util.Scanner;

public class contMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [][] numero= new int [3][3];
		int coluna,linha,cont=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("Entre com um número: ");
				numero[linha][coluna]=ler.nextInt();
				if(numero[linha][coluna]>=10)
				{
					cont++;
				}
			}
		}
		System.out.println("\nFoi inserido "+cont+" números maiores que 10;");
	}

}
