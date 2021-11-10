package exercicios;
import java.util.Scanner;
public class programaC {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEntre com o valor de X1: ");
		double x1 = ler.nextDouble();
		System.out.println("\nEntre com o valor de X2: ");
		double x2 = ler.nextDouble();
		System.out.println("\nEntre com o valor de Y1: ");
		double y1 = ler.nextDouble();
		System.out.println("\nEntre com o valor de Y2: ");
		double y2 = ler.nextDouble();
		
		double d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
	    System.out.println("O valor da distância entre dois pontos foi de: "+d);
	}

}
