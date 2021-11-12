package javaO.O;

public class cliente {
	//declaração de atributos
	private String nomeCliente;
	private String modeloRoupa;
	private int tamanho;
	private String endereco;
	private int contato;
	
	//declarar o método
	public cliente(String nomeCliente,String modeloRoupa,int tamanho,String endereco,int contato)
	{
		this.nomeCliente=nomeCliente;
		this.modeloRoupa=modeloRoupa;
		this.tamanho=tamanho;
		this.endereco=endereco;
		this.contato=contato;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nomeCliente+"\nModelo desejado: "+modeloRoupa+
				"\nTamanho da Roupa: "+tamanho+"\nEndereço para entrega: "+endereco+
				"\nNúmero para contato: "+contato);
	}
	
	//Criação dos métodos get e set:
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getModeloRoupa() {
		return modeloRoupa;
	}
	public void setModeloRoupa(String modeloRoupa) {
		this.modeloRoupa = modeloRoupa;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	

}
