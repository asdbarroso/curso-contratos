package modelo.servicos;

public class ServicoPagamentoPaypal implements ServicoPagamento{
	public double processaParcelas(double parcela, int quota) {
		parcela = parcela + ((parcela * 0.01) * quota);
		return parcela + (parcela * 0.02);
	}

}
