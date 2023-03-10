package interfaces;

import model.DTO.Elemento;
import model.DTO.Revista;
import model.DTO.Usuario;

public interface iController {
	void empezar();
	void execMainMenu();
	void controlMainMenu(int option);
	void execBookMenu();
	void controlBookMenu(int option);
	void execUserMenu();
	void controlUserMenu(int option);
	void controlAddMenu();
	void execAddEjemplar();
	void addEjemplar(Elemento ejemplar);
	void execAddRevista();
	void addRevista(Revista revista);
	void execAddUsuario();
	void addUsuario(Usuario usuario);
	void showElementos();
	void showEjemplares();
	void showRevistas();
	void showEjemplaresPrestados();
	void showUsuarios();
	void findUser();
	void execFindEjemplar();
	void findEjemplar(int cod);
	void execUpdateUser();
	void updateUser(int dni);
	void execUpdateEjemplar();
	void updateEjemplar(int cod);
	void execRemoveElemento();
	void removeElemento(int cod);
}
