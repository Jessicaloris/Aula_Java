package Aula01;
import java.util.Scanner;
public class Exercicio09 {
	
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double nota01, nota02, media;
	
	System.out.println("Digite a primeira nota: ");
	nota01 = input.nextDouble();
	
	System.out.println("Digite a segunda nota nota: ");
	nota02 = input.nextDouble();
	
	media = (nota01 + nota02) / 2;
	System.out.println ("A média do aluno é:" + media);
 	}
}
