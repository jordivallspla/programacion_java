package tema4_v13.modules.users.dummies;

import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.func_find;

import javax.swing.JOptionPane;

import tema4_v13.classes.Fecha;
import tema4_v13.modules.cursos.dummies.dummies;
import tema4_v13.modules.users.classes.Admin;

public class dummies_admin {

	public static void crear_admin(String username) {
		int localizacion = -1;
		Singleton_users.username = username;
		Admin admin = new Admin (Singleton_users.username);
		localizacion = func_find.find(admin);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "El username ya exsiste");
		} else {
			admin = cargarAdmin(username);
			Singleton_users.array_admin.add(admin);
		}
	}
	
	public static Admin cargarAdmin(String superadmin) {

		if (superadmin.equals("idrojone")) {
			String username = Singleton_users.username;
			String password = "1234";
			String email = "superadmin@gmail.com";
			Fecha fecha_nacimiento = null;
			int edad = 18;
			String nombre = "Jordi";
			String apellidos = "Valls";
			String dni = "12345678A";
			int telefono = 666666666;
			Fecha fecha_alta =  null;	
			int sueldo = 1400;	

			return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos, dni, telefono, fecha_alta, sueldo);
		} else if(superadmin.equals("yomogan")) {
			String username = Singleton_users.username;
			String password = "1234";
			String email = "superadmin@gmail.com";
			Fecha fecha_nacimiento =  null;
			int edad = 18;
			String nombre = "Yolanda";
			String apellidos = "Yolanda";
			String dni = "12345678A";
			int telefono = 666666666;
			Fecha fecha_alta = null;	
			int sueldo = 1400;	

			return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos, dni, telefono, fecha_alta, sueldo);
		} else {
			JOptionPane.showMessageDialog(null, "Error");
			return null;
		}
	}
}