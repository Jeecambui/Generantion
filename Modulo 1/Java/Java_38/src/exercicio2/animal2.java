package exercicio2;

public abstract class animal2 {
	
	private String nome;
	private int idade;
	
	
	public animal2(String nome,int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	abstract public void somAnimal();
	abstract public void atividade(Boolean atividade);
	

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
	
	
}
