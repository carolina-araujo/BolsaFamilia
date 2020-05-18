package br.com.carolina.entidade;

public class Beneficiario {

//Atributos	
	private int nis;
	private String nome;
	private int id_municipio;
	private String sigla_uf;

//Construtores	
	public Beneficiario() {
	}

	public Beneficiario(int nis, String nome, int id_municipio, String sigla_uf) {
		this.nis = nis;
		this.nome = nome;
		this.id_municipio = id_municipio;
		this.sigla_uf = sigla_uf;
	}

//Getters and Setters
	public int getNis() {
		return nis;
	}

	public void setNis(int nis) {
		this.nis = nis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getSigla_uf() {
		return sigla_uf;
	}

	public void setSigla_uf(String sigla_uf) {
		this.sigla_uf = sigla_uf;
	}

}
