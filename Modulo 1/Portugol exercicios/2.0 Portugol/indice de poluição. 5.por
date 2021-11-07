programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("\nInforme o indice de poluição: ")
		leia(indice)

		se (indice>=0.05 e indice<=0.25)
		{
			escreva("\nTodos os grupos poodem exercer normalmente suas atividade, o indice de poluição está no nível aceitavel.")
		}
		senao se (indice>0.25 e indice<= 0.3)
		{
			escreva("\nGrupo 1 de empresas devem interromper suas atividades.")
		}
		senao se (indice>0.3 e indice<= 0.4)
		{
			escreva("\nGrupos 1 e 2 de empresas devem interromper suas atividades.")
		}
		senao se (indice>0.4 e indice<=0.5)
		{
			escreva("nTodos os grupos de empresa devem interromper suas atividades.")
		}
		senao
		{
			escreva("\nIndice fora de notificação")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */