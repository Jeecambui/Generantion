programa
{
	
	funcao inicio()
	{
		inteiro segundos,minutos,horas, horaAtual

		escreva("\nOlá, o evento das Americas começou as 00h, gostaria de saber qual o tempo de duração?",
			"\nPor favor, insira seu horário atual, sem incluir os minutos...")
		leia(horaAtual)
		escreva("\nHorário atual é: ",horaAtual,"horas")
		
		horas = horaAtual - 00
		minutos = horaAtual * 60
		segundos = minutos * 60

		escreva("\nO evento tem ",horas," horas de duração")
		escreva("\nO evento tem ",minutos," minutos de duração")
		escreva("\nO evento tem ",segundos," segundos de duração")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 231; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */