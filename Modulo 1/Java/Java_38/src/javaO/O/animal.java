package javaO.O;

public class animal {
	private String nome;
	private int idade;
	private String somAnimal;
	private String atividade;

	public animal (String nome,int idade,String somAnimal,String atividade)
	{
		this.nome = nome;
		this.idade = idade;
		this.somAnimal = somAnimal;
		this.atividade = atividade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSomAnimal() {
		return somAnimal;
	}

	public void setSomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
}
