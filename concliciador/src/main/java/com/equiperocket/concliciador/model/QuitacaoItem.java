package com.equiperocket.concliciador.model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class QuitacaoItem {
	
	@ManyToOne
	private Integer id;
	private Integer version;
	private Double numeric;
	private String motivo_glosa_descricao;
	@OneToMany
	private Integer item_gui_id;
	private String motivo_glosa_codigo;
	
	public QuitacaoItem() {}
	
	public QuitacaoItem(Integer id, Integer version, Double numeric, String motivo_glosa_descricao, Integer item_gui_id,
			String motivo_glosa_codigo) {
		this.id = id;
		this.version = version;
		this.numeric = numeric;
		this.motivo_glosa_descricao = motivo_glosa_descricao;
		this.item_gui_id = item_gui_id;
		this.motivo_glosa_codigo = motivo_glosa_codigo;
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

	public Double getNumeric() {
		return numeric;
	}

	public void setNumeric(Double numeric) {
		this.numeric = numeric;
	}

	public String getMotivo_glosa_descricao() {
		return motivo_glosa_descricao;
	}

	public void setMotivo_glosa_descricao(String motivo_glosa_descricao) {
		this.motivo_glosa_descricao = motivo_glosa_descricao;
	}

	public Integer getItem_gui_id() {
		return item_gui_id;
	}

	public void setItem_gui_id(Integer item_gui_id) {
		this.item_gui_id = item_gui_id;
	}

	public String getMotivo_glosa_codigo() {
		return motivo_glosa_codigo;
	}

	public void setMotivo_glosa_codigo(String motivo_glosa_codigo) {
		this.motivo_glosa_codigo = motivo_glosa_codigo;
	}
	
	

}
