package modelo.servicos;

public interface ServicoPagamento {
	
	public double taxa(double valor);
	public double juros(double valor, int mes);
}
