package Fundamentos03;

public class Exercicio01 {
 public static void main(String[] args) {
	String str = new String();
	String texto = "Hello World";
	str = texto.replace("Hello","olá");
	System.out.println(str);
	System.out.println(texto.charAt(5));
	System.out.println(3+3+" "+str.trim());
	
	String s1 = "Hello";
	String s2 = "HELLO";
	boolean b1 = s1.equals("Hello");
	boolean b2 = s1.equals(s2);
	boolean b3 = s1.equalsIgnoreCase(s2);
	boolean b4 = s1.equalsIgnoreCase("azul");
	
	
	
}
}
