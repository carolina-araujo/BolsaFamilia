package br.com.carolina.entidade;

public class Beneficio {

//Atributos
	private int id;
	private String mes_referencia;
	private String mes_competencia;
	private float valor;

//Construtores	
	public Beneficio() {
	}

	public Beneficio(int id, String mes_referencia, String mes_competencia, float valor) {
		this.id = id;
		this.mes_referencia = mes_referencia;
		this.mes_competencia = mes_competencia;
		this.valor = valor;
	}

//Getters and Setter	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMes_referencia() {
		return mes_referencia;
	}

	public void setMes_referencia(String mes_referencia) {
		this.mes_referencia = mes_referencia;
	}

	public String getMes_competencia() {
		return mes_competencia;
	}

	public void setMes_competencia(String mes_competencia) {
		this.mes_competencia = mes_competencia;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
