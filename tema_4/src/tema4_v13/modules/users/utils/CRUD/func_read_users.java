package tema4_v13.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.func_find;
import tema4_v13.modules.users.utils.func_users;
import tema4_v13.utils.func_main;
import tema4_v13.utils.menus;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;

public class func_read_users {
	public static void read_admin () {
		Object primer_menu = null;
		Object objetos[] =  {"Leer Todos", "Leer_Uno" ,"Salir"};
		String cad = "";
		int localizacion = -1;
		Admin username = null;
		int salir = 0;
		if (Singleton_users.array_admin.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			primer_menu =  menus.combos("Selecciona que quieres hacer", "Leer", objetos, objetos[2]);
			switch(primer_menu.toString()) {
			case "Leer Todos":
				for (int i = 0; i <Singleton_users.array_admin.size(); i++) {
					cad = (Singleton_users.array_admin.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case "Leer_Uno":
				username =(Admin) func_users.preguntar_username_admin();
				localizacion =  func_find.find(username);
				if (localizacion != -1) {
					username = Singleton_users.array_admin.get(localizacion);
					JOptionPane.showMessageDialog(null, username.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
				}
				break;
			case "Salir":
				salir = 2;
				break;
			} // end switch
		}
	}
	
	public static void read_client () {
		Object primer_menu = null;
		Object objetos[] =  {"Leer Todos", "Leer_Uno" ,"Salir"};
		String cad = "";
		int localizacion = -1;
		Client username = null;
		int salir = 0;
		if (Singleton_users.array_client.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			primer_menu =  menus.combos("Selecciona que quieres hacer", "Leer", objetos, objetos[2]);
			switch(primer_menu.toString()) {
			case "Leer Todos":
				for (int i = 0; i <Singleton_users.array_client.size(); i++) {
					cad = (Singleton_users.array_client.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case "Leer_Uno":
				username = (Client) func_users.username_client_dummies(func_users.mostrar_username_client());
				localizacion = func_find.find(username);
				if (localizacion != 1) {
					username = Singleton_users.array_client.get(localizacion);
					JOptionPane.showMessageDialog(null, username.toString());
				} else {
					JOptionPane.showMessageDialog(null, "El usuario no exsiste");
				}
				break;
			case "Salir":
				salir = 2;
				break;
			} // end switch
		}
	}
	
	public static void read_cliente_perfil(Client username) {
		int localizacion = -1;
		localizacion =  func_find.find(username);
		JOptionPane.showMessageDialog(null,Singleton_users.array_client.get(localizacion));
	
	}
}
