package tema4_v8.modules.courses.utils.F_CRUD;

import javax.swing.JOptionPane;

import tema4_v8.utils.menus;
import tema4_v8.modules.courses.classes.Desarrollo_web;
import tema4_v8.modules.courses.classes.Desplegamiento_web;
import tema4_v8.modules.courses.classes.Diseno_web;
import tema4_v8.modules.courses.classes.Singleton;
import tema4_v8.modules.courses.utils.func_buscar;
import tema4_v8.modules.courses.utils.func_cursos;

public class func_read {
	public static void read_desarrollo() {
		Object primer_menu = null;
		Object objetos[] =  {"Leer Todos", "Leer_Uno" ,"Salir"};
		String cad = "";
		int localizacion = -1;
		Desarrollo_web ID = null;
		int salir = 0;
		if (Singleton.array_desarrollo.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			primer_menu =  menus.combos("Selecciona que quieres hacer", "Leer", objetos, objetos[2]);
			switch(primer_menu.toString()) {
				case "Leer Todos":
					for (int i = 0; i <Singleton.array_desarrollo.size(); i++) {
						cad = (Singleton.array_desarrollo.get(i).toString());
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case "Leer_Uno":
					 ID = func_cursos.preguntar_ID_course();
					localizacion =  func_buscar.find_desarrollo(ID);
					if (localizacion != -1) {
						ID = Singleton.array_desarrollo.get(localizacion);
						JOptionPane.showMessageDialog(null, ID.toString());
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
	
	public static void read_diseno() {
		Object primer_menu = null;
		Object objetos[] =  {"Leer Todos", "Leer_Uno" ,"Salir"};
		String cad = "";
		int localizacion = -1;
		Diseno_web ID = null;
		int salir = 0;
		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			primer_menu =  menus.combos("Selecciona que quieres hacer", "Leer", objetos, objetos[2]);
			switch(primer_menu.toString()) {
				case "Leer Todos":
					for (int i = 0; i <Singleton.array_diseno.size(); i++) {
						cad = (Singleton.array_diseno.get(i).toString());
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case "Leer_Uno":
					 ID = func_cursos.preguntar_ID_diseno();
					localizacion =  func_buscar.find_diseno(ID);
					if (localizacion != -1) {
						ID = Singleton.array_diseno.get(localizacion);
						JOptionPane.showMessageDialog(null, ID.toString());
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
	public static void read_desplegamiento() {
		Object primer_menu = null;
		Object objetos[] =  {"Leer Todos", "Leer_Uno" ,"Salir"};
		String cad = "";
		int localizacion = -1;
		Desplegamiento_web ID = null;
		int salir = 0;
		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			primer_menu =  menus.combos("Selecciona que quieres hacer", "Leer", objetos, objetos[2]);
			switch(primer_menu.toString()) {
				case "Leer Todos":
					for (int i = 0; i <Singleton.array_desplegamiento.size(); i++) {
						cad = (Singleton.array_desplegamiento.get(i).toString());
						JOptionPane.showMessageDialog(null, cad);
					}
					break;
				case "Leer_Uno":
					 ID = func_cursos.preguntar_ID_desplegamiento();
					localizacion =  func_buscar.find_desplegamiento(ID);
					if (localizacion != -1) {
						ID = Singleton.array_desplegamiento.get(localizacion);
						JOptionPane.showMessageDialog(null, ID.toString());
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
}
