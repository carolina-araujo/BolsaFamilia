package br.com.carolina.entidade;

public class Beneficio_Beneficiario {

//Atributos	
	private int id_beneficiario;
	private int id_beneficio;

//Construtores	
	public Beneficio_Beneficiario() {
	}

	public Beneficio_Beneficiario(int id_beneficiario, int id_beneficio) {
		this.id_beneficiario = id_beneficiario;
		this.id_beneficio = id_beneficio;
	}

//Getters and Setters	
	public int getId_beneficiario() {
		return id_beneficiario;
	}

	public void setId_beneficiario(int id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}

	public int getId_beneficio() {
		return id_beneficio;
	}

	public void setId_beneficio(int id_beneficio) {
		this.id_beneficio = id_beneficio;
	}

}
