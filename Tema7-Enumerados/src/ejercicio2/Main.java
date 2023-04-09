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
		
		Scanner read = new Scanner (System.in);
		
		Libro objeto = new Libro();
		
		System.out.println("Libro 1");
		System.out.println("Cuántos ejemplares disponibles hay: ");
		ejemplares=read.nextInt();
		
		System.out.println("Cuántos préstamos ha hecho: ");
		prestados=read.nextInt();
		
		System.out.println("1. Dar libro");
		System.out.println("2. Recoger libro");
		opcion=read.nextInt();
		read.nextLine();
		
		switch (opcion) {
		case 1: {
			System.out.println("Introduce el título del libro que quieres solicitar: ");
			titulo=read.nextLine();
			
			System.out.println("Introduce el nombre del autor del libro que quieres solicitar: ");
			autor=read.nextLine();
			
			System.out.println("Género al que pertenece: ");
			genero = read.nextLine();
			objeto.genero.valueOf(genero);
			
			objeto.prestamo();
			

			break;
		}
		case 2: {
			System.out.println("Introduce el título del libro que quieres devolver: ");
			titulo=read.nextLine();
			
			System.out.println("Introduce el nombre del autor del libro que quieres devolver: ");
			autor=read.nextLine();
			
			System.out.println("Género al que pertenece: ");
			genero=read.next();
			objeto.genero.valueOf(genero);
			
			objeto.devolucion();
			
			break;
		}
		default:
			System.out.println("La opción introducida no es correcta");
		}
		
	//	Libro objeto2 = new Libro(titulo, autor, ejemplares, prestados, Libro.Genero.valueOf(genero));
		System.out.println(objeto.toString());

	}

}
