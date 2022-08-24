package aula02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int aresta, area;
	
	System.out.printf("Digite o valor da aresta: ");
	aresta = ler.nextInt();
	
	area = aresta * aresta;
	
	System.out.printf("O valor da area é: %d", area);

	}

}
