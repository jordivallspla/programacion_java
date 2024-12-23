package tema4_v11.modules.courses.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v11.modules.courses.classes.Desarrollo_web;
import tema4_v11.modules.courses.classes.Desplegamiento_web;
import tema4_v11.modules.courses.classes.Diseno_web;
import tema4_v11.modules.courses.classes.Singleton;
import tema4_v11.modules.courses.utils.func_buscar;
import tema4_v11.modules.courses.utils.func_cursos;

public class func_delete {
	public static void delete_desarrollo() {
		int localizacion = -1;
		Desarrollo_web ID = null;
		if (Singleton.array_desarrollo.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Desarrollo_web) func_cursos.preguntar_ID_course();
			localizacion =  func_buscar.find(ID);
			if (localizacion != -1) {
				ID = Singleton.array_desarrollo.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Curso borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}
	public static void delete_diseno() {
		int localizacion = -1;
		Diseno_web ID = null;
		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = func_cursos.preguntar_ID_diseno();
			localizacion =  func_buscar.find_diseno(ID);
			if (localizacion != -1) {
				ID = Singleton.array_diseno.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Curso borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}
	
	public static void delete_desplegamiento() {
		int localizacion = -1;
		Desplegamiento_web ID = null;
		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = func_cursos.preguntar_ID_desplegamiento();
			localizacion =  func_buscar.find_desplegamiento(ID);
			if (localizacion != -1) {
				ID = Singleton.array_desplegamiento.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Curso borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}
}
