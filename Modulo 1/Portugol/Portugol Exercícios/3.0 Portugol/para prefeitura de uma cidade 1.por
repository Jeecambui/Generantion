programa
{
	
	funcao inicio()
	{
		real s,mediaS,somaS=0.0,mediaNf,maiorS=0,perc,nf,somaNf=0,cont100=0,x

		para(x=1;x<=20;x++)
		{
			escreva("\nEntre com o saláro: ")
			leia(s)
			escreva("\nEntre com o número de filhos: ")
			leia(nf)

			somaS+=s
			somaNf+=nf

			se(maiorS<s)
			{
				maiorS = s
			}
			se(s<=100)
			{
				cont100 ++
			}
		}
		mediaS=somaS/x
		mediaNf = somaNf /x
		perc = (cont100 * 100)/(x-1)
		escreva("\nMedia salárial: ",mediaS)
		escreva("\nMedia salárial: ",mediaNf)
		escreva("\nMaior Salário: ",maiorS)
		escreva("\nPercentual de pessoas que recebem até 100 reais",perc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */