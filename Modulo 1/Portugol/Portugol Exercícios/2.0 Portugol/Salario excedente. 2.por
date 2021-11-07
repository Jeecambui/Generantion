programa
{
	
	funcao inicio()
	{
		real salarioHora,horasTrabalhadas,horasExcedidas,salario,salario2,valorTotal,c

		escreva("\nInsira o seu código:")
		leia(c)
		escreva("\nInsira o total de horas trabalhadas: ")
		leia(horasTrabalhadas)
		salarioHora = 10.00
		horasExcedidas = horasTrabalhadas - 50
		salario =  500

		escreva("\nCodigo: ",c)
		se (horasTrabalhadas>50)
		{
			escreva("\nO valor do seu salario é: ",salario,
			"\nSua carga de trabalho é maior que 50 horas, iremos calcular seu salario...")
			salario2 = (horasExcedidas * 20)
			escreva("\nO valor do seu salario excedente é: ",salario2)
			valorTotal = salario + salario2
			escreva("\nO Valor total a ser recebido é: ",valorTotal)
		}
		senao
		{
			escreva("\nValor de seu salario é:",salario)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */