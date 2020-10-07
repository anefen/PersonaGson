package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Prueba {
public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca un nombre: ");
		String nom = scanner.nextLine();
		System.out.println("Introduzca un apellido: ");
		String ape = scanner.nextLine();
		System.out.println("Introduzca una edad: ");
		int ed = scanner.nextInt();
		
		
		Persona p = new Persona(nom,ape,ed);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		scanner.close();
	}
}
