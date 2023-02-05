package controller;

import interfaces.iBiblioteca;
import interfaces.iController;
import interfaces.iGUI;
import model.DTO.Ejemplar;
import model.DTO.Elemento;
import model.DTO.Revista;
import model.DTO.Usuario;
import gui.*;
import model.*;

public class Controller implements iController {
	private iGUI GUI = new GUI();
	private iBiblioteca biblioteca = new Biblioteca();

	@Override
	public void empezar() {
		execMainMenu();
	}

	@Override
	public void execMainMenu() {
		int opcion = 0;
	
			GUI.showMainMenu();
			opcion = GUI.readInt("Elige una opción: ");
			controlMainMenu(opcion);

	}

	@Override
	public void controlMainMenu(int option) {
		switch (option) {
		case 1:
			GUI.print("prestar libro");
			break;
		case 2:
			execBookMenu();
			break;
		case 3:
			execUserMenu();
			break;

		default:
			GUI.print("Incorrecto");
			execMainMenu();
			break;
		}

	}
	
	@Override
	public void execBookMenu() {
		int opcion = 0;
		do {
			GUI.showBookMenu();
			opcion = GUI.readInt("Elige una opción: ");
			controlBookMenu(opcion);
		} while (opcion != 0);
	}

	@Override
	public void controlBookMenu(int option) {
		switch (option) {
		case 0:
			execMainMenu();
			break;
		case 1:
			controlAddMenu();
			break;
		case 2:
			showElementos();
			break;
		case 3:
			showEjemplares();
			break;
		case 4:
			showEjemplaresPrestados();
			break;
		case 5:
			showRevistas();
			break;
		case 6:
			execFindEjemplar();
			break;
		case 7:
			execUpdateEjemplar();
			break;
		case 8:
			execRemoveElemento();
		default:
			break;
		}
		
	}
	
	@Override
	public void execUserMenu() {
		int opcion = 0;
		do {
			GUI.showUserMenu();
			opcion = GUI.readInt("Elige una opción: ");
			controlUserMenu(opcion);
		} while (opcion != 0);
	}

	@Override
	public void controlUserMenu(int option) {
		switch (option) {
		case 0:
			execMainMenu();
			break;
		case 1:
			execAddUsuario();
			
			break;
		case 2:
			showUsuarios();
			break;
		case 3:
			findUser();
			break;
		case 4:
			//execUpdateUser();
			break;
		default:
			break;
		}
	}
	
	@Override
	public void controlAddMenu() {
		int opcion = 0;
		do {
			GUI.print("elije una opción: 1 - libro | 2 - revista | 3 - cancelar");
			opcion = GUI.readInt("Elige una opción: ");
		}while(opcion > 4 && opcion < 0);
		switch (opcion) {
		case 1:
			execAddEjemplar();
			break;
		case 2:
			execAddRevista();
			break;
		default:
			break;
		}
	}

	@Override
	public void execAddEjemplar() {
		String titulo = GUI.readString("título del libro: ");
		String isbn = GUI.readString("ISBN: ");
		int year = GUI.readInt("año del libro: ");
		int estanteria = GUI.readInt("estantería: ");
		Ejemplar nuevo = new Ejemplar(titulo, isbn, year, estanteria);
		addEjemplar(nuevo);
	}

	@Override
	public void execAddRevista() {
		String titulo = GUI.readString("título revista: ");
		int num_ed = GUI.readInt("número de edición: ");
		Revista nueva = new Revista(titulo, num_ed);
		addEjemplar(nueva);
	}

	@Override
	public void execAddUsuario() {
		String dni = GUI.readString("DNI: ");
		String nombre = GUI.readString("nombre: ");
		Usuario nuevo = new Usuario(dni, nombre);
		addUsuario(nuevo);

	}

	@Override
	public void showEjemplares() {
		String ejemplares = biblioteca.showEjemplares();
		GUI.print(ejemplares);
	}

	@Override
	public void showRevistas() {
		String revistas = biblioteca.showRevistas();
		GUI.print(revistas);
	}

	@Override
	public void showEjemplaresPrestados() {
		String ejemplares = biblioteca.showEjemplaresPrestados();
		GUI.print(ejemplares);
	}

	@Override
	public void addEjemplar(Elemento ejemplar) {
		if (biblioteca.addEjemplar(ejemplar)) {
			GUI.print("Añadido correctamente");
		}else {
			GUI.print("Error, no ha podido ser insertado");
		}

	}

	@Override
	public void addRevista(Revista revista) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUsuario(Usuario usuario) {
		if (biblioteca.addUsuario(usuario)) {
			GUI.print("Añadido correctamente");
		}else {
			GUI.print("Error, no ha podido ser insertado");
		}
	}

	@Override
	public void showUsuarios() {
		String usuarios = biblioteca.showUsuarios();
		GUI.print(usuarios);
	}

	@Override
	public void findUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findEjemplar(int cod) {
		String ejemplares = biblioteca.find(cod);
		GUI.print(ejemplares);
	}

	@Override
	public void execRemoveElemento() {
		int opcion = 0;
			opcion = GUI.readInt("escribe el código del Elemento que quieres eliminar: ");
			removeElemento(opcion);
	}

	@Override
	public void removeElemento(int cod) {
		if (biblioteca.removeElemento(cod)) {
			GUI.print("Eliminado correctamente \n");
		}else {
			GUI.print("Error, no ha podido ser eliminado \n");
		}
	}

	@Override
	public void execFindEjemplar() {
		int opcion = 0;
		opcion = GUI.readInt("escribe el código del Elemento que quieres buscar: ");
		findEjemplar(opcion);

	}

	@Override
	public void showElementos() {
		String elementos = biblioteca.showElementos();
		GUI.print(elementos);
	}

	@Override
	public void execUpdateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(int dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execUpdateEjemplar() {
		int opcion = 0;
		opcion = GUI.readInt("escribe el código del Elemento que quieres modificar: ");
		updateEjemplar(opcion);
	}

	@Override
	public void updateEjemplar(int cod) {
		if (biblioteca.updateElemento(cod)) {
			GUI.print("Modificado correctamente \n");
		}else {
			GUI.print("Error, no ha podido ser modificado \n");
		}
	}

}
