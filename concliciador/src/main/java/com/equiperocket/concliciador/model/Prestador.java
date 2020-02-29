package com.equiperocket.concliciador.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="prestador")
public class Prestador {
	@Id
	private Integer id;
	private Integer version;
	private String cnpj;
	private String nome;

	public Prestador() {
	}

	public Prestador(Integer id, Integer version, String cnpj, String nome) {
		this.id = id;
		this.version = version;
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
