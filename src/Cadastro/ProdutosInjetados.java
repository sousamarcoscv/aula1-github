package Cadastro;

public class ProdutosInjetados {

	private String nome;
	private String codigo;
	private int peso;
	private float pre�o;
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

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
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
		return "ProdutosInjetados [nome=" + nome + ", codigo=" + codigo + ", peso=" + peso + ", pre�o=" + pre�o
				+ ", cavidades=" + cavidades + ", f=" + f.getCodigoFerramental() + "]";
	}

	
}
