programa
{
	
	funcao inicio()
	{
		real peso,multa,pesoTomate,excesso
		escreva("\nInsira o valor do peso: ")
		leia(peso)
		pesoTomate = 50
		multa = 4.00

		
		
			se (peso<=50)
			{
				escreva("\nPeso não excedido.","\nTotal do valor a pagar é Zero")
			}
			senao 
			{
				escreva("\nPeso excedido, iremos calcular a multa por excesso de peso...")
				escreva("\nValor da Multa por quilo é 4,00 reais")
				excesso = (peso - pesoTomate) * multa
				escreva("\n\t\tValor da multa: ",excesso,"reais")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */