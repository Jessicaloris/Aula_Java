package Fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma=0, media=0;
		double notas[] = new double [5];
		for (int x=0;x<notas.length;x++) {
			System.out.printf("Digite a nota %d: ", x+1);
			notas[x] = input.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		for(double n:notas) {
			soma+=n;
		}
media=soma/notas.length;
System.out.println(Arrays.toString(notas));
System.out.printf("A média da turma é %.2f", media);
	}
}
