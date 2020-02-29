package com.equiperocket.concliciador.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item_guia")
public class ItemGuia {
	@Id
	private int id;
	private int version;
	private int quantidade;
	@ManyToOne
	private Guia guia_id;
	@ManyToOne
	private Produto produto_id;
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
	public Guia getGuia_id() {
		return guia_id;
	}
	public void setGuia_id(Guia guia_id) {
		this.guia_id = guia_id;
	}
	public Produto getProduto_id() {
		return produto_id;
	}
	public void setProduto_id(Produto produto_id) {
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