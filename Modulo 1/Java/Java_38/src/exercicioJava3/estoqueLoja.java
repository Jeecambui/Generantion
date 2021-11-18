package exercicioJava3;

import java.util.ArrayList;
import java.util.Scanner;

public class estoqueLoja {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int opcao;
		ArrayList <String> estoqueLoja = new ArrayList<String>();
		
		estoqueLoja.add("Shorts");
		estoqueLoja.add("Saia");
		estoqueLoja.add("Vestido de Praia");
		estoqueLoja.add("Vestido social");
		estoqueLoja.add("Salto");
		
		System.out.println(estoqueLoja);
		
		do
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar um pruduto ao seu carrinho?");
			System.out.println("\n(2) Deseja alterar um produto de seu carrinho?");
			System.out.println("\n(3) Deseja remover um produto de seu carinho?");
			System.out.println("\n(4) Deseja verificar os produtos de seu carrinho?");
			System.out.println("\n(5) Deseja realizar a compra?");
			System.out.println("\n(6) Deseja limpar o carrinho?");
			System.out.println("\n(0) Deseja fechar a loja?");
			System.out.println("-----------------------------------------------------------");
			System.out.println("\nSelecione a opção desejada: ");
			System.out.println();
			opcao = ler.nextInt();
			
			 switch(opcao)
			 {
			 case 1:
				 System.out.println("Digite o produto que deseja adicionar o carrinho: ");
				 String adiocionar = ler.nextLine();
				 break;
			 case 2:
				 System.out.println("Digite o nome do produto que deseja alterar: ");
				 String alterar = ler.nextLine();
				 System.out.println("\nDigite o nome do produto que irá substituir "+alterar+": ");
				 String novo = ler.nextLine();
				 if(estoqueLoja.contains(alterar))
				 {
					 estoqueLoja.remove(alterar);
					 estoqueLoja.add(novo);
				 }
				 else
				 {
					 System.out.println("Produto não encontrado, não foi possivel atualizar!");
				 }
				 break;
			 case 3:
				 System.out.println("Digite o nome do produto que deseja alterar: ");
				 String remove = ler.nextLine();
				 if(estoqueLoja.contains(remove))
				 {
					 estoqueLoja.remove(remove);
				 }
				 else
				 {
					 System.out.println("Produto não encontrado, não foi possivel remover!");
				 }
				 break;
			 case 4:
				 System.out.println("\nProdutos do carrinho: ");
				 System.out.println(estoqueLoja);
				 break;
			 case 5:
				 System.out.println("Compra realizada com sucesso! Obrigada.");
				 break;
			 case 6:
				 System.out.println("Carrinho esvaziado!");
				 default:
					 System.out.println("Programa finalizado! Nese momento a loja está fechada.");
					 break;
			 }
		}while(opcao!=0);
	}
}
