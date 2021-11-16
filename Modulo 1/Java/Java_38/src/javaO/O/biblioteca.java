package javaO.O;

import java.text.NumberFormat;

public class biblioteca {
	private String nome;
	private String sobrenome;
	private int idade;
	private String genero;
	private String generoLiterario;
	private String titulo;
	private String endereco;
	private int contato;
	private double pagamento;
	private String formatarMoeda;

	public biblioteca(String nome,String sobrenome,int idade,String genero,String generoLiterario,String titulo,
			String endereco,int contato,double pagamento)
	{
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
		this.setGenero(genero);
		this.setGeneroLiterario(generoLiterario);
		this.setTitulo(titulo);
		this.setEndereco(endereco);
		this.setContato(contato);
		this.setPagamento(pagamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	public String formatarMoeda()
	{
		NumberFormat nf= NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatarMoeda = nf.format(pagamento);
		return formatarMoeda;	
	}
	
	public String getFormatarMoeda() {
		return formatarMoeda;
	}

	public void setFormatarMoeda(String formatarMoeda) {
		this.formatarMoeda = formatarMoeda;
	}

	public void imprimir()
	{
		System.out.println("\nNome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nGenero: "+genero+
				"\nGenere literario escolhido: "+generoLiterario+"\nEndrereço para entrega: "+endereco+
				"\nTelefone para contato: "+contato+"\nValor da compra: "+formatarMoeda);
	}
}