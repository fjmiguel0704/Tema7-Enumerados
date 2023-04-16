package ejercicio4;

import ejercicio4.Disco.Genero;

public class Disco {
	enum Genero {
		Rock, Pop, Electrónica, Reggaeton
	};

	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private Genero genero;
	private int duracion;

	public Disco() {

	}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = Genero.valueOf(genero);
		this.duracion = duracion;
	}

	public Disco(Disco disco) {
		this.codigo = disco.codigo;
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		this.duracion = disco.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = Genero.valueOf(genero);
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

}