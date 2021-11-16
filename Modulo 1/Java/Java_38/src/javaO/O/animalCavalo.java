package javaO.O;

public class animalCavalo extends animal{
	private String caracteristicaMarcante;
	private String alimentacao;
	private String sono;
	private String habitar;
	
	public animalCavalo(String nome,int idade,String somAnimal,String atividade,String caracteristicaMarcante,String alimentacao,String sono,String habitar)
	{
		super(nome,idade,somAnimal,atividade);
		this.caracteristicaMarcante = caracteristicaMarcante;
		this.alimentacao = alimentacao;
		this.sono = sono;
		this.habitar = habitar;
	}

	public String getCaracteristicaMarcante() {
		return caracteristicaMarcante;
	}

	public void setCaracteristicaMarcante(String caracteristicaMarcante) {
		this.caracteristicaMarcante = caracteristicaMarcante;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getSono() {
		return sono;
	}

	public void setSono(String sono) {
		this.sono = sono;
	}

	public String getHabitar() {
		return habitar;
	}

	public void setHabitar(String habitar) {
		this.habitar = habitar;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade do Animal: "+getIdade()+"\nSom emitido pelo Animal: "
	+getSomAnimal()+"\nAtividade habitual do animal"+getAtividade()+"\nCaracteristica marcante do Animal: "+caracteristicaMarcante
	+"\nAlimentação do animal: "+alimentacao+"\nSono habitual do animal: "+sono+"\nHabitar natural do animal: "+habitar);
	}
}
