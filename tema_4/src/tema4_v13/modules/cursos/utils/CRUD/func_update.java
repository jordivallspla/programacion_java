package tema4_v13.modules.cursos.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v13.modules.cursos.classes.Cursos;
import tema4_v13.modules.cursos.classes.Desarrollo_web;
import tema4_v13.modules.cursos.classes.Desplegamiento_web;
import tema4_v13.modules.cursos.classes.Diseno_web;
import tema4_v13.modules.cursos.classes.Singleton;
import tema4_v13.modules.cursos.utils.func_buscar;
import tema4_v13.modules.cursos.utils.func_cursos;

public class func_update {
	public static void update_desarrollo(String ID_a) {
		int localizacion = -1;
		Desarrollo_web ID = null;
		if (Singleton.array_desarrollo.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Desarrollo_web) func_cursos.preguntar_ID_desarrollo(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_desarrollo.get(localizacion);
				 //JOptionPane.showMessageDialog(null, ID);
				 ID = (Desarrollo_web) func_cursos.update(ID);
				 Singleton.array_desarrollo.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_diseno(String ID_a) {
		int localizacion = -1;
		Diseno_web ID = null;
		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Diseno_web)func_cursos.preguntar_ID_diseno(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_diseno.get(localizacion);
				// JOptionPane.showMessageDialog(null, ID);
				 ID = (Diseno_web) func_cursos.update(ID);
				 Singleton.array_diseno.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_desplegamiento(String ID_a) {
		int localizacion = -1;
		Desplegamiento_web ID = null;
		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Desplegamiento_web)  func_cursos.preguntar_ID_desplegamiento1(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_desplegamiento.get(localizacion);
				 JOptionPane.showMessageDialog(null, ID);
				 ID = (Desplegamiento_web) func_cursos.update(ID);
				 Singleton.array_desplegamiento.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
}
