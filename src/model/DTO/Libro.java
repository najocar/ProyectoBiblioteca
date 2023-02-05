package model.DTO;

public class Libro extends Elemento{
	protected boolean prestado;
	protected String isbn;
	protected int year;
	protected String fecha;
	
	public Libro(String titulo, String isbn, int year) {
		super(titulo);
		this.prestado = false;
		this.isbn = isbn;
		this.year = year;
		this.fecha = null;
	}
	
	public Libro() {
		super();
		this.prestado = false;
		this.isbn = "0000";
		this.year = 0;
		this.fecha = "00-00-0000";
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() + "prestado=" + prestado + ", isbn=" + isbn + ", year=" + year + ", fecha=" + fecha + " ";
	}
	
}
