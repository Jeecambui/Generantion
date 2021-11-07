programa
{
	
	funcao inicio()
	{
		inteiro a,b,c,d,r,s

		escreva("\nInsira um número, por favor: ")
		leia(a)
		escreva("\nA = ",a)
		escreva("\nObrigada, insira mais um número, por favor: ")
		leia(b)
		escreva("\nB = ",b)
		escreva("\nObrigada, insira mais um número, por favor: ")
		leia(c)
		escreva("\nC = ",c)

		escreva("\nObrigada! Agora vamos fazer um calculo?",
			"\nCom os valores inseridos iremos resolver o seguinte calculo: R=(A+B)^2 & S=(B+C)^2")

		r = (a + b)^2
		s = (b + c)^2

		escreva("\nO resultado do calculo de R é: ",r)
		escreva("\nO resultado do calculo de S é: ",s)

		escreva("\nAgora que definimos o valor de R e S, que tal realizarmos mais uma operação?",
			"\nCom os valores de R e S iremos descobrir D da seguinte forma: D=(R+S)/2")

		d = (r + s)/2
		escreva("\nO resultado da operação é: ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */