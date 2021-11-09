package Exercicios2;

import java.util.Scanner;

public class indicePoluicao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInforme o índice de poluição: ");
		double indice = ler.nextDouble();
		
		if(indice>=0.05 && indice<=0.25)
		{
			System.out.println("\nTodos os grupos podem exercer normalmente suas atividades. Índice de poluição aceitavel");
			
		}
		else if(indice>=0.25 && indice<=0.3)
		{
			System.out.println("\nGrupo 1 de empresas devem interromper suas atividades.");
		}
		else if(indice>=0.3 && indice<=0.4)
		{
			System.out.println("\nGrupo 1 e 2 de empresas devem interromper suas atividades.");
		}
		else if(indice>=0.4 && indice<=0.5)
		{
			System.out.println("\nTodos os grupos de empresas devem interromper suas atividades.");
		}
		else
		{
			System.out.println("\nÍndice fora de notificação.");
		}
	}

}
