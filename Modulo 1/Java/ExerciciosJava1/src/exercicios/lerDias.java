package exercicios;

import java.util.Scanner;

public class lerDias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá, qual seu nome?");
		String nome = ler.next();
		System.out.println("Quantos dias você tem?");
		int dias = ler.nextInt();
		System.out.println("Você tem "+ dias +" dias.");
		
		int totalAnos = (dias/365);
		int totalMeses =(dias/30);
		
		System.out.println("Seu total de anos na terra é: "+totalAnos+" anos,"+ totalMeses+ " meses, Parabéns terraquio");
	}

}
