package javaO.O;

public class testCliente {
	public static void main(String[] args) {
		cliente auto1=new cliente("Mirella Farias","Vestido de Formatura",38,"Rua das Flores 01",9999);
		auto1.imprimirInfo();
		System.out.println("\n***Compra Realizada com sucesso!***");
		auto1.setModeloRoupa("Calça Weed leg");
		auto1.imprimirInfo();
		System.out.println("\n***Troca realizada com sucesso!***");
		
		cliente auto2=new cliente("José Pimenta","Shorts",46,"Rua Margarida 04",9999);
		auto2.imprimirInfo();
		System.out.println("\n***Compra realizada com sucesso!***");
		auto2.setTamanho(48);
		auto2.imprimirInfo();
		System.out.println("\n***Troca realizada com sucesso!***");
		
		
	}

}
