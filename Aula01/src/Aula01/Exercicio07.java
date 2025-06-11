package Aula01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Digite um número: ");
		n1 = input.nextInt();
		System.out.println("Digite um número: ");
		n2 = input.nextInt();
		System.out.println("Digite um número: ");
		n3 = input.nextInt();
		
		System.out.println(n1>n2 && n1>n3 ? "o maior número é:" + n1 : n2>n3 && n2>n1 ? "o maior número é:" + n2: "o maior número é:" + n3);
		
		/*if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior nímero é : %d", n1);
	}
		else if (n2>n1 && n2>n3) {
			System.out.printf("O maior nímero é : %d", n2);
		}
		else {	
			System.out.printf("O maior nímero é : %d", n3);
		}*/
}}
