package com.pablo.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.pablo.domain.enums.EstadoPagamento;

<<<<<<< HEAD

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
=======
@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;

>>>>>>> 7801461731f7d644b014a588e9a2119419d161a3
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
<<<<<<< HEAD
=======
		
>>>>>>> 7801461731f7d644b014a588e9a2119419d161a3
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
<<<<<<< HEAD
		this.dataVencimento=dataVencimento;
		this.dataPagamento=dataPagamento;
=======
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
>>>>>>> 7801461731f7d644b014a588e9a2119419d161a3
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
<<<<<<< HEAD
=======
	
>>>>>>> 7801461731f7d644b014a588e9a2119419d161a3
}
