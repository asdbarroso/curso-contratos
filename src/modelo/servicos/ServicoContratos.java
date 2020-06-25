package modelo.servicos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ServicoContratos {
	private ServicoPagamentoPaypal servicoPagamentoPaypal;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();

	public void processaContrato(Contrato contrato) {
		double valorParcela = contrato.getValorTotal() / contrato.getQuotas();
		cal.setTime(contrato.getData());

		List<Parcelas> parc = new ArrayList<>();

		servicoPagamentoPaypal = new ServicoPagamentoPaypal();
		for (int i = 1; i <= contrato.getQuotas(); i++) {
			cal.add(Calendar.MONTH, 1);
			contrato.setData(cal.getTime());
			parc.add(new Parcelas(contrato.getData(), servicoPagamentoPaypal.processaParcelas(valorParcela, i)));
		}

		contrato.setParcelas(parc);
		
	}
	
}