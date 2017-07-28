package exercicio1;

public class Cliente_Especial extends Conta_Corrente {

	public Cliente_Especial(String banco, String agencia, String cliente, String conta, double saldo) {
		super(banco, agencia, cliente, conta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double valor) {
		super.setSaldo(getSaldo() - (valor + (valor * 0.001)));
	}
}
