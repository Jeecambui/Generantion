package exercicios;
import java.util.Scanner;
public class equacaoLinear {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor A: ");
		double a = ler.nextDouble();
		System.out.println("Entre com o valor B: ");
		double b = ler.nextDouble();
		System.out.println("Entre com o valor C: ");
		double c = ler.nextDouble();
		System.out.println("Entre com o valor D: ");
		double d = ler.nextDouble();
		System.out.println("Entre com o valor E: ");
		double e = ler.nextDouble();
		System.out.println("Entre com o valor F: ");
		double f = ler.nextDouble();
		
		double x = (c*e - b*f)/(a*e - b*d);
		double y = (a*f - c*d)/(a*e - b*d);
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: "+y);
		
	}

}
