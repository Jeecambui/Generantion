package exerciciosJava3;

import java.util.Scanner;

public class pesquisa {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int pessoas=0,contpc=0;
		int contHA=0;
		int contmn=0;
		int contOc=0;
		int contPn40=0;
		int contPc18=0;
		
		while(pessoas<=5)
		{
			System.out.println("\nEntre com sua idade: ");
			int idade = ler.nextInt();
			while(idade<=0 || idade>=125)
				{
				System.out.println("\nEntre com sua idade: ");
				idade = ler.nextInt();
				}
			System.out.println("Qual seu gênero? \n1-Feminino; \n2-Masculino; \n-Outros.");
			int genero = ler.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("Qual seu gênero? \n1-Feminino; \n2-Masculino; \n-Outros.");
				genero = ler.nextInt();
			}
			System.out.println("Entre com seu Fator psicologico: \n1-Calmo; \n2-Nervoso; \n3-Agressivo.");
			int psicologico = ler.nextInt();
			while(psicologico<1 || psicologico>3)
			{
				System.out.println("Qual seu gênero? \n1-Feminino; \n2-Masculino; \n-Outros.");
				psicologico = ler.nextInt();
			}
			if(psicologico==1)
			{
				contpc++;
			}
			if(genero==2 && psicologico==3)
			{
				contHA++;
			}
			if(genero==1 && psicologico==2)
			{
				contmn++;
			}
			if(genero==3 && psicologico==1)
			{
				contOc++;
			}
			if(psicologico==2 && idade>40)
			{
				contPn40++;
			}
			if(psicologico==1 && idade<18)
			{
				contPc18++;
			}
		}
		pessoas++;
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nMulheres nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contHA);
		System.out.println("\nOutros camos: "+contOc);
		System.out.println("\nNervosos maiores de 40 anos: "+contPn40);
		System.out.println("\nCalmos menores de 18 anos: "+contPc18);
	}

}
