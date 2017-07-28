package exercicio1;

public class Teste {
public static void main(String[] args) {
	
	Conta_Corrente cc1 = new Conta_Corrente("Bradesco", "120", "William", "121", 4500.00);
	
	Cliente_Especial ce1 = new Cliente_Especial("Itau", "320", "Alison", "554", 4500.00);
	
	cc1.extrato();
	ce1.extrato();
	
	cc1.sacar(500);
	ce1.sacar(500);
	
	cc1.extrato();
	ce1.extrato();
	
}
}
