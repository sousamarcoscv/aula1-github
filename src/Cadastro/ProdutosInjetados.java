package Cadastro;

public class ProdutosInjetados {

	private String nome;
	private String codigo;
	private int peso;
	private float preço;
	private int cavidades;
	private Ferramentais f;
	
		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public int getCavidades() {
		return cavidades;
	}

	public void setCavidades(int cavidades) {
		this.cavidades = cavidades;
	}

	public Ferramentais getF() {
		return f;
	}

	public void setF(Ferramentais f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "ProdutosInjetados [nome=" + nome + ", codigo=" + codigo + ", peso=" + peso + ", preço=" + preço
				+ ", cavidades=" + cavidades + ", f=" + f.getCodigoFerramental() + "]";
	}

	
}
