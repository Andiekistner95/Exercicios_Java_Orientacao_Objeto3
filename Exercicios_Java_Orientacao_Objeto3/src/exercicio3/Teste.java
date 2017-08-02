package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Formas> formas = new ArrayList<Formas>();
		int numeroFormas;
		int escolhaFormas;

		System.out.println("Digite o número de formas que deseja criar");
		numeroFormas = scanner.nextInt();

		for (int i = 0; i < numeroFormas; i++) {

			System.out.println("Informe o código da forma desejada: \n1-Circulo\n2-Quadrado\n3-Retangulo");

			escolhaFormas = scanner.nextInt();

			switch (escolhaFormas) {

			case 1:
				Circulos circulo = new Circulos();
				System.out.println("Informe o raio do circulo");
				circulo.setRaio(scanner.nextDouble());
				circulo.calculaArea();
				circulo.calculaPerimetro();
				formas.add(circulo);
				break;
			case 2:
				Quadrados quadrado = new Quadrados();
				System.out.println("Informe a medida do lado do quadrado");
				quadrado.setLado(scanner.nextDouble());
				quadrado.calculaArea();
				quadrado.calculaPerimetro();
				formas.add(quadrado);
				break;
			case 3:
				Retangulos retangulo = new Retangulos();
				System.out.println("Informe a altura do retangulo");
				retangulo.setAltura(scanner.nextDouble());
				System.out.println("Informe a base do retangulo");
				retangulo.setBase(scanner.nextDouble());
				retangulo.calculaArea();
				retangulo.calculaPerimetro();
				formas.add(retangulo);
			}

		}

		for (Formas formas2 : formas) {
			System.out.println(formas2.toString());
			
		}
		
	}
}
