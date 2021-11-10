package exercicios;
import java.util.Scanner;

public class eventoFabrica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá, o evento das Americas começou as 00h, gostaria de saber o tempo de duração?");
		System.out.println("Por favor, insira seu horario atual.");
		int horas = ler.nextInt();
		horas = (horas - 00);
		int minutos =(horas * 60);
		int segundo = (minutos *60);
		System.out.println(" O evento tem, "+horas+" horas de duração;");
		System.out.println("O evento tem, "+minutos+" minutos de duração;");
		System.out.println("O evento tem, "+ segundo+" segundo de duração");
	}

}
