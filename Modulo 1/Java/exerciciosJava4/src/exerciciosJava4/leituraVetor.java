package exerciciosJava4;

import java.util.ArrayList;
import java.util.Scanner;

public class leituraVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somaPar=0,somaImpar=0;
		int [] numero = new int[6];
		ArrayList<integer> par=new ArrayList<>();
		ArrayList<integer> impar=new ArrayList<>();
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Entre com um número: ");
			numero[x]= ler.nextInt();
			
			if(numero[x]%2==0)
			{
				somaPar+= numero[x];
				
			}
			else
			{
				somaImpar+= numero[x];
			}
			
			System.out.println("A quantidade de números pares é: "+somaPar);
			System.out.println("A quantidade de números impare é: "+somaImpar);
			
		}
		
	}

}

