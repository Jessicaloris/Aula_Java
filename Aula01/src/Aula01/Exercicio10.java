package Aula01;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letra;
		System.out.println("Digite uma letra: ");
		letra = input.next().charAt(0);
		System.out.println(letra=='f'?"Feminino":"Masculino");
	}
}
