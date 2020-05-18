package br.com.carolina.entidade;

import java.sql.Date;

public class Municipio {
//Atributos
	private String sigla_uf;
	private Date data_fundacao;
	private String nome;

//Construtores	
	public Municipio() {

	}

	public Municipio(String sigla_uf, Date data_fundacao, String nome) {
		this.sigla_uf = sigla_uf;
		this.data_fundacao = data_fundacao;
		this.nome = nome;
	}

//Getters and Setters	
	public String getSigla_uf() {
		return sigla_uf;
	}

	public void setSigla_uf(String sigla_uf) {
		this.sigla_uf = sigla_uf;
	}

	public Date getData_fundacao() {
		return data_fundacao;
	}

	public void setData_fundacao(Date data_fundacao) {
		this.data_fundacao = data_fundacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
