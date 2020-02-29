package com.equiperocket.concliciador.model;

import java.util.Date;

public class Guia {
	
	
	private String guia;
	private String prestador;
	private String convenio;
	private String beneficiario;
	private Date dataGuia;
	
	
	public String getGuia() {
		return guia;
	}
	public void setGuia(String guia) {
		this.guia = guia;
	}
	public String getPrestador() {
		return prestador;
	}
	public void setPrestador(String prestador) {
		this.prestador = prestador;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public Date getDataGuia() {
		return dataGuia;
	}
	public void setDataGuia(Date dataGuia) {
		this.dataGuia = dataGuia;
	}
	
}
