package interfaces;

public interface iBiblioteca {
	boolean addEjemplar();
	boolean addRevista();
	boolean addUsuario();
	String showEjemplares();
	String showRevistas();
	String showEjemplaresPrestados();
}
