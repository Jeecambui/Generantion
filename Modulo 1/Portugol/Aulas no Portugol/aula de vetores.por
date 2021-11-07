programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,mediaGeral,somaMedia=0.0,media[3]
		              //esse media será um vetor; []=numero dentro é a quantidade de vetor dentro 0,1,2...//vetores []={1,2,3}
		inteiro x //variavel de lupim 

		para(x=0;x<3;x++)
		{
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)
			media[x] = (n1+n2+n3) / 3 //media agora adiquire um valor
			
			somaMedia+= media[x]
			limpa()
		}
		para(x=0;x<3;x++)
		{
			escreva("\nMédia do aluno",x+1," foi de: ",media[x])
		}
		mediaGeral = somaMedia/3
		escreva("\nMédia geral da turma: ",mediaGeral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = 18;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */