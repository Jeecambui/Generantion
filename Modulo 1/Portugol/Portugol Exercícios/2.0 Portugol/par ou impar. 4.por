programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("\nDigite um número: ")
		leia(n)

		se ( n%2 == 0)
		{
			escreva("\nEsse número é par.")
				se (n>0)
				{
					escreva("\nEsse número é positivo.")
				}
				se (n<0)
				{
					escreva("\nEsse número é impar.")
				}
		}
		senao
		{
			escreva("\nEsse número é impar.")
				se (n>0)
				{
					escreva("\nEsse número é positivo.")
				}
				se (n<0)
				{
					escreva("\nEsse número é negativo")
				}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */