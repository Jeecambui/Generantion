programa
{
	
	funcao inicio()
	{
		cadeia nome = " "
		inteiro idade,dias,meses,totalDias

		escreva("\nOlá, Qual seu nome?",nome)
		leia(nome)
		escreva("\nquantos anos você tem? ")
		leia(idade)
		escreva("\nTenho ",idade," anos")
		escreva("\nquantos meses você tem? ")
		leia(meses)
		escreva("\nTenho ",meses," meses")
		escreva("\nquantos dias você tem? ")
		leia(dias)
		escreva("\nTenho ",dias," dias")
		
		totalDias = idade * 365 + meses * 30 + dias
		escreva("\nTotal de dias vividos é: ",totalDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */