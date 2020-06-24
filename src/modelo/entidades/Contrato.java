package modelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	private Integer quotas;
	
	private List<Parcelas> parcelas = new ArrayList();
	
	public Contrato() {
		
	}



	public Contrato(Integer numero, Date data, Double valorTotal, Integer quotas) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.quotas = quotas;
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}



	public Integer getQuotas() {
		return quotas;
	}



	public void setQuotas(Integer quotas) {
		this.quotas = quotas;
	}
	
	
	
}
