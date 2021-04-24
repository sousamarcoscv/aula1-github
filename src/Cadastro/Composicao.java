package Cadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Composicao {

	private Ferramentais f;
	private ArrayList<ProdutosInjetados> produtos;
	private MateriaPrima mp;
	private ArrayList<Embalagens> embalagens;
	private float quantidadesembalagens[];
	private float quantidademateriaprima;

	public Ferramentais getF() {
		return f;
	}

	public void setF(Ferramentais f) {
		this.f = f;
	}

	public ArrayList<ProdutosInjetados> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutosInjetados> produtos) {
		this.produtos = produtos;
	}

	public MateriaPrima getMp() {
		return mp;
	}

	public void setMp(MateriaPrima mp) {
		this.mp = mp;
	}

	public ArrayList<Embalagens> getEmbalagens() {
		return embalagens;
	}

	public void setEmbalagens(ArrayList<Embalagens> embalagens) {
		this.embalagens = embalagens;
	}

	public float[] getQuantidadesembalagens() {
		return quantidadesembalagens;
	}

	public void setQuantidadesembalagens(float[] quantidadesembalagens) {
		this.quantidadesembalagens = quantidadesembalagens;
	}

	public float getQuantidademateriaprima() {
		return quantidademateriaprima;
	}

	public void setQuantidademateriaprima(float quantidademateriaprima) {
		this.quantidademateriaprima = quantidademateriaprima;
	}

	@Override
	public String toString() {
		return "Composicao [f=" + f + ", produtos=" + produtos + ", mp=" + mp + ", embalagens=" + embalagens
				+ ", quantidadesembalagens=" + Arrays.toString(quantidadesembalagens) + ", quantidademateriaprima="
				+ quantidademateriaprima + "]";
	}

	public void MostrarComposicao() {
		System.out.println(
				"Codigo do Ferramental :" + f.getCodigoFerramental() + " - Descricao: " + f.getNomeFerramental());
		System.out.println("Cliente: " + f.getNomeCliente());
		System.out.println("Codigo Materia - Prima: " + mp.getCodigo() + " - Descricao: " + mp.getNome());

		for (Embalagens c : embalagens) {
			System.out.println("Codigo da Embalagens: " + c.getCodigo() + "Descricao: " + c.getNome());

		}

		for (ProdutosInjetados prod : produtos) {
			System.out.println("Codigo dos Produtos: " + prod.getCodigo() + "Descricao: " + prod.getNome());

		}

	}

	public void GerarOPporPrensada(int quantidade) {

		System.out.println("---------------------ORDEM DE PRODUCAO ------------------------ N:___________");
		System.out.println("QUANTIDADE PRENSADAS SOLICITADA : " + quantidade);

		System.out.println("---------------------FERRRAMENTAL --------------------------------------------");
		System.out.println(
				"Codigo do Ferramental :" + f.getCodigoFerramental() + " - Descricao: " + f.getNomeFerramental());
		System.out.println("Cliente: " + f.getNomeCliente());
		
		System.out.println("---------------------MATERIA-PRIMA-------------------------------------------");
		System.out.println("Codigo Materia - Prima: " + mp.getCodigo() + " - Descricao: " + mp.getNome()
				+ "  - Nescessidade: " + ((this.quantidademateriaprima * quantidade) / 1000));

		System.out.println("---------------------PRODUTOS -------------------------------------------------");
		int totalProdutos =0;
		for (ProdutosInjetados prod : produtos) {
			System.out.println("Codigo dos Produtos: " + prod.getCodigo() + " Descricao: " + prod.getNome()+ "Quantidade :" +quantidade*prod.getCavidades()+" Peças.");
			totalProdutos+=quantidade*prod.getCavidades();

		}

		//System.out.println(totalProdutos);
		
		System.out.println("---------------------------EMBALAGENS ------------------------------------------");
		
			
		for (int c = 0; c < embalagens.size(); c++) {
			System.out.println("Codigo da Embalagens: " + embalagens.get(c).getCodigo() + " Descricao: "
					+ embalagens.get(c).getNome() + " -  Nescessidade: "
					+ (Math.ceil(totalProdutos/quantidadesembalagens[c])));
			
		}

	
		System.out.println("---------------------------DURACAO ------------------------------------------");
	
		float quantidadeaux =quantidade;
		float producaohoraria = (f.getProducaoHoraria())*produtos.get(0).getCavidades();
		float resultado = quantidadeaux/producaohoraria;		
		String duracao = Float.toString(resultado);
		duracao+="0";
	
		String duracaoarray[] = duracao.split(Pattern.quote("."));
		int hora = Integer.parseInt(duracaoarray[0]);
		int minutos=0;
		if(duracaoarray[1].length()>2) {
			minutos =Integer.parseInt((duracaoarray[1].substring(0,2)));
			minutos*=0.60f;
		} else {
			minutos = Integer.parseInt(duracaoarray[1]);
			minutos*=0.60f;
		}
		
		System.out.printf("A Duracao desta Ordem de Produção é de %d:%d Hrs",hora,minutos);
		
			
	}
	
	public void GerarOpporQuantidade(int quantidade) {
		
		System.out.println("---------------------ORDEM DE PRODUCAO ------------------------ N:___________");
		System.out.println("QUANTIDADE SOLICITADA : " + quantidade);
		
		System.out.println("---------------------FERRRAMENTAL --------------------------------------------");
		System.out.println(
				"Codigo do Ferramental :" + f.getCodigoFerramental() + " - Descricao: " + f.getNomeFerramental());
		System.out.println("Cliente: " + f.getNomeCliente());
		
		
		System.out.println("---------------------PRODUTOS -------------------------------------------------");
		int totalProdutos =0;
		int totalMp = 0;
		for (ProdutosInjetados prod : produtos) {
			System.out.println("Codigo dos Produtos: " + prod.getCodigo() + " Descricao: " + prod.getNome()+ "Quantidade : " +quantidade+" Peças.");
			totalProdutos+=quantidade;
			totalMp+=(quantidade*prod.getPeso())/1000;

		}
		
		System.out.println("---------------------MATERIA-PRIMA-------------------------------------------");
		System.out.println("Codigo Materia - Prima: " + mp.getCodigo() + " - Descricao: " + mp.getNome());
		System.out.println("Nescessidade : "+totalMp+" KG.");
		
		System.out.println("---------------------------EMBALAGENS ------------------------------------------");
		
		
		for (int c = 0; c < embalagens.size(); c++) {
			System.out.println("Codigo da Embalagens: " + embalagens.get(c).getCodigo() + " Descricao: "
					+ embalagens.get(c).getNome() + " -  Nescessidade: "
					+ (Math.ceil(totalProdutos/quantidadesembalagens[c])));
			
		}
		
		System.out.println("---------------------------DURACAO ------------------------------------------");
		
		float quantidadeaux =quantidade;
		float producaohoraria = (f.getProducaoHoraria())*produtos.get(0).getCavidades();
		float resultado = quantidadeaux/producaohoraria;		
		String duracao = Float.toString(resultado);
		duracao+="0";
	
		String duracaoarray[] = duracao.split(Pattern.quote("."));
		int hora = Integer.parseInt(duracaoarray[0]);
		int minutos=0;
		if(duracaoarray[1].length()>2) {
			minutos =Integer.parseInt((duracaoarray[1].substring(0,2)));
			minutos*=0.60f;
		} else {
			minutos = Integer.parseInt(duracaoarray[1]);
			minutos*=0.60f;
		}
		
		System.out.printf("A Duracao desta Ordem de Produção é de %d:%d Hrs",hora,minutos);
		
			
		
		
	}

}
