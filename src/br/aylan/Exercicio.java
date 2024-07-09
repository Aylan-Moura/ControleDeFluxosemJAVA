package br.aylan;

import java.util.Scanner;

/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class Exercicio {
	/*
	 * public static void main(String[] args) { Scanner s = new Scanner(System.in);
	 * 
	 * System.out.println("Digite um numero");
	 * 
	 * int result = s.nextInt();
	 * 
	 * 
	 * if (result > 1 && result< 8) { System.out.println("Entre 1 e 8"); } else if
	 * (result >= 9 && result <= 20) { System.out.println("Entre 9 e 20"); } else {
	 * System.out.println("Falso"); }
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { Scanner s = new Scanner(System.in);
	 * 
	 * System.out.println("Digite sua idade");
	 * 
	 * int idade = s.nextInt();
	 * 
	 * String idadeSt = getIdade(idade);
	 * 
	 * System.out.println(idadeSt);
	 * 
	 * s.close();
	 * 
	 * }
	 */

	/*
	 * public static String getIdade(int idade) {
	 * 
	 * if (idade >=1 && idade <= 10) { return "Criança"; }else if (idade >= 11 &&
	 * idade <= 20) { return "Adolecente"; } else if (idade >= 21 && idade <= 30) {
	 * return "adulto"; } else { return "Idoso"; }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome de um animal");
		String texto = s.next();
		String animal = exampleOfIF(texto);
		System.out.println(animal);
		s.close();
	}

	public static String exampleOfIF(String animal) {
		String result;
		if (animal.equals("Dog") || animal.equals("CAT")) {
			return "Animal domestico";
		} else if (animal.equals("Tiger")) {
			return "Animal Selvagem";
		} else {
			return "Animal desconhecido";
		}
	}
}