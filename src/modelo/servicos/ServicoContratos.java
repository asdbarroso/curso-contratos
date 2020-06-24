package modelo.servicos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ServicoContratos {
	private ServicoPagamentoPaypal servicoPagamentoPaypal;
	private List<Parcelas> parcelas = new ArrayList<>();

	Calendar cal = Calendar.getInstance();
	
	public void processaContrato(Contrato contrato) {
		double valorParcela = contrato.getValorTotal() / contrato.getQuotas();
		cal.setTime(contrato.getData());

		List<Parcelas> parc = new ArrayList<Parcelas>();

		for (int i = 1; i <= contrato.getQuotas(); i++) {

			cal.add(Calendar.DAY_OF_MONTH, 30);
			Date vencimento = cal.getTime();

			parc.add(new Parcelas(vencimento, servicoPagamentoPaypal.processaParcelas(valorParcela, i)));

			cal.setTime(vencimento);
		}

		contrato.setParcelas(parc);
	}

}