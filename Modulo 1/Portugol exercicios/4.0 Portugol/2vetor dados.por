programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[10],dado,maiorDado=0,total=0

		para(dado=0;dado<10;dado++)
		{
			vetor[dado] = Util.sorteia(1, 6)

			se(maiorDado == 0)
			{
				maiorDado ++
			}
			senao se (vetor[dado] > vetor[dado-1])
			{
				maiorDado +=1
			}
			
			para(dado=0;dado<10;dado++)
			{
				escreva("\n\t",vetor[dado])
			}
		}
		escreva("\n\tOs lançamentos foram: ",total/10)
				escreva("\n\tO número de maior ocorrência foi: ",maiorDado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */