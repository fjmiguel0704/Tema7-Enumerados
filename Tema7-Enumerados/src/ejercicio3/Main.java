package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Descuento a aplicar al producto
		int descuento;
		String departamento;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		System.out.println("ARTÍCULO 1");
		System.out.println("----------------------------------------");

		System.out.println("Departamento del artículo:");
		departamento = read.next();

		// Objeto, al que se le pasa como parametros al contructor el nombre del
		// artículo, precio y cantidad
		Articulo objeto = new Articulo("Keyboard", 5, 9, Articulo.Departamento.valueOf(departamento));

		// Mientras el nombre del objeto no esté vacío y precio sea mayor a 0 y cantidad
		// mayor a 0
		while (!objeto.nombre.isEmpty() && objeto.precio > 0 && objeto.cuantosQuedan > 0) {
			// Pedimos el porcentaje del descuento a aplicar
			System.out.println("Introduce el porcentaje de descuento que desea aplicarle al artículo: ");
			descuento = read.nextInt();

			// Llamamos al método que aplica el IVA
			objeto.getPVP();

			// Llamamos al método que aplica el descuento
			objeto.getPVPDescuento(descuento);

			// Llamamos al método que actualiza la cantidad de stock según las ventas,
			// pasando como parámetro un total de 5 ventas
			objeto.vender(5);

			// Llamamos al método que actualiza la cantidad de stock según las unidades
			// almacenadas, pasando como parámetro un total de 2 unidades a almacenar
			objeto.almacenar(2);

			// Imprimimos la información del artículo
			System.out.println(objeto.imprime());
			break;
		}

		System.out.println();

		System.out.println("ARTÍCULO 2");
		System.out.println("----------------------------------------");
		System.out.println("Departamento del artículo:");
		departamento = read.next();

		Articulo objeto2 = new Articulo("Mouse", 10, 5, Articulo.Departamento.valueOf(departamento));

		// Mientras el nombre del objeto no esté vacío y precio sea mayor a 0 y cantidad
		// mayor a 0
		while (!objeto2.nombre.isEmpty() && objeto2.precio > 0 && objeto2.cuantosQuedan > 0) {
			// Pedimos el porcentaje del descuento a aplicar
			System.out.println("Introduce el porcentaje de descuento que desea aplicarle al artículo: ");
			descuento = read.nextInt();

			// Llamamos al método que aplica el IVA
			objeto2.getPVP();

			// Llamamos al método que aplica el descuento
			objeto2.getPVPDescuento(descuento);

			// Llamamos al método que actualiza la cantidad de stock según las ventas,
			// pasando como parámetro un total de 5 ventas
			objeto2.vender(5);

			// Llamamos al método que actualiza la cantidad de stock según las unidades
			// almacenadas, pasando como parámetro un total de 2 unidades a almacenar
			objeto2.almacenar(2);

			// Imprimimos la información del artículo
			System.out.println(objeto2.imprime());
			break;
		}

	}

}
