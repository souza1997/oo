
public class Cliente {
	private String nome;
	private double saldo;
	private double limite;
	
	public void sacar(double val)
	{
		if(validarSaque(val))saldo -= val; else System.out.println("Saque Indisponível!");
	}
	
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void depositar(double val)
	{
		saldo+=val;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}
	
	private boolean validarSaque(double valor)
	{
		return saldo+limite  > valor;
	}
	
	public double checarSaldo()
	{
		return saldo+limite;
	}
}
