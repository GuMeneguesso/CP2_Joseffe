package ex03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		int opcao, id;
		String numero, agencia;
		Double saldo, ChequeEspecial;
		ArrayList<Contas> listaConta = new ArrayList<>();
		
	
			
	System.out.printf("1 - Cadastrar Conta\n\n"
			 +   	"2 - Exibir Conta\n\n");
	
	System.out.printf("Digite a opção desejada: ");
	opcao = ler.nextInt();
	System.in.read();
	if(opcao == 1) {
		ContaCorrente cc = new ContaCorrente();
		id = listaConta.size()+1;
		cc.setId(id);
		
		System.out.printf("Digite número da conta: ");
		numero = ler.next();
		cc.setNumero(numero);
		
		System.out.printf("Digite a Agencia: ");
		agencia = ler.next();
		cc.setAgencia(agencia);
		
		System.out.printf("Digite seu saldo: ");
		saldo = ler.nextDouble();
		cc.setSaldo(saldo);
		
		System.out.printf("Digite seu Cheque Especial: ");
		ChequeEspecial = ler.nextDouble();
		cc.setChequeEspecial(ChequeEspecial);
		System.in.read();
	}
	if (opcao == 2) {
			for(Contas c: listaConta) {
				System.out.printf("Conta Corrente: Ag: %s, Num: %s, Saldo: %.2f", c.getAgencia(), c.getNumero(), c.getSaldo());
				System.in.read();
			}
		

	}
}
}