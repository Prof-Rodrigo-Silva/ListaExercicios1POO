package classes.java;

public class Conta {
	
	private int numeroConta;
	private int tipoConta; //0 ContaCorrente - 1 ContaPoupança
	private double limite, saldo;
	public int getNumeroConta() {
		return numeroConta;
	}
		
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", tipoConta=" + tipoConta + ", limite=" + limite + ", saldo="
				+ saldo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(limite);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numeroConta;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tipoConta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(limite) != Double.doubleToLongBits(other.limite))
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (tipoConta != other.tipoConta)
			return false;
		return true;
	}
	
	public String Sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return "Saque realizado, saldo atual: R$ "+this.saldo;
		}else {
			return "Saque não possivel, seu saldo atual é de: R$ "+this.saldo;
		}
	}
	
	public String Deposito(Double valor) {
		this.saldo += valor;
		return "Depósito realizado, saldo atual: R$ "+this.saldo;
	}
	public String Extrato() {
		return "Extrato | Saldo R$ "+this.saldo+" | Limite R$ "+this.limite+" | Limite Disponível R$ "+(this.saldo+this.limite);
	}
	
	
}
