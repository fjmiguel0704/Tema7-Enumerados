package ejercicio3;

public class Articulo {
	
	enum Departamento {Electrónica, Alimentación, Droguería};
	
	Departamento departamento;
	
	/**
	 * Nombre del producto
	 */
	String nombre = "";
	/**
	 * Precio del producto
	 */
	double precio;
	/**
	 * IVA de los productos
	 */
	static final int IVA = 21;
	/**
	 * Cantidad en stock
	 */
	int cuantosQuedan;

	/**
	 * Constructor que asigna valores a nombre y precio del artículo y cantidad de
	 * stock. Y comprueba que los valores asignados son correctos
	 * 
	 * @param nombre        del producto
	 * @param precio        del producto
	 * @param cuantosQuedan cantidad disponible
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan, Departamento departamento) {
		if (nombre.isEmpty()) {
			System.out.println("El nombre no es válido");
		} else {
			this.nombre = nombre;
		}

		if (precio <= 0.0) {
			System.out.println("El precio no es válido");
		} else {
			this.precio = precio;
		}

		if (cuantosQuedan <= 0) {
			System.out.println("La cantidad de artículos disponible no es válida");
		} else {
			this.cuantosQuedan = cuantosQuedan;
		}
		if (departamento.equals(departamento)) {
			this.departamento=departamento;
		}
	}
	
	

	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	/**
	 * Este método devuelve la información del artículo
	 * 
	 * @return nombre, precio, IVA y cantidad disponible
	 */
	public String imprime() {
		String resultado = "";
		resultado = "Nombre Artículo: " + nombre + "\n" + "Departamento: " + departamento + "\n" + "Precio Artículo: " + precio + "€" + "\n" + "IVA: " + IVA
				+ "%" + "\n" + "Disponibles: " + cuantosQuedan;
		return resultado;
	}

	/**
	 * Este método calcula el precio del producto con el IVA aplicado
	 * 
	 * @return precio final con IVA
	 */
	double getPVP() {
		precio = precio + ((precio * IVA) / 100);
		return precio;
	}

	/**
	 * Este método calcula el precio final del producto con el descuento aplicado
	 * 
	 * @param descuento que se le desea aplicar al producto
	 * @return el precio final con descuento
	 */
	double getPVPDescuento(int descuento) {
		precio = precio - ((precio * descuento) / 100);
		return precio;
	}

	/**
	 * Este método decrementa las unidades de stock según las que se hayan vendido
	 * 
	 * @param cantidad a vender del producto
	 * @return true si es posible realizar una venta o false si no
	 */
	boolean vender(int cantidad) {
		boolean estado = false;
		if (cuantosQuedan >= cantidad) {
			estado = true;
			cuantosQuedan -= cantidad;
		}

		return estado;
	}

	/**
	 * Este método incrementa las unidades de stock según las que se hayan
	 * almacenado
	 * 
	 * @param cantidad a almacenar del producto
	 */
	void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
	}
}
