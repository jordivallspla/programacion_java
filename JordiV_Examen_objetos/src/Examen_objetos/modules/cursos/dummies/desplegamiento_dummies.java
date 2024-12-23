package Examen_objetos.modules.cursos.dummies;

import java.util.Random;

import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.utils.func_buscar;
import Examen_objetos.modules.cursos.utils.func_fecha;
import Examen_objetos.modules.cursos.utils.func_precio;

public class desplegamiento_dummies {
	
	public static void crear_desplegamiento() {
		
		int localizacion = -1;
		Cursos ID = crear_ID_desplegamiento();
			//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
			//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID = cargar_desplegamiento();
			Singleton.array_desplegamiento.add(((Desplegamiento_web)ID));
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	
	public static Desplegamiento_web cargar_desplegamiento () {
		
		String ID_course = Singleton.ID_course;
		String titulo = dummies.randomString();
		String descripcion = dummies.randomString();
		String categoria =  "categoria" ; /*(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");*/
		String dificultad = "dificultad" ;/*(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");*/
		Fecha fecha_i = dummies.crear_fecha_random();
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha fecha_ultimas_plazas_i = func_fecha.crear_fecha_automatic("f_c_promocion_i", fecha_i, 7);
		Fecha fecha_ultimas_plazas_f =  func_fecha.crear_fecha_automatic("f_c_promocion_f", fecha_i, 5);
		Fecha fecha_compra =  dummies.generarFechaAleatoriaAnterior(fecha_i.toString());
		int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,fecha_ultimas_plazas_i, fecha_ultimas_plazas_f, fecha_compra);
		
		return new Desplegamiento_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, fecha_ultimas_plazas_i, fecha_ultimas_plazas_f,fecha_compra, precio);
	}
	
	public static Cursos crear_ID_desplegamiento () {
		
		Random random = new Random();
		char letra = (char) ('A' + random.nextInt(26));
		 
		 StringBuilder numeros = new StringBuilder();
		 for (int i = 0; i < 4; i++) {
			 numeros.append(random.nextInt(10));  
	    }
		 
	   String resultado = letra + numeros.toString();
	       
	   Singleton.ID_course = resultado;
	   return new Desplegamiento_web (Singleton.ID_course );
	} 
}
