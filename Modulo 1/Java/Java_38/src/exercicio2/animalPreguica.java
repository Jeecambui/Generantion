package exercicio2;

public class animalPreguica extends animal2 {
	public animalPreguica(String nome,int idade)
	{
		super(nome,idade);
	}

	@Override
	public void somAnimal() {
		System.out.println("hummm ahumm nh�");
		
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
			System.out.println("Esse animal n�o corre, possui outra atividade como: subir em �rvores");
		}
		
	}

}
