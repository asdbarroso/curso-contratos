package modelo.entidades;

import java.util.Date;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	
	private Parcelas parcels;
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, Date data, Double valorTotal, Parcelas parcels) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.parcels = parcels;
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

	public Parcelas getParcels() {
		return parcels;
	}

	public void setParcels(Parcelas parcels) {
		this.parcels = parcels;
	}
	
}
