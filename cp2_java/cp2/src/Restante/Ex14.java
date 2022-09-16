package Restante;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex14 {

   public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String path = "C:\\pedidos.txt";
        Scanner sc = null;
        
            String produto, nome;
            double preco;
            int qtd;
            int opcao, opcao1;
            
            
            do {
                System.out.println("1 - Efetuar compra\n"
                		       +   "2 - Cadastrar novo pedido\n"
                                 + "3 - Exibir compra\n"
                                 + "4 - Sair");
                opcao = ler.nextInt();


           if( opcao == 1) {
        	    System.out.println("Digite seu nome: \n");
        	    nome = ler.next();

        	   
                System.out.println("Digite o produto que voc� quer compra: \n");
                produto = ler.next();
                
                System.out.println("Digite a quantidade que voc� quer compra: \n");
                qtd = ler.nextInt();
                
                System.out.println("Digite o pre�o do produto: \n");
                preco = ler.nextDouble();
                
                System.out.println("Pedido concluido! Para fazer outro pedido digite 1. Caso contrario digite 0:  \n");
                opcao1 = ler.nextInt();
                System.in.read();
                
                
                
                
                try (BufferedWriter le = new BufferedWriter(new FileWriter(path))) {
                    {
                    	le.write("======");
                    	le.newLine();
                    	le.write("Cliente: " + nome);
        				le.newLine();
        				
        				le.write(produto + ", ");
        				le.newLine();
        				
        				le.write(qtd + ", ");
        				le.newLine();
        				
        				le.write(String.valueOf(preco));
        				le.newLine();
        				le.write("=======");
        				le.newLine();;
              
                    }
                }
                
                catch(IOException e) {
                    e.printStackTrace();
                }
          
                
            }
            if(opcao == 2) {
                File notaCompras = new File (" ");
                sc = new Scanner(notaCompras);
                while(sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }

           }
            } while(opcao != 3);
            
    }
}