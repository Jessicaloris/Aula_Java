package Aula01;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int data = input.nextInt();
		
		switch (data) {
		case 1: 
			System.out.println("Domingo!");
			break;
		case 2:
			System.out.println("Segunda-feira!");
			break;
		case 3:
			System.out.println("Terça-feira!");
			break;
		case 4:
			System.out.println("Quarta-feira!");
			break;
		case 5:
			System.out.println("Quinta-feira!");
			break;
		case 6:
			System.out.println("Sexta-feira!");
			break;
		case 7:
			System.out.println("Sábado!");
			break;
			
		default:
			System.out.println("Valor inválido!!");
		}	
	}
}

