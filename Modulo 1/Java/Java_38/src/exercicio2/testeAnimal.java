package exercicio2;

public class testeAnimal {
	public static void main(String[] args) {
		
		animalDog animalDog = new animalDog("Hunter",2);
		animalDog.informacoes();
		animalDog.atividade(true);
		animalDog.somAnimal();
		
		System.out.println();
		
		animalCavalo animalCavalo = new animalCavalo("Milu",4);
		animalCavalo.informacoes();
		animalDog.atividade(true);
		animalDog.somAnimal();
		
		System.out.println();
		
		animalPreguica animalPreguica = new animalPreguica("Lala",1);
		animalCavalo.informacoes();
		animalPreguica.atividade(false);
		animalPreguica.somAnimal();
	}

}
