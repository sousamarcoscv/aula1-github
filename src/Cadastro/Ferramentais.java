package Cadastro;

public class Ferramentais {
	private String codigoFerramental;
	private String nomeFerramental;
	private String nomeCliente;
	private int ciclo;
	private int cavidades;
	private int pesoPrensada;
	private int producaoHoraria;
	
	
	public Ferramentais(String codigoFerramental, String nomeFerramental, String nomeCliente, int ciclo, int cavidades,
			int pesoPrensada) {
		super();
		this.codigoFerramental = codigoFerramental;
		this.nomeFerramental = nomeFerramental;
		this.nomeCliente = nomeCliente;
		this.ciclo = ciclo;
		this.cavidades = cavidades;
		this.pesoPrensada = pesoPrensada;
		this.producaoHoraria = 3600/ciclo;
		
	}
	public String getCodigoFerramental() {
		return codigoFerramental;
	}
	public void setCodigoFerramental(String codigoFerramental) {
		this.codigoFerramental = codigoFerramental;
	}
	public String getNomeFerramental() {
		return nomeFerramental;
	}
	public void setNomeFerramental(String nomeFerramental) {
		this.nomeFerramental = nomeFerramental;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public int getCavidades() {
		return cavidades;
	}
	public void setCavidades(int cavidades) {
		this.cavidades = cavidades;
	}
	public int getPesoPrensada() {
		return pesoPrensada;
	}
	public void setPesoPrensada(int pesoPrensada) {
		this.pesoPrensada = pesoPrensada;
	}
	public int getProducaoHoraria() {
		return producaoHoraria;
	}
	
	

	
	
	
}
