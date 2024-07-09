package br.aylan.Nota;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];
		double soma = 0;

	 
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Digite a nota " + (i + 1) + ": ");
	            notas[i] = scanner.nextDouble();;
                soma+= notas[i];
	        }
	        
	        double media = soma/3;
	        
	        System.out.println("Média das notas: " + media);
	        
	        if (media <= 5) {
	        	System.out.println("Reprovado");;
	        	} else if(media >= 6 && media <= 7) {
	        		System.out.println("Recuperação");
	        	} else if (media >=8 && media <=10) {
	        		System.out.println("Aprovado");
	        	} else {
	        		System.out.println("Digite uma nota valida!!!");
	        	}
	        scanner.close();
	        }
	        
	
	
}
	
	
	
	
	
	
	