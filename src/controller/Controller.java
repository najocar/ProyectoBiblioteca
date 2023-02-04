package controller;

import interfaces.iBiblioteca;
import interfaces.iController;
import interfaces.iGUI;
import model.DTO.Bebida;
import model.DTO.Elemento;
import model.DTO.Revista;
import model.DTO.Usuario;

public class Controller implements iController {
	private iGUI GUI;
	private iBiblioteca biblioteca;

	@Override
	public void empezar() {
		execMainMenu();
	}

	@Override
	public void execMainMenu() {
		int opcion = 0;
		do {
			GUI.showMainMenu();
			opcion = GUI.readInt("Elige una opción: ");
			controlMainMenu(opcion);
		} while (opcion != 3);
	}

	@Override
	public void controlMainMenu(int option) {
		switch (option) {
		case 1:
			
			break;
		case 2:
			execBookMenu();
			break;
		case 3:
			execUserMenu();
			break;

		default:
			GUI.print("Incorrecto");
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
		case 1:
			execAddEjemplar();
			break;
		case 2:
			showEjemplares();
			break;
		case 3:
			showEjemplaresPrestados();
			break;
		case 4:
			showRevistas();
			break;
		case 5:
			findEjemplar();
			break;
		case 6:
			updateEjemplar();
			break;
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
			controlBookMenu(opcion);
		} while (opcion != 0);
	}

	@Override
	public void controlUserMenu(int option) {
		switch (option) {
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
			updateUser();
			break;
		default:
			break;
		}
	}

	@Override
	public void execAddEjemplar() {
		int opcion = 0;
		do {
			GUI.print("elije una opción: 1 - libro | 2 - revista | 3 - cancelar");
			opcion = GUI.readInt("Elige una opción: ");
		}while(opcion < 3 && opcion > 0);
		switch (opcion) {
		case 1:
			String nombre = GUI.print("nombre del libro: ");
			int precio = miGUI.leeEntero("Precio de la bebida: ");
			Bebida nueva = new Bebida(nombre, precio);
			anadirBebida(nueva);
			break;

		default:
			break;
		}

	}

	@Override
	public void execAddRevista() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execAddUsuario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showEjemplares() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showRevistas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showEjemplaresPrestados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEjemplar(Elemento ejemplar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRevista(Revista revista) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showUsuarios() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findEjemplar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEjemplar() {
		// TODO Auto-generated method stub
		
	}

}
