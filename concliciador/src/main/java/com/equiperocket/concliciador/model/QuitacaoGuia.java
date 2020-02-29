package com.equiperocket.concliciador.model;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class QuitacaoGuia {
	
	
	@ManyToOne
	private Integer id;
	private Integer version;
	@OneToMany
	private Integer guia_id;
	private Date data_pagamento;
	private Double valor_pago;
	
	public QuitacaoGuia() {}
	
	public QuitacaoGuia(Integer id, Integer version, Integer guia_id, Date data_pagamento, Double valor_pago) {
		this.id = id;
		this.version = version;
		this.guia_id = guia_id;
		this.data_pagamento = data_pagamento;
		this.valor_pago = valor_pago;
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

	public Integer getGuia_id() {
		return guia_id;
	}

	public void setGuia_id(Integer guia_id) {
		this.guia_id = guia_id;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public Double getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(Double valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	

}
