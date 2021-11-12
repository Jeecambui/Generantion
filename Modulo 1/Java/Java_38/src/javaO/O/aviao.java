package javaO.O;

public class aviao {
	private String agencia;
	private String nomeCliente;
	private int numeroEmbarque;
	private String destino;
	private String embarque;
	private int portao;
	private Float gasto;
	private String piloto;
	private int passageiros;
	
	public aviao(String agencia,String nomeCliente,int numeroEmbarque,String destino,String embarque,int portao, Float gastos,String piloto,int passageiro, Float gasto)
	{
		this.agencia=agencia;
		this.nomeCliente=nomeCliente;
		this.numeroEmbarque=numeroEmbarque;
		this.destino=destino;
		this.embarque=embarque;
		this.portao=portao;
		this.gasto=gasto;
		this.piloto=piloto;
		this.passageiros=passageiro;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nAgencia: "+agencia+"\nNome do passageiro: "+nomeCliente+
				"\nDestino: "+destino+"\nLocal de embarque: "+embarque+"\nPortão de embarque: "+portao+
				"\nGastos da viagem: "+gasto+"\nPiloto: "+piloto+"\nQuantidade de passageiros: "+passageiros);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroEmbarque() {
		return numeroEmbarque;
	}

	public void setNumeroEmbarque(int numeroEmbarque) {
		this.numeroEmbarque = numeroEmbarque;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public int getPortao() {
		return portao;
	}

	public void setPortao(int portao) {
		this.portao = portao;
	}

	public Float getGasto() {
		return gasto;
	}

	public void setGasto(Float gasto) {
		this.gasto = gasto;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	
}
