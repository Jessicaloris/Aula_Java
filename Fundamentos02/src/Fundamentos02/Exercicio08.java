package Fundamentos02;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		int quant = 0;
		double soma =0, media =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos trem na sala: ");
		quant = input.nextInt();
		for (int i=1; i<=quant; i++) {
			soma+=input.nextDouble();
}
	media=soma/quant;
	System.out.printf("A média da turma foi %.2f",media);
}
}

