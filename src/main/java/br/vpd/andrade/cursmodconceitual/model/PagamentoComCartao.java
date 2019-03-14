package br.vpd.andrade.cursmodconceitual.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

import br.vpd.andrade.cursmodconceitual.model.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 2672859995496102276L;
	
	private Integer numeroDeparcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeparcelas) {
		super(id, estado, pedido);
		this.numeroDeparcelas = numeroDeparcelas;
	}

	public Integer getNumeroDeparcelas() {
		return numeroDeparcelas;
	}

	public void setNumeroDeparcelas(Integer numeroDeparcelas) {
		this.numeroDeparcelas = numeroDeparcelas;
	}
	
}
