package ex04;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int opcao, idade, id;
		String nome, cnpj, sexo, cpf;
		
		ArrayList<PessoaFisica> listaContas = new ArrayList<>();
		ArrayList<PessoaJuridica> listaConta = new ArrayList<>();
		
		
		do {
		System.out.printf("Banco Digital\n\n");
		System.out.printf("1 - Cadastrar conta para Pessoa Juridica"
				+ 		"2 - Cadastrar conta para Pessoa Fisica"
				+ 		"3 - Exibir Contas de Pessoas Fisicas"
				+ 		"4 - Exibir Contas de Pessoas Juridicas\n\n");
		
		System.out.printf("Digite a opção desejada: ");
		opcao = ler.nextInt();
		
		
			if (opcao == 1) {
				PessoaJuridica pj = new PessoaJuridica();
				
				id = listaContas.size()+1;
				pj.setId(id);
				
				System.out.printf("Digite seu nome: ");
				nome = ler.next();
				pj.setNome(nome);
				
				System.out.printf("Digite sua idade: ");
				idade=ler.nextInt();
				pj.setIdade(idade);
				
				System.out.printf("Digite seu sexo: ");
				sexo=ler.next();
				pj.setSexo(sexo);
				
				System.out.printf("Digite seu CNPJ: ");
				cnpj=ler.next();
				pj.setCnpj(cnpj);
				System.in.read();
				
			}
			else if (opcao == 2) {
				PessoaFisica pf = new PessoaFisica();
				id = listaContas.size()+1;
				pf.setId(id);
				
				System.out.printf("Digite seu nome: ");
				nome = ler.next();
				pf.setNome(nome);
				
				System.out.printf("Digite sua idade: ");
				idade=ler.nextInt();
				pf.setIdade(idade);
				
				System.out.printf("Digite seu Sexo: ");
				sexo=ler.next();
				pf.setCpf(sexo);
				
				System.out.printf("Digite seu CPF: ");
				cpf=ler.next();
				pf.setCpf(cpf);
				
				System.in.read();		
				}
			
			else if (opcao == 3) {
				for (PessoaFisica c: listaContas){
					System.out.printf("Nome: %s, Idade: %d, Sexo: %s, CPF: %s", c.getNome(), c.getIdade(), c.getSexo(), c.getCpf());
				}
			}
			else if (opcao == 4) {
				for(PessoaJuridica pjc: listaConta) {
				System.out.printf("Nome: %s, Idade: %d, Sexo: %s, CPF: %s", pjc.getNome(), pjc.getIdade(), pjc.getSexo(), pjc.getCnpj());
			}
		}
		}while(opcao !=4);
	}
}