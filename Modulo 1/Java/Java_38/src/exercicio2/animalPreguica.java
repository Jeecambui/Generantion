package exercicio2;

public class animalPreguica extends animal2 {
	public animalPreguica(String nome,int idade)
	{
		super(nome,idade);
	}

	@Override
	public void somAnimal() {
		System.out.println("hummm ahumm nhé");
		
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
