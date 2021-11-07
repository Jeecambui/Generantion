programa
{
	//laços de repetição
	funcao inicio()
	{
		real n1,n2,n3,n4,media,mediaGeral,somaMedia=0.0
		inteiro x
		caracter nome

		//laço de repetição até achar condição final
		para(x=1;x<=4;x++) // x ++ é igual a x + 1 | x=1 == inicio|x<=4 == onde para |x++ == para encrementar
		{
			
			escreva("\nNome do aluno: ")
			leia(nome)
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)
			escreva("\nEntre com a quarta nota: ")
			leia(n4)
			media = (n1+n2+n3+n3+n4)/4
			escreva("\nMédia do aluno ",x,": ",media)
	
			somaMedia = somaMedia + media
			
		}
		mediaGeral = somaMedia/(x-1) //retira 1 do x pq ele sai com um a mais, começa com 5
		escreva("\nMédia da Turma: ",mediaGeral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 643; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */