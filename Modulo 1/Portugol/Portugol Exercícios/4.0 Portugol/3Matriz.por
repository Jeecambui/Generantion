programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],m1[4][6],m2[4][6],linha,coluna

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nEntre com um número para n1: ")
				leia(n1[linha][coluna])
				escreva("\nEntre com um número para n2: ")
				leia(n2[linha][coluna])

				m1[linha][coluna] = (n1[linha][coluna] + n2[linha][coluna])
				m2[linha][coluna] = (n1[linha][coluna] - n2[linha][coluna])
			}
		}
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nSoma: ",m1[linha][coluna],"  ")
				escreva("\nDiferença: 6",m2[linha][coluna],"  ")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 19, 2}-{m1, 6, 28, 2}-{m2, 6, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */