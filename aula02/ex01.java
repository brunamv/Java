package aula02;

	import java.util.Scanner;
	
public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Digite a base do ret�ngulo: ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do ret�ngulo: ");
		altura = ler.nextInt();
		
		area = base * altura;
		
		System.out.printf("A area do ret�ngulo �: %d", area);

	}

}
