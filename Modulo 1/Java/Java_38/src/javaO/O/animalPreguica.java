package javaO.O;

public class animalPreguica extends animal {
	private int peso;
	private int comprimento;
	private String unhas;
	private String corPelo;
	
	public animalPreguica(String nome,int idade,String somAnimal,String atividade,int peso,int comprimento,String unhas,String corPelo)
	{
		super(nome,idade,somAnimal,atividade);
		this.peso = peso;
		this.comprimento = comprimento;
		this.unhas = unhas;
		this.corPelo = corPelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public String getUnhas() {
		return unhas;
	}

	public void setUnhas(String unhas) {
		this.unhas = unhas;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()+"\nSom emitido pelo Animal: "+getSomAnimal()+
				"\nAtividade habitual do animal"+getAtividade()+"\nPeso do Animal: "+peso+"\nComprimento: "+
				comprimento+"\nQuantidade de unhas: "+unhas+"\nColoração predominante: "+corPelo);
	}
}
