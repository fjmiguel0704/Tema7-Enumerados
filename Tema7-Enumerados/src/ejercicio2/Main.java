package ejercicio2;

import java.util.Scanner;

import ejercicio2.Libro.Genero;

public class Main {

	public static void main(String[] args) {

		String genero;
		int ejemplares;
		int prestados;
		String autor;
		String titulo;

		int opcion;

		Scanner read = new Scanner(System.in);

		System.out.println("LIBRO 1");
		System.out.println("----------------------------------------");
		System.out.println("Género al que pertenece: ");
		genero = read.nextLine();

		Libro objeto = new Libro("Quijote", "Cervantes", 300, 5, Libro.Genero.valueOf(genero));
		objeto.prestamo();
		System.out.println(objeto.toString());
		
		System.out.println();

		System.out.println("LIBRO 2");
		System.out.println("----------------------------------------");
		System.out.println("Género al que pertenece: ");
		genero = read.nextLine();

		Libro objeto2 = new Libro("Pasión", "Fali", 100, 2, Libro.Genero.valueOf(genero));
		objeto2.devolucion();
		System.out.println(objeto2.toString());

		

	}

}
