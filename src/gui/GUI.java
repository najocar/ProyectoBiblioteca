package gui;

import java.util.Scanner;

import interfaces.iGUI;

public class GUI implements iGUI{

	@Override
	public void showMainMenu() {
		print(" 1-Prestar Libro \n 2-Gestión de libros \n 3-Gestión de usuarios");
		
	}

	@Override
	public void showBookMenu() {
		print("__________________________________________________________________________________________________________\n"
			+ "|                                  |                                  |                                  |\n"
			+ "|  0-Volver                        |  1-Añadir ejemplar               | 2-Mostrar todo                   |\n"
			+ "|----------------------------------|----------------------------------|----------------------------------|\n"
			+ "|  3-Mostrar ejemplares            |  4-Mostrar ejemplares prestados  | 5-Mostrar revistas               |\n"
			+ "|----------------------------------|----------------------------------|----------------------------------|\n"
			+ "|  6-Buscar Elemento               |  7-Modificar Elemento            | 8-Eliminar Elemento              |\n"
			+ "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		
	}

	@Override
	public void showUserMenu() {
		print(" 0-Volver \n 1-Añadir Usuario \n 2-Mostrar Usuarios \n 3-Buscar Usuario");
		
	}

	@Override
	public void showAddEjemplarMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAddRevistaMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAddUsuarioMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showEjemplares(String ejemplares) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showRevistas(String revistas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showUsuarios(String usuarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int readInt(String msg) {
		Scanner teclado = new Scanner(System.in);
		int n = -1;
		print(msg);
		do {
			try {
				n = teclado.nextInt();
			} catch (Exception e) {
				print("Ha ocurrido un error. Vuelve a introducir el valor \n");
				teclado.next();
			}
		}while(n == -1);
		return n;
	}

	@Override
	public String readString(String msg) {
		Scanner teclado = new Scanner(System.in);
		String frase = null;
		print(msg);
		do {
			try {
				frase = teclado.next();
			} catch (Exception e) {
				print("Ha ocurrido un error. Vuelve a introducir el dato \n");
				teclado.next();
			}
		}while(frase == null);
		return frase;
	}

	@Override
	public void print(String msg) {
		System.out.println(msg);
		
	}

}
