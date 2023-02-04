package interfaces;

public interface iGUI {
	void showMainMenu();
	void showBookMenu();
	void showUserMenu();
	void showAddEjemplarMenu();
	void showAddRevistaMenu();
	void showAddUsuarioMenu();
	void showEjemplares(String ejemplares);
	void showRevistas(String revistas);
	void showUsuarios(String usuarios);
	int readInt(String msg);
	String readString(String msg);
	void print(String msg);
}
