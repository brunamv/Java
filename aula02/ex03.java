package aula02;

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
 
  int base, altura, area;
  
  System.out.printf("Digite a altura do tri�ngulo: ");
  altura = ler.nextInt();
  
  System.out.printf("Digite a base do tri�ngulo: ");
  base = ler.nextInt();
  
  area = base*altura/2;
  
  System.out.printf("A �rea do tri�ngulo �: %d",area);

	}

}
