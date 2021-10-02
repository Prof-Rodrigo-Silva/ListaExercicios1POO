package classes.java;

public class Correntista {
	private String nome;
	private String numeroCPF;
	private String numeroRG;
	private int idade;
	private String numeroTelefone;
	
	private Conta conta = new Conta();
	
	public Correntista(Double saldo, Double limite) {
		this.conta.setSaldo(saldo);
		this.conta.setLimite(limite);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", numeroCPF=" + numeroCPF + ", numeroRG=" + numeroRG + ", idade=" + idade
				+ ", numeroTelefone=" + numeroTelefone + ", conta=" + conta + "]";
	}
	
	
	

}
