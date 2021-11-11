package exerciciosJava4;

public class vetorDenominado {
	public static void main(String[] args) {
		int numero[]= new int[6];
		int somaNumero=0;
		numero[0]=1;numero[1]=0;numero[2]=5;numero[3]=-2;numero[4]=-5;numero[5]=7;
		somaNumero= numero[0]+numero[1]+numero[5];
		System.out.println("A soma dos vetore 1, 2,6 é igual à: "+somaNumero);
		numero[4]=100;
		for(int x=0;x<6;x++)
		{
			System.out.println("["+numero[x]+"]");
		}
		
	}

}
