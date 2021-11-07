programa
{
	
	funcao inicio()
	{
		cadeia nome = " "
		inteiro idade,dias,meses

		escreva("\nOlá, Qual seu nome?",nome)
		leia(nome)
		escreva("\nquantos anos você tem? ")
		leia(idade)
		escreva("\nTenho ",idade," anos")
		dias = idade * 365
		meses = idade * 12
		escreva("\nMinha idade em meses é: ",meses, " meses","\nMinha idade em dias é: ",dias," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */