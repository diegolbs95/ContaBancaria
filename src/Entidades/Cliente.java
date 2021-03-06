package Entidades;

public class Cliente {
	
	protected int numero;
	private String titular;
	private double poupanca;
	
	
	public Cliente(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}


	public Cliente(int numero, String titular, double depositoInicial) {
		super();
		this.numero = numero;
		this.titular = titular;
		deposito( depositoInicial);
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getEquilibrio() {
		return poupanca;
	}

	public void deposito (double quantidade) {
		poupanca += quantidade;
		
	} 
	
	public void retirar (double quantidade) {
		poupanca -= quantidade + 5.0;
	}
	
	public String toString() {
		return "Conta " + numero 
				+ ", titular: " 
				+ titular
				+", equilibrio: $ "
				+ String.format("%.2f", poupanca);
	}
	
}
