programa
{
	
	funcao inicio()
	{
		inteiro vetores[5],maiorPontuacao=0,x,numero

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com o primeiro valor: ")
			leia(numero)
			vetores[x] = numero
			
			se(maiorPontuacao < numero)
			{
				maiorPontuacao = numero
			}
		}
		escreva("\nO maior número inserido é: ",maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */