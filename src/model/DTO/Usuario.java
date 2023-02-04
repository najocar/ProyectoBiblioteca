package model.DTO;

import java.util.Objects;

public class Usuario {
	protected String dni;
	protected String nombre;
	protected Ejemplar ejemplar;
	
	public Usuario(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.ejemplar = null;
	}
	
	public Usuario() {
		this.dni = "00000000x";
		this.nombre = "";
		this.ejemplar = null;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", ejemplar=" + ejemplar + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
