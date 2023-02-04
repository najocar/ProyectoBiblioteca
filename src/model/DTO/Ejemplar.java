package model.DTO;

public final class Ejemplar extends Libro{
	protected int estanteria;

	public Ejemplar(int cod, String titulo, boolean prestado, String isbn, int year, String fecha, int estanteria) {
		super(cod, titulo, prestado, isbn, year, fecha);
		this.estanteria = estanteria;
	}
	
	public Ejemplar() {
		super();
		this.estanteria = 0;
	}

	public int getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}

	@Override
	public String toString() {
		return "Ejemplar [" + super.toString() + "estanteria=" + estanteria + "]";
	}
	
	public boolean addEjemplar(){
		
	}
}
