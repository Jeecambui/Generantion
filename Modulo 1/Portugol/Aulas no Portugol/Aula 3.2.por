programa
{
	
	funcao inicio()
	{
		inteiro num,contPar=0,contImpar=0

		escreva("\nEntre com um número: ")
		leia(num)

		enquanto(num !=0) //enquanto isso for verdade continue, quando for falso pare.
		{
			se(num % 2 == 0) // % operador resto da divisão
			{
				contPar++ //ContPar = ContPar + 1
			}
			senao
			{
				contImpar++ //contImpar = contImpar + 1
			}
			escreva("\nEntre com um número: ")
		leia(num) //para continuar
		}
		escreva("\nVocê digitou: ",contPar," número(s) par(es)...")
		escreva("\nVocê digitou: ",contImpar," número(s) impar(es)...")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */