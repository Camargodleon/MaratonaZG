package com.equiperocket.concliciador.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_guia")
public class ItemGuia {
	
	private int id;
	private int version;
	private int quantidade;
	@ManyToOne
	private int guia_id;
	@ManyToOne
	private int produto_id;
	private float valor_total;
	private int numero;
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getGuia_id() {
		return guia_id;
	}
	public void setGuia_id(int guia_id) {
		this.guia_id = guia_id;
	}
	public int getProduto_id() {
		return produto_id;
	}
	public void setProduto_id(int produto_id) {
		this.produto_id = produto_id;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
