package modelo.servicos;

public class ServicoPagamentoPaypal {

	public double processaParcelas(double parcela, int quota) {
		return parcela + (parcela * 0.01 * quota) + (parcela * 0.02);

	}

}
