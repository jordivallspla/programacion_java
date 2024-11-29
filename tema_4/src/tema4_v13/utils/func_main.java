package tema4_v13.utils;

import javax.swing.JOptionPane;

import tema4_v13.modules.cursos.classes.Desarrollo_web;
import tema4_v13.modules.cursos.classes.Singleton;
import tema4_v13.modules.cursos.dummies.dummies;
import tema4_v13.modules.cursos.utils.CRUD.func_read;
import tema4_v13.modules.cursos.utils.CRUD.func_readone;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.utils.func_users;
import tema4_v13.modules.users.utils.CRUD.func_create;

public class func_main {
	public static String mostrarID() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_desarrollo.size()];
		 for (int i = 0; i < Singleton.array_desarrollo.size(); i++) {
	            Desarrollo_web obj = Singleton.array_desarrollo.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static void dummies() {
		Object manual_auto_menu = null;
		Object manual_auto[] = {"auto", "manual"};
		int n = 0;
		
		manual_auto_menu = menus.combos("Selecciona la opción", "Manual o Automático",manual_auto , manual_auto[0]);
		
		if (manual_auto_menu.toString() == "auto") {
			n = validadors.validar_int("Cuántos objetos quieres automáticos", "Repeticiones");
			for (int i = 0; i < n; i++) {
				dummies.crear_cursos();
			} // end for
		} // end if
	}
	
	public static void log_in() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Client", "Admin", "Salir al menú anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Log in", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Client":
					func_users. log_in_client();
					func_main.menu_cliente();
					break;
				case "Admin":
					func_users. log_in_admin();
					break;
				case "Salir al menú anterior":
					salir = 3;
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void sign_up() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Client", "Admin", "Salir al menú anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Sign up", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Client":
					func_create.crear_client();
					func_main.menu_cliente();
					break;
				case "Admin":
					func_create.crear_admin();
					break;
				case "Salir al menú anterior":
					salir = 3;
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void menu_cliente() {
		Object primer_menu = null;
		Object opciones_pm[] = {"Log out", "Leer Todos", "Leer Uno", "Perfil", "Salir"};
		int salir = 0;
		do {
			primer_menu = menus.combos("Selecciona la opción", "Sign up", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Log out":
					JOptionPane.showMessageDialog(null, "Log out");
					break;
				case "Leer Todos":
					JOptionPane.showMessageDialog(null, "Leer Todos");
					break;
				case "Leer Uno":
					JOptionPane.showMessageDialog(null, "Leer Uno");
					break;
				case "Perfil":
					JOptionPane.showMessageDialog(null, "Perfil");
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 3);
	}
	
	public static void leer_todos() {
		Object primer_menu = null;
		Object segundo_menu = null;
		Object opciones_sg[] = {"Leer Todo", "Leer Uno", "Salir al menú anterior", "Salir"};
		Object opciones_pm[] = {"Desarrollo web", "Diseño web", "Desplegamiento web", "Salir al menú anterior", "Salir"};
		int salir = 0;
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Sign up", opciones_pm, opciones_pm[0]);
			switch (primer_menu.toString()) {
				case "Desarrollo web":
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", opciones_sg, opciones_sg[0]);
					do {
						switch( segundo_menu.toString()) {
						case "Leer Todo":
							func_read.read_desarrollo();
							break;
						case "Leer Uno":
							func_readone.read_one_desarrollo();
							break;
						case "Salir al menú anterior":
							break;
						case "Salir":
							System.exit(0);
							break;
						}
					}while(segundo_menu.toString() =="Salir al menú anterior");
					break;
				case "Diseño web":
					
					break;
				case "Desplegamiento web":
					
					break;
				case "Salir al menú anterior":
					salir = 4;
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		}while( salir != 4);
	}
	
}
