package com.equiperocket.concliciador.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "data")
public class ConvenioXML {
	
	@JacksonXmlProperty(isAttribute = true, localName = "row")
	private List<ConvenioXML> convenioList = new ArrayList<>();
	
	@JacksonXmlProperty(isAttribute = true, localName = "convenio")
	private String convenio;
	@JacksonXmlProperty(isAttribute = true, localName = "data_pagamento")
	private Date data_pagamento;
	@JacksonXmlProperty(isAttribute = true, localName = "numero_protocolo")
	private Integer numero_protocolo;
	@JacksonXmlProperty(isAttribute = true, localName = "matricula")
	private String matricula;
	@JacksonXmlProperty(isAttribute = true, localName = "nome")
	private String nome;
	@JacksonXmlProperty(isAttribute = true, localName = "numero_guia")
	private Integer numero_guia;
	@JacksonXmlProperty(isAttribute = true, localName = "ng_prest")
	private Integer ng_prest;
	@JacksonXmlProperty(isAttribute = true, localName = "senha_guia")
	private String senha_guia;
	@JacksonXmlProperty(isAttribute = true, localName = "codigo_produto")
	private Integer codigo_produto;
	@JacksonXmlProperty(isAttribute = true, localName = "descricao_produto")
	private String descricao_produto;
	@JacksonXmlProperty(isAttribute = true, localName = "valor_apresentado")
	private Double valor_apresentado;
	@JacksonXmlProperty(isAttribute = true, localName = "valor_pago")
	private Double valor_pago;
	@JacksonXmlProperty(isAttribute = true, localName = "valor_glosa")
	private Double valor_glosa;
	@JacksonXmlProperty(isAttribute = true, localName = "descricao_motivo")
	private String descricao_motivo;
	@JacksonXmlProperty(isAttribute = true, localName = "codigo_motuvo")
	private Integer codigo_motuvo;
	
	
	

	public ConvenioXML(String convenio, Date data_pagamento, Integer numero_protocolo, String matricula, String nome,
			Integer numero_guia, Integer ng_prest, String senha_guia, Integer codigo_produto, String descricao_produto,
			Double valor_apresentado, Double valor_pago, Double valor_glosa, String descricao_motivo,
			Integer codigo_motuvo) {
		this.convenio = convenio;
		this.data_pagamento = data_pagamento;
		this.numero_protocolo = numero_protocolo;
		this.matricula = matricula;
		this.nome = nome;
		this.numero_guia = numero_guia;
		this.ng_prest = ng_prest;
		this.senha_guia = senha_guia;
		this.codigo_produto = codigo_produto;
		this.descricao_produto = descricao_produto;
		this.valor_apresentado = valor_apresentado;
		this.valor_pago = valor_pago;
		this.valor_glosa = valor_glosa;
		this.descricao_motivo = descricao_motivo;
		this.codigo_motuvo = codigo_motuvo;
		convenioList.add(this);
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public Integer getNumero_protocolo() {
		return numero_protocolo;
	}

	public void setNumero_protocolo(Integer numero_protocolo) {
		this.numero_protocolo = numero_protocolo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero_guia() {
		return numero_guia;
	}

	public void setNumero_guia(Integer numero_guia) {
		this.numero_guia = numero_guia;
	}

	public Integer getNg_prest() {
		return ng_prest;
	}

	public void setNg_prest(Integer ng_prest) {
		this.ng_prest = ng_prest;
	}

	public String getSenha_guia() {
		return senha_guia;
	}

	public void setSenha_guia(String senha_guia) {
		this.senha_guia = senha_guia;
	}

	public Integer getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Double getValor_apresentado() {
		return valor_apresentado;
	}

	public void setValor_apresentado(Double valor_apresentado) {
		this.valor_apresentado = valor_apresentado;
	}

	public Double getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(Double valor_pago) {
		this.valor_pago = valor_pago;
	}

	public Double getValor_glosa() {
		return valor_glosa;
	}

	public void setValor_glosa(Double valor_glosa) {
		this.valor_glosa = valor_glosa;
	}

	public String getDescricao_motivo() {
		return descricao_motivo;
	}

	public void setDescricao_motivo(String descricao_motivo) {
		this.descricao_motivo = descricao_motivo;
	}

	public Integer getCodigo_motuvo() {
		return codigo_motuvo;
	}

	public void setCodigo_motuvo(Integer codigo_motuvo) {
		this.codigo_motuvo = codigo_motuvo;
	}

	public List<ConvenioXML> getConvenioList() {
		return convenioList;
	}
	
	

}
