package javaO.O;

import java.util.Scanner;

public class testAviao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nQual a agência de sua preferência?");
		String agencia=ler.next();
		System.out.println("\nInsira o nome do passageiro: ");
		String nomeCliente=ler.next();
		System.out.println("\nInsira número o embarque: ");
		int numeroEmbarque=ler.nextInt();
		System.out.println("\nInsira o destino desejado: ");
		String destino=ler.next();
		System.out.println("\nLocal de embarque: ");
		String embarque=ler.next();
		System.out.println("Insira o valor gasto: ");
		Float gasto=ler.nextFloat();
		System.out.println("Portão de Embarque");
		int portao=ler.nextInt();
		
		aviao auto1=new aviao(agencia,nomeCliente,numeroEmbarque,destino,embarque,portao,gasto, "Luis Roberto",35, gasto);
		auto1.imprimirInfo();
	}

}
