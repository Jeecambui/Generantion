programa
{
	
	funcao inicio()
	{
		cadeia nome = " "
		inteiro idade,meses,totalMeses

		escreva("\nOlá, Qual seu nome?",nome)
		leia(nome)
		escreva("\nquantos anos você tem? ")
		leia(idade)
		escreva("\nTenho ",idade," anos")
		escreva("\nquantos meses você tem? ")
		leia(meses)
		escreva("\nTenho ",meses," meses")
		
		totalMeses = idade *12 + meses 
		escreva("\nTotal de Meses vividos é: ",totalMeses)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */