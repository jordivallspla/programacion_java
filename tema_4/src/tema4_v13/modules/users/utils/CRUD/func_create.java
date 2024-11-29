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
			JOptionPane.showMessageDialog(null,"El username ya exsiste");
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
			String password =  validadors.validar_string("password", "password");
			//JOptionPane.showMessageDialog(null,"El username ya exsiste");
			JOptionPane.showMessageDialog(null, Singleton.array_client.get(localizacion).get_password());/*username.get_password()*/
			if (password.equals(Singleton.array_client.get(localizacion).get_password())) {
				JOptionPane.showMessageDialog(null,"Funciona");
			} else {
				JOptionPane.showMessageDialog(null,"No Funciona");
			}
		} else {
			username = func_users.crear_client();
			Singleton.array_client.add((Client) username);
		}
	}
}
