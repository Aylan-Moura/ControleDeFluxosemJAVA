package swicht;

import java.util.Scanner;

public class exercicio {
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
	switch (animal) {
	case "Dog":
	case "Cat":
		result ="Domestico";
			break;

	case "Tiger":
	case "lion":
		result = "Selvagem";
			break;

           default:
		result = "SLA";
			break;
		}
	return result;
}

}
