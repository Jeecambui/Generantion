programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\nPara saber se o nadador faz parte do gos grupos: Infantil A","\nInfantil B","\nJuvenil A","\nJuvenil","\nAdulto",
		"Digite a idade por favor: ")
		leia(idade)

		se (idade >=5 e idade <=7)
		{
			escreva("\nEssa faixa etaria faz parte do grupo de nadadores infantil A. ")
		}
		senao se (idade >=8 e idade <= 11)
		{
			escreva("\nEssa faixa etaria faz parte do grupo de nadadores infantil B. ")
		}
		senao se (idade >= 12 e idade <= 13)
		{
			 escreva("\nEssa faixa etaria faz parte do grupo de nadadores juvenil A. ")
		}
		senao se (idade >= 14 e idade <= 17)
		{
			escreva("\nEssa faixa etaria faz parte do grupo de nadadores juvenil B.")
		}
		senao se (idade >= 18)
		{
			escreva("\nEssa faixa etaria faz parte do grupo de nadadores adultos.")
		}
		senao se (idade<=4)
		{
			escreva("\nEssa faixa etaria não faz parte de nenhuma de nossas classificações.",
			"\n\t\tcrianças menores de 5 anos não podem nadar. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */