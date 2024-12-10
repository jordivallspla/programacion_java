package Examen_objetos.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.classes.Vip;
import Examen_objetos.modules.users.utils.func_find;
import Examen_objetos.modules.users.utils.func_users;

public class func_updates_users {
	
	public static void update_admin (Admin username) {
		int localizacion = -1;
		localizacion = func_find.find_client(username);
		if (localizacion != -1) {
			username = (Admin)func_users.update(username);
			Singleton_users.array_admin.set(localizacion, username);
		} else {
			JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
		}
	}
	
	public static void update_admin_CRUD (String username) {
		int localizacion = -1;
		Admin admin = null;
		if (Singleton_users.array_admin.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			admin = (Admin) func_users.username_admin_dummies(username);
			localizacion = func_find.find(admin);
			if (localizacion != 1) {
				admin = Singleton_users.array_admin.get(localizacion);
				admin = (Admin) func_users.update(admin);
				Singleton_users.array_admin.set(localizacion, admin);
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no exsiste");
			}
		}
	}
	
	public static void update_client(Client username) {
		int localizacion = -1;
		localizacion = func_find.find_client(username);
		if (localizacion != -1) {
			username = (Client)func_users.update(username);
			Singleton_users.array_client.set(localizacion, username);
		} else {
			JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
		}
	}
	
	public static void update_vip(Vip username) {
		int localizacion = -1;
		localizacion = func_find.find_vip(username);
		if (localizacion != -1) {
			username = (Vip)func_users.update(username);
			Singleton_users.array_vip.set(localizacion, username);
		} else {
			JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
		}
	}
	
	public static void update_client_CRUD(String username) {
		int localizacion = -1;
		Client client = null;
		if (Singleton_users.array_admin.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			client = (Client) func_users.username_client_dummies(username);
			localizacion = func_find.find(client);
			if (localizacion != 1) {
				client = Singleton_users.array_client.get(localizacion);
				client = (Client) func_users.update(client);
				Singleton_users.array_client.set(localizacion, client);
			} else {
				JOptionPane.showMessageDialog(null, "El usuario no exsiste");
			}
		}
	}
}