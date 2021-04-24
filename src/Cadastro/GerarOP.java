package Cadastro;

import java.util.ArrayList;

public class GerarOP {

	public static void main(String[] args) {
	 Ferramentais f1 = new Ferramentais("F010","Molde Friso Superior fox GP II","SMP AUTOMOTIVE",36,2,55);
	
	 ProdutosInjetados p1 = new ProdutosInjetados();
	 p1.setNome("Friso Superior Esquerdo");
	 p1.setCavidades(1);
	 p1.setCodigo("319042");
	 p1.setPeso(25);
	 p1.setF(f1);
	 
	 ProdutosInjetados p2 = new ProdutosInjetados();
	 p2.setNome("Friso Superior Direito");
	 p2.setCavidades(1);
	 p2.setCodigo("319043");
	 p2.setPeso(25);
	 p2.setF(f1);
	 
	 
	Embalagens emb1 = new Embalagens("EMB001","CAIXA PAPELÂO");
	Embalagens emb2 = new Embalagens("EMB002","CALCOS EPE");
	Embalagens emb3 = new Embalagens("EMB003","Saco Plastico 15x20x0,06");
	MateriaPrima mp1 = new MateriaPrima("ABS H802 PRETO","3.01.0001");
	MateriaPrima mp2= new MateriaPrima("P2MC NATURAL ","3.01.0002");
	
	
	ArrayList<Embalagens> embalagens = new ArrayList<Embalagens>();
	embalagens.add(emb1);
	embalagens.add(emb2);
	
	ArrayList<ProdutosInjetados> produtosInjetados = new ArrayList<ProdutosInjetados>();
	produtosInjetados.add(p1);
	produtosInjetados.add(p2);
	
	 
	 Composicao comp1 = new Composicao();
	 comp1.setF(f1);
	 comp1.setEmbalagens(embalagens);
	 comp1.setQuantidademateriaprima(55);
	 comp1.setProdutos(produtosInjetados);
	 comp1.setMp(mp1);
	 
	 float qtdemb[] = new float[2];
	 qtdemb[0] = 200f;
	 qtdemb[1] = 12.5f;
	 comp1.setQuantidadesembalagens(qtdemb);
	
	 
	 Ferramentais f2 = new Ferramentais("F011","Molde do Emblema VW","SMP AUTOMOTIVE",45,2,55);
	 ProdutosInjetados p3 = new ProdutosInjetados();
	 p3.setCodigo("319005");
	 p3.setNome("Emblema VW para Cromacao");
	 p3.setCavidades(2);
	 p3.setF(f2);
	 p3.setPeso(25);
	 p3.setPreço(3.60f);
	 ArrayList<ProdutosInjetados> prod1 = new ArrayList<ProdutosInjetados>();
	 prod1.add(p3);
	 ArrayList<Embalagens> embalagen1 = new ArrayList<Embalagens>();
	 embalagen1.add(emb1);
	 embalagen1.add(emb3);
	 
	 float qtdemb1[] = new float[2];
	 qtdemb1[0] = 208f; // Quantidade de Embalagens utilizadas na Prensada.
	 qtdemb1[1] = 2f; // Quantidade de Embalagens utilizadas na Prensada.
	 
	 Composicao comp2 = new Composicao();
	 comp2.setF(f2);
	 comp2.setEmbalagens(embalagen1);
	 comp2.setMp(mp2);
	 comp2.setProdutos(prod1);
	 comp2.setQuantidademateriaprima(55f);
	 comp2.setQuantidadesembalagens(qtdemb1);
	 
	 comp2.GerarOpporQuantidade(4200);
	 //comp1.GerarOpporQuantidade(2400);
	 
	 
	 	 
	}

}
