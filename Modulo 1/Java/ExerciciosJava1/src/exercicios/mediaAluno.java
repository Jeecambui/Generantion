package exercicios;
import java.util.Scanner;
public class mediaAluno {
	public static void main(String[] args) {
		float n1,n2,n3,media;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEntre com a primeira nota");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com a segunda nota");
		n2 = ler.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		n3 = ler.nextFloat();
		
		media = (n1*2) + (n2*3) +(n3*5)/10;
		System.out.println("Sua média é de: "+media);
	}
}
