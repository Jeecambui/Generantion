programa
{

	funcao inicio ()
	{
		real custoFab, imposto, percDist, preco
		
		escreva("\nEscreva o valor do custo de fabricação: ")
		leia(custoFab)
		imposto = 0.45
		percDist = 0.28
		preco = custoFab + custoFab * imposto + custoFab * percDist
		escreva("\nO carro custará: ", preco)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */