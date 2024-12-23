package Examen_objetos.modules.cursos.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.IA;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.utils.func_buscar;
import Examen_objetos.modules.cursos.utils.func_cursos;

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
	
	public static void delete_ia() {
		int localizacion = -1;
		IA ID = null;
		if (Singleton.array_ia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			ID = (IA) func_cursos.preguntar_ID_ia();
			localizacion =  func_buscar.find_ia(ID);
			if (localizacion != -1) {
				ID = Singleton.array_ia.remove(localizacion);
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
			 ID = (Diseno_web) func_cursos.preguntar_ID_diseno();
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
			 ID = (Desplegamiento_web) func_cursos.preguntar_ID_desplegamiento();
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
