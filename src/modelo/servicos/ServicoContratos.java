package modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ServicoContratos {
	private ServicoPagamento servicoPagamento;

	public ServicoContratos(ServicoPagamento servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}

	public void processaContrato(Contrato contrato, int meses) {
		double valorParcela = contrato.getValorTotal() / meses;

		for (int i = 1; i <= meses; i++) {
			Date data = adicionaMes(contrato.getData(), i);
			double juros = valorParcela + servicoPagamento.juros(valorParcela, i);
			double taxa = juros + servicoPagamento.taxa(juros);
			contrato.adicionaParcela(new Parcelas(data, taxa));
		}
	}

	public Date adicionaMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}