package exercicios;
import java.util.Scanner;
public class custoFabrica {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva o valor do custo de fábrica");
		double custoFabrica = ler.nextDouble();
		double imposto = 0.45;
		double porcentagemDistribuidor = 0.28;
		double preco = custoFabrica + custoFabrica * imposto + custoFabrica * porcentagemDistribuidor;
		System.out.println("O carro custará "+preco);
		
				
	}

}
