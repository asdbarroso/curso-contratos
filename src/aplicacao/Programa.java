package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;
import modelo.servicos.ServicoContratos;
import modelo.servicos.ServicoPagamentoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Dados do contrato");
		System.out.println("-------------------");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (DD/MM/AAAA): ");
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor do Contrato: R$ ");
		double valorTotal = sc.nextDouble();
		System.out.print("Numero de Parcelas: ");
		int meses = sc.nextInt();

		Contrato contrato = new Contrato(numero, data, valorTotal);

		System.out.println("Parcelas:");
		ServicoContratos servicoContrato = new ServicoContratos(new ServicoPagamentoPaypal());
		servicoContrato.processaContrato(contrato, meses);
		
		for(int i=0; i < contrato.getParcelas().size(); i++) {
			System.out.print(contrato.getParcelas().get(i));
		}
		sc.close();

	}

}
