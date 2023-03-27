package ejercicio1;

public class CuentaCorriente {
	String DNI;
	String nombre;
	double saldo;
	Sexo sexo;
	
	enum Sexo {
		Femenino, Masculino
	}
	
	
	public CuentaCorriente(String DNI, double saldo, String sexo) {
		this.DNI = DNI;
		this.saldo = saldo;
		this.sexo= Sexo.valueOf(sexo);
	}

	public CuentaCorriente(String DNI, String nombre, double saldo, String sexo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.sexo= Sexo.valueOf(sexo);
	}
	
	

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(String  sexo) {
		this.sexo = Sexo.valueOf(sexo);
	}

	boolean sacarDinero(double cantidad) {
		boolean resultado = false;
		if (cantidad <= saldo) {
			resultado = true;
			saldo -= cantidad;
		}

		return resultado;
	}
	
	double ingresarDinero(double cantidad) {
		saldo+=cantidad;
		return saldo;
	}
	
	 public String toString () {
		String informacion;
		informacion = "DNI: " + DNI +"\n" + "Nombre completo: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Saldo disponible: " + saldo;
		return informacion;
	}
}
