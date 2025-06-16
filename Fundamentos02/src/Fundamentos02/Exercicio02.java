package Fundamentos02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int x = 1;
		double soma=0, media=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		
		int qtd = input.nextInt();
		while (x<=qtd) {
			System.out.println("Digite a nota: ");
			soma+= input.nextDouble();
			x++;
		}
		media=soma/qtd;
		System.out.printf("A média da turma foi %.2f",media);
		String situacao = media >=7 ? "Aprovado":"Reprovado";
		System.out.println("A média da turma foi %.2f e aturma " );
	}
}
