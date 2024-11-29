package tema4_v13.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v10.utils.validadors;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.modules.users.utils.func_find;
import tema4_v13.modules.users.utils.func_users;

public class func_create {
	public static void crear_admin() {
		int localizacion = -1;
		Admin username = func_users.preguntar_username_admin();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_admin();
			Singleton.array_admin.add((Admin) username);
		}
	}
	
	public static void crear_client() {
		int localizacion = -1;
		Client username = func_users.preguntar_username_client();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_client();
			Singleton.array_client.add((Client) username);
		}
	}
}
