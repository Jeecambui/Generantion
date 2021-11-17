package exercicio2;

public class animalDog extends animal2{
	public animalDog(String nome,int idade)
	{
		super(nome,idade);
	}
	public void informacoes()
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade());
	}
	@Override
	public void somAnimal() {
		System.out.println("AU AU AU!");
		
	}
	@Override
	public void atividade(Boolean atividade)
	{
		if(atividade == true)
		{
			System.out.println("Esse animal corre.");
		}
		else
		{
			System.out.println("Esse animal não corre, possui outra atividade como: subir em árvores");
		}
		
	}

}
