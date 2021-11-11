package exerciciosJava4;

import java.util.Scanner;

public class calculoMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float [][] m1=new float[2][2];
		float [][] m2=new float[2][2];
		float [][] soma=new float[2][2];
		int coluna,linha,variavel,op;
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nEntre com o valor para a matriz 1: ");
				m1[linha][coluna]=ler.nextFloat();
				System.out.println("\nEntre com o valor para a matriz 2: ");
				m2[linha][coluna]=ler.nextFloat();
			}
		}
		
		do
		{
			System.out.println("\n\t\tMenu de opções: ");
			System.out.println("1-Soma das matrizes;");
			System.out.println("2-Subtração da segunda pela primeira;");
			System.out.println("3-Adicionar uma variavel;");
			System.out.println("4-Imprimir as matrizes;");
			System.out.println("5-Sair");
			op=ler.nextInt();
			switch(op)
			{
			case 1: 
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						soma[linha][coluna]=m1[linha][coluna]+m2[linha][coluna];
						System.out.println(soma[linha][coluna]);
					}
				}break;
			case 2:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						soma[linha][coluna]=m2[linha][coluna]-m1[linha][coluna];
						System.out.println(soma[linha][coluna]);
					}
				}break;
			case 3: 
				System.out.println("\nEntre com um valor: ");
				variavel=ler.nextInt();
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						m1[linha][coluna]=m1[linha][coluna] + variavel;
						m2[linha][coluna]=m2[linha][coluna]+variavel;
						soma[linha][coluna]=soma[linha][coluna]+variavel;
						System.out.println(m1[linha][coluna]);
						System.out.println(m2[linha][coluna]);
						System.out.println(soma[linha][coluna]);
					}
				}break;
			case 4: 
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\nMatriz 1"+m1[linha][coluna]);
						System.out.println("\nMatriz 2"+m2[linha][coluna]);
						
					}
				}break;
			case 5:
				System.out.println("\nObrigada por utilizar nosso programa, volte sempre! :)");
				break;
			default:
				System.out.println("\nOpção invalida, digite outra opção por favor :)");
				
			}
			
		}
		while(op!=5);
		
	}

}
