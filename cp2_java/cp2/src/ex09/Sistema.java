package ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Circulo> listaCirculos = new ArrayList<>();
		ArrayList<Quadrado> listaQuadrados = new ArrayList<>();
		ArrayList<Retangulo> listaRetangulos = new ArrayList<>();
		



		int opcao = 0, id;
		double area;
		double perimetro = 0;

		do {
			try {
				System.out.println("Qual forma você deseja criar?: "
						+ "1 - Criar Circulo"
						+ "2 - Criar Quadrado"
						+ "3 - Criar Retangulo"
						+ "4 - Sair");
				opcao = ler.nextInt();
			}
			catch (Exception e) {
				System.out.printf("Digite um número!");
			}
			
			if(opcao == 1) {
				
				Circulo c = new Circulo();
				id = listaCirculos.size() + 1;
				
				System.out.println("Digite o valor do raio: ");
				double raio = ler.nextDouble();
				
				area = c.calculoArea(raio);
				listaCirculos.add(c);
				System.out.println("Circulo com raio de %f criado");
			}
			else if(opcao == 2) {
				Quadrado q = new Quadrado(perimetro);
				id = listaQuadrados.size() + 1;
				
				System.out.println("Digite o valor de um dos lados: ");
				double lado = ler.nextDouble();
				
				q.calculoPerimetro(lado);
				
				listaQuadrados.add(q);
				System.out.println("Quadrado com lados de %f criado");
				
			}
			else if(opcao == 3) {
				Retangulo r = new Retangulo();
				id=listaRetangulos.size()+1;
				
				System.out.println("Digite o valor da base: ");
				double base = ler.nextDouble();
				
				System.out.println("Digite o valor da altura: ");
				double altura = ler.nextDouble();
				
				perimetro = r.calculoPerimetro(base, altura);
				
				listaRetangulos.add(r);
				System.out.println("Retangulo com perimetro de %f e %f criado");

				
			}
			
		}while(opcao != 4);
	}

}