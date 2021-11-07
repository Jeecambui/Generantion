programa
{
	
	funcao inicio()
	{
		real base,altura,area

		escreva("\nQue tal fazermos uma atividade?","\n\t\tVamos calcular a area de um triangulo!","\nDigite o valor da base: ")
		leia(base)
		escreva("\nDigite o valor da altura: ")
		leia(altura)

		se (base<=0)
		{
			escreva("\nCalculo não realizável.")
		}
		se (altura<=0)
		{
			escreva("\nCalculo não realizável.")
		}
		senao se (base>= 1 e altura>=1)
		{
			escreva("\nCurioso para saber a área do triângulo?")
			area = (base * altura)/2
			escreva("\nO valor a area do triâgulo é: ",area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */