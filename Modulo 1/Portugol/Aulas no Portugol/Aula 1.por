programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		cadeia nomeParticipante = " "
		
		inteiro idade,a,b, resto
		real altura,nota1,nota2,nota3,media

		escreva("\nQual seu nome?",nomeParticipante)
		leia(nomeParticipante)
		escreva("\nOlá!",nomeParticipante)

		escreva("\nEntre com a idade ")
		leia(idade)
		escreva("\nSua idade é: ",idade)
		
		escreva("\nEntre com sua altura ")
		leia(altura)
		escreva("\nSua altura é: ",altura)

		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		escreva("\nEntre com o valor de A: ")
		leia(a)
		escreva("\nEntre com o valor de B: ")
		leia(b)

		media = (nota1+nota2+nota3)/3
		nota1 = mat.raiz(nota2,2.0)
		nota2 = mat.potencia(nota3, 3.0)
		resto = a % b
		


		escreva("\nSeu nome: ",nomeParticipante,".\nVocê tem: ",idade," ano(s).\nVocê mede: ",altura," metros")
		escreva("\nA média do Participante: ",nomeParticipante," foi de: ",mat.arredondar(media, 2))
		escreva("\nO resto é: ",resto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1077; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */