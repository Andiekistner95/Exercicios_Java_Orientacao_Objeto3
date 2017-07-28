package exercicio1;

import java.text.DecimalFormat;

public class Conta_Corrente {

	DecimalFormat df =  new DecimalFormat("#0.00");
	
	private String banco;
	private String agencia;
	private String cliente;
	private String conta;
	private double saldo;

	public Conta_Corrente(String banco, String agencia, String cliente, String conta, double saldo) {
		this.banco = banco;
		this.agencia = agencia;
		this.cliente = cliente;
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		this.saldo = (saldo - (valor + (valor * 0.005)));

	}

	public void depositar(double valor) {
		this.saldo = (saldo + valor);

	}

	public void extrato(){
		String extrato;
		extrato = "\nCliente: "+getCliente();
		extrato += "\nBanco: "+ getBanco();
		extrato += "\nAgência: "+getAgencia();
		extrato += "\nNúmero da conta: "+ getConta();
		extrato += "\nSaldo disponível: R$"+ df.format(getSaldo());
		System.out.println(extrato);
		
	}
}
