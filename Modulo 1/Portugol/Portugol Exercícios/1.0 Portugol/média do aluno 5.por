programa
{
	
	funcao inicio()
	{
		cadeia nome = " "
		real nota1,nota2,nota3,media,x
		x = 8
		

		escreva("\nInsira o nome do aluno: ")
		leia(nome)
		escreva("\nAluno: ",nome)
		escreva("\nInsira a primeira nota de, ",nome,", por favor.: ")
		leia(nota1)
		escreva("\nInsira a segunda nota de, ",nome,", por favor.: ")
		leia(nota2)
		escreva("\nInsira a terceira nota de, ",nome,", por favor.: ")
		leia(nota3)
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/3
		escreva("\nA media de ",nome," é: ",media)
			se(media >= x)
				escreva("\nAprovada. Parabéns pela nota!")
			senao
				escreva("\nReprovada, dedique-se mais aos estudos.")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */