package Fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		int a [] = new int [4];
		int b [] = new int [4];
		int c [] = new int [4];
		int d [] = new int [4];
		Scanner sc = new Scanner(System.in);
		for (int x=0;x<=a.length;x++) {
			
			System.out.printf("Digite o %d do array a: ", x+1);
			a[x]=sc.nextInt();
			
			System.out.printf("Digite o %d do array b: ", x+1);
			b[x]=sc.nextInt();
			
			System.out.printf("Digite o %d do array c: ", x+1);
			c[x]=sc.nextInt();
			
			System.out.printf("Digite o %d do array d: ", x+1);
			d[x]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
}
