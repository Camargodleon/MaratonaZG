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
	private int id;
	private int version;
	private String numero;
	@ManyToOne
	private int prestador_id;
	private float valor_total;
	@ManyToOne
	private int convenio_id;
	@ManyToOne
	private int beneficiario_id;
	private Date data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getPrestador_id() {
		return prestador_id;
	}
	public void setPrestador_id(int prestador_id) {
		this.prestador_id = prestador_id;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	public int getConvenio_id() {
		return convenio_id;
	}
	public void setConvenio_id(int convenio_id) {
		this.convenio_id = convenio_id;
	}
	public int getBeneficiario_id() {
		return beneficiario_id;
	}
	public void setBeneficiario_id(int beneficiario_id) {
		this.beneficiario_id = beneficiario_id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}


}
