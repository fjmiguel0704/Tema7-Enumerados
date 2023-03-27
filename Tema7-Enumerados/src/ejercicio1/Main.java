package ejercicio1;

import java.util.Scanner;

import ejercicio1.CuentaCorriente.Sexo;

public class Main {

	public static void main(String[] args) {
		String DNI;
		String nombre;
		String sexo;
		double saldo;
		int opcion;
		double cantidad = 0;

		Scanner read = new Scanner(System.in);

		System.out.println("Titular 1");
		System.out.println("Introduce su DNI: ");
		DNI = read.nextLine();

		System.out.println("Introduce su nombre completo: ");
		nombre = read.nextLine();
		
		System.out.println("Sexo (Masculino o Femenino): ");
		sexo= read.nextLine();
		
		System.out.println("Introduce el saldo actual de su cuenta: ");
		saldo = read.nextDouble();
		
		CuentaCorriente objeto = new CuentaCorriente(DNI, nombre, saldo, sexo);
		

		System.out.println("1.  Ingresar Dinero");
		System.out.println("2.  Sacar Dinero");
		opcion = read.nextInt();

		switch (opcion) {
		case 1: {
			System.out.println("Cuánto dinero desea ingresar: ");
			cantidad = read.nextDouble();
			objeto.ingresarDinero(cantidad);
			break;
		}
		case 2: {
			System.out.println("Cuánto dinero desea sacar: ");
			cantidad = read.nextDouble();
			objeto.sacarDinero(cantidad);
			break;
		}
		default:
			System.out.println("La opción introducida no es correcta");
		}

		System.out.println(objeto.toString());
		
		System.out.println();
		
		System.out.println("Titular 2");
		System.out.println("Introduce su DNI: ");
		DNI = read.next();

		System.out.println("Introduce su nombre completo: ");
		nombre = read.next();
		
		System.out.println("Sexo (Masculino o Femenino): ");
		sexo= read.next();
		
		System.out.println("Introduce el saldo actual de su cuenta: ");
		saldo = read.nextDouble();
		
		CuentaCorriente objeto2 = new CuentaCorriente(DNI, nombre, saldo, sexo);
		

		System.out.println("1.  Ingresar Dinero");
		System.out.println("2.  Sacar Dinero");
		opcion = read.nextInt();

		switch (opcion) {
		case 1: {
			System.out.println("Cuánto dinero desea ingresar: ");
			cantidad = read.nextDouble();
			objeto2.ingresarDinero(cantidad);
			break;
		}
		case 2: {
			System.out.println("Cuánto dinero desea sacar: ");
			cantidad = read.nextDouble();
			objeto2.sacarDinero(cantidad);
			break;
		}
		default:
			System.out.println("La opción introducida no es correcta");
		}

		System.out.println(objeto2.toString());
	}

}
