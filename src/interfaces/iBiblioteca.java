package interfaces;

import model.DTO.Elemento;
import model.DTO.Usuario;

public interface iBiblioteca {
	boolean addEjemplar(Elemento elemento);
	boolean removeElemento(int cod);
	boolean addRevista();
	boolean addUsuario(Usuario usuario);
	boolean updateElemento(int cod);
	String showElementos();
	String showEjemplares();
	String find(int cod);
	String showRevistas();
	String showEjemplaresPrestados();
	String showUsuarios();
}
