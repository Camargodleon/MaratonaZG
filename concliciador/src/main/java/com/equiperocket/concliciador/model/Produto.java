package com.equiperocket.concliciador.model;

import javax.persistence.ManyToOne;

public class Produto {
	@ManyToOne
	private Integer id;
	private Integer version;
	private String codigo;
	private String nome;
	private Double valor_unitario;
	
	public Produto() {}
	
	public Produto(Integer id, Integer version, String codigo, String nome, Double valor_unitario) {
		this.id = id;
		this.version = version;
		this.codigo = codigo;
		this.nome = nome;
		this.valor_unitario = valor_unitario;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(Double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	
	
}
