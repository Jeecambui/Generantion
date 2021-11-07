programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],somaDiagonal=0,somaTotal=0,linha,coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um numero: ")
				leia(matriz[linha][coluna])
				somaTotal += matriz[linha][coluna]

				se(linha == coluna)
				{
					somaDiagonal += matriz[linha][coluna]
				}
			}
		} 
		escreva("\nA soma dos valores inseridos é: ",somaTotal)
		escreva("\nA soma dos valores inseridos da diagonal é: ",somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */