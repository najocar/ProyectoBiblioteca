package model;

import interfaces.iBiblioteca;
import model.DTO.*;
import controller.*;

public class Biblioteca implements iBiblioteca{
	Elemento elementos[] = new Elemento[10];
	Usuario usuarios[] = new Usuario[10];
	
	@Override
	public boolean addEjemplar(Elemento elemento) {
		boolean result = false;
		if (elemento!=null && hayHueco() && !estaEjemplar(elemento)) {
			for(int i = 0; i < elementos.length && !result; i++) {
				if (elementos[i] == null) {
					elementos[i]=elemento;
					result = true;
				}
			}
		}
		return result;
	}
	
	@Override
	public boolean removeElemento(int cod) {
		boolean result = false;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] != null && elementos[i].getCod() == cod && !result) {
				elementos[i] = null;
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public boolean addRevista() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addUsuario(Usuario usuario) {
		boolean result = false;
		if (usuario != null) {
			for(int i = 0; i < usuarios.length && !result; i++) {
				if (usuarios[i] == null) {
					usuarios[i] = usuario;
					result = true;
				}
			}
		}
		return result;
	}
	
	@Override
	public boolean updateElemento(int cod) {
		boolean result = false;
		if(exist(cod)) {
			for (int i = 0; i < elementos.length && !result; i++) {
				if (elementos[i] != null && elementos[i].getCod() == cod) {
					Controller c = new Controller();
					if (elementos[i].getClass().getTypeName() == "model.DTO.Ejemplar") {
						elementos[i] = null;
						c.execAddEjemplar();
						result = true;
					}else {
						c.execAddRevista();
						result = true;
					}
				}
			}
		}
		
		return result;
	}
	
	@Override
	public String showElementos() {
		String result = "";
		for (Elemento elemento : elementos) {
			if (elemento != null) {
				result += elemento + "\n";
			}
		}
		return result;
	}
	
	@Override
	public String showEjemplares() {
		String result = "";
		for (Elemento elemento : elementos) {
			if (elemento != null && elemento.getClass().getTypeName() == "model.DTO.Ejemplar") {
				result += elemento + "\n";
			}
		}
		return result;
	}
	
	@Override
	public String find(int cod) {
		String result = "No se ha podido encontrar";
		for (Elemento elemento : elementos) {
			if (elemento != null && elemento.getCod() == cod) {
				result = "";
				result += elemento;
				break;
			}
		}
		return result;
	}
	
	@Override
	public String showRevistas() {
		String result = "";
		for (Elemento elemento : elementos) {
			if (elemento != null  && elemento.getClass().getTypeName() == "model.DTO.Revista") {
					result += elemento + "\n";
			}
		}
		return result;
	}
	@Override
	public String showEjemplaresPrestados() {
		String result = "";
		for (Elemento elemento : elementos) {
			if (elemento != null  && elemento.getClass().getTypeName() == "model.DTO.Ejemplar") {
				Libro libro = (Libro)elemento;
				if(libro.getPrestado() == true) {
					result += elemento + "\n";
				}
			}
		}
		return result;
	}
	
	@Override
	public String showUsuarios() {
		String result = "";
		for (Usuario usuario : usuarios) {
			if (usuario != null) {
				result += usuario + "\n";
			}
		}
		return result;
	}
	
	private boolean hayHueco() {
		boolean result = false;
		for (Elemento elemento : elementos) {
			if (elemento == null) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	private boolean estaEjemplar(Elemento e) {
		boolean result = false;
		for (Elemento elemento : elementos) {
			if (elemento == null && e.equals(elemento)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	private boolean exist(int cod) {
		boolean result = false;
		for (Elemento elemento : elementos) {
			if (elemento != null && elemento.getCod() == cod) {
				result = true;
				break;
			}
		}
		return result;
	}
}
