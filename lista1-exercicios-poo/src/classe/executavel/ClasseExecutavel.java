package classe.executavel;

import javax.swing.JOptionPane;

import classes.java.Conta;
import classes.java.Correntista;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Correntista correntista = new Correntista(1000.00,500.00);
		
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		String rg = JOptionPane.showInputDialog("Informe o RG: ");
		String idade = JOptionPane.showInputDialog("Informe a idade: ");
		String telefone = JOptionPane.showInputDialog("Informe o n° Telefone: ");
		
		correntista.setNome(nome);
		correntista.setNumeroCPF(cpf);
		correntista.setNumeroRG(rg);
		correntista.setIdade(Integer.parseInt(idade));
		correntista.setNumeroTelefone(telefone);
		correntista.getConta().setNumeroConta(12345);
		correntista.getConta().setTipoConta(0);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Saldo = "+correntista.getConta().getSaldo());
		System.out.println("Limite = "+correntista.getConta().getLimite());
		System.out.println("----------------------------------------------------------");
		System.out.println(correntista.toString());
		System.out.println("----------------------------------------------------------");
		int continuarSaque = 0;
		do {
			continuarSaque = JOptionPane.showConfirmDialog(null, "Deseja realizar Saque?");
			if(continuarSaque == 0) {
				String valorSaque = JOptionPane.showInputDialog("Informe o valor: ");
				System.out.println(correntista.getConta().Sacar(Double.parseDouble(valorSaque)));
			}
		}while(continuarSaque == 0);
		System.out.println("----------------------------------------------------------");
		int continuarDeposito = 0;
		do {
			continuarDeposito = JOptionPane.showConfirmDialog(null, "Deseja realizar Depósito?");
			if(continuarDeposito == 0) {
				String valorDeposito = JOptionPane.showInputDialog("Informe o valor: ");
				System.out.println(correntista.getConta().Deposito(Double.parseDouble(valorDeposito)));
			}
		}while(continuarDeposito == 0);
		
		System.out.println("----------------------------------------------------------");
		System.out.println(correntista.getConta().Extrato());
		
		

	}

}
