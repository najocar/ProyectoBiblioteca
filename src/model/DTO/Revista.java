package model.DTO;

public final class Revista extends Elemento{
	protected int numEdicion;

	public Revista(String titulo, int numEdicion) {
		super(titulo);
		this.numEdicion = numEdicion;
	}
	
	public Revista() {
		super();
		this.numEdicion = 0;
	}

	public int getNumEdicion() {
		return numEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}

	@Override
	public String toString() {
		return "Revista [" + super.toString() + "numEdicion=" + numEdicion + "]";
	}
	
}
