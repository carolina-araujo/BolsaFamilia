package br.com.carolina.entidade;

public class UF {
//Atributos
	private String sigla;
	private String nome;
	private int area;
	private int populacao;

//Construtores
	public UF() {
		
	}

	public UF(String sigla, String nome, int area, int populacao) {
		this.sigla = sigla;
		this.nome = nome;
		this.area = area;
		this.populacao = populacao;
	}

//Getters and Setters
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

}
