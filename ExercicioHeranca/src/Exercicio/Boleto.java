package Exercicio;

public class Boleto extends Pagamento{
	private String numeroDoBoleto;
	int dia, mes, ano;
	
	public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano) {
		super(nomeDoPagador, cpf, valorASerPago);
		this.numeroDoBoleto=numeroDoBoleto;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		
	}

	public String numeroDoBoleto()
	{
		return this.numeroDoBoleto;
	}
	
	public int dia() 
	{
		return this.dia;
	}

	public int mes() 
	{
		return this.mes;
	}
	
	public int ano() 
	{
		return this.ano;
	}
}
