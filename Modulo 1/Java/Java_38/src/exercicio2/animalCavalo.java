package exercicio2;

public class animalCavalo extends animal2 {
	public animalCavalo(String nome,int idade)
	{
		super(nome,idade);
	}
	public void informacoes()
	{
		System.out.println("\nNome do animal: "+getNome()+"\nIdade: "+getIdade());
	}
	@Override
	public void somAnimal()
	{
		System.out.println("iiiirrrrrrí, rilinchin");
	}
	@Override
	public void atividade(Boolean atividade)
	{
		if(atividade == true)
		{
			System.out.println("Este animal corre.");
		}
		else
		{
			System.out.println("Esse animal não corre, possui outra atividade como: subir em árvores");

		}
	}

}
