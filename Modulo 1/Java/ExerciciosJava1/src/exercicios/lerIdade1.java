package exercicios;
import java.util.Scanner;
public class lerIdade1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá, qual seu nome?");
		String nome = ler.next();
		System.out.println("Quantos anos você tem?");
		int idade = ler.nextInt();
		System.out.println("Quantos meses você tem?");
		int meses = ler.nextInt();
		System.out.println("Quantos dias você tem?");
		int dias = ler.nextInt();
		System.out.println("Você tem "+ idade +" anos, "+ meses +" meses e "+ dias +" dias.");
		
		int totalDias = ((idade *365) + (meses *30) + dias);
		System.out.println("Seu total de dias na terra é: "+totalDias+" Parabéns terraquio");
	}
}
