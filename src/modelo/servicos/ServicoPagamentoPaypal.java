package modelo.servicos;

public class ServicoPagamentoPaypal implements ServicoPagamento{
	
	private static final double TAXA = 0.02;
	private static final double JUROS = 0.01;

	@Override
	public double taxa(double valor) {
		return valor * TAXA;
	}
	
	@Override
	public double juros(double valor, int mes) {
		return valor * JUROS * mes;
	}
	
	public double processaParcelas(double parcela, int quota) {
		parcela = parcela + ((parcela * 0.01) * quota);
		return parcela + (parcela * 0.02);
	}

}
