package model.DTO;

public final class Ejemplar extends Libro{
	protected int estanteria;

	public Ejemplar(String titulo, String isbn, int year, int estanteria) {
		super(titulo, isbn, year);
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
		boolean anadido = false;
		
		return anadido;
	}
}
