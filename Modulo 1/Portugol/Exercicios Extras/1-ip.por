programa
//laços de decião
{
	
	funcao inicio()
	{
		real ip

		escreva("\nInsira o indice de Poluiçãon de sua cidade: ")
		leia(ip)

		se (ip>=0 e ip<=35)
		{
			escreva("\nO indice de poluição em sua cidade está adequado.")
		}
		senao se (ip>35 e ip<=50)
		{
			escreva("\nO indice de poluição em sua cidade está acima do indicado. ATENÇÃO!",
				"\nA prefeitura da cidade aconselha uso de mascaras.")
		}
		senao se (ip>50 e ip<=75)
		{
			escreva("\nO indice de poluição em sua cidade está perigoso. Perigo!",
				"\nA prefeitura da cidade aconselha uso obrigatorio de mascaras na rua e caso de: ",
				"\nTosse constante e incomodo na garganta procure um médico.")
		}
		senao se(ip>75 e ip<=100)
		{
			escreva("\n\t\tEMERGÊNCIA!",
				"\nO indice de poluição em sua cidade é alarmante. Atenção as recomendações do ministerio da saude.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 860; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */