package tema4_v13.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v13.modules.cursos.classes.Singleton;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.func_find;
import tema4_v13.modules.users.utils.func_users;

public class func_updates_users {
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
	
	public static void update_client_CURD(String username) {
		int localizacion = -1;
		Client client = null;
		if (Singleton.array_desarrollo.isEmpty()) {
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
