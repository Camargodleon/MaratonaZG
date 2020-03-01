package com.equiperocket.concliciador.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="guia")
public class Guia {
	
	@Id
	private Long id;
	private int version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String numero;
	@ManyToOne
	private Prestador prestador_id;
	private float valor_total;
	@ManyToOne
	private Convenio convenio_id;
	@ManyToOne
	private Beneficiario beneficiario_id;
	private Date data;

	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Prestador getPrestador_id() {
		return prestador_id;
	}
	public void setPrestador_id(Prestador prestador_id) {
		this.prestador_id = prestador_id;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	public Convenio getConvenio_id() {
		return convenio_id;
	}
	public void setConvenio_id(Convenio convenio_id) {
		this.convenio_id = convenio_id;
	}
	public Beneficiario getBeneficiario_id() {
		return beneficiario_id;
	}
	public void setBeneficiario_id(Beneficiario beneficiario_id) {
		this.beneficiario_id = beneficiario_id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}



}
