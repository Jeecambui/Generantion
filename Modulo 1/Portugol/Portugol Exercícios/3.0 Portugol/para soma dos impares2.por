programa
{
	
	funcao inicio()
	{
		inteiro soma=0,n

		para(n=1;n<=500;n++)
		{
			se((n% 2!=0) e (n%3== 0))
			{
				soma = soma + n
				escreva("\n",n," : ",soma)
			}
			senao
			{
				escreva("\n",n)
			}
			escreva("\nA soma dos números ímpares é: ",soma)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */