package javaO.O;

public class animalDog extends animal{
	private String raca;
	private String olhos;
	private String endereco;
	private String dieta;

	public animalDog (String nome,int idade,String somAnimal,String atividade,String raca, String olhos,String endereco,String dieta)
	{
		super(nome,idade,somAnimal,atividade);
		this.raca = raca;
		this.olhos = olhos;
		this.endereco = endereco;
		this.dieta = dieta;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()+"\nSom emitido pelo Animal: "+getSomAnimal()+
				"\nAtividade habitual do animal"+getAtividade()+"\nRaça do Animal: "+raca+"\nCor dos olhos: "+
				olhos+"\nEndereço do animal: "+endereco+"\nDieta: "+dieta);
	}
}