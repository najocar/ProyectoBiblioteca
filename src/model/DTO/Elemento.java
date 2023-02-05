package model.DTO;

import java.util.Objects;

public class Elemento {
	protected int cod;
	protected String titulo;
	static private int code = 1;
	
	public Elemento(String titulo) {
		this.cod = code;
		this.titulo = titulo;
		code ++;
	}
	
	public Elemento() {
		this.cod = 0;
		this.titulo = "";
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "codigo=" + cod + ", titulo=" + titulo + " ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return cod == other.cod;
	}
	
}
