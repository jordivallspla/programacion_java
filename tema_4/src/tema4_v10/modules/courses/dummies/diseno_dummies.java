package tema4_v10.modules.courses.dummies;

import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v10.classes.Fecha;
import tema4_v10.modules.courses.classes.Cursos;
import tema4_v10.modules.courses.classes.Diseno_web;
import tema4_v10.modules.courses.classes.Singleton;
import tema4_v10.modules.courses.utils.func_buscar;
import tema4_v10.modules.courses.utils.func_fecha;
import tema4_v10.modules.courses.utils.func_precio;

public class diseno_dummies {
	
	public static void crear_diseno() {
			
		int localizacion = -1;
		Cursos ID = crear_ID_diseno();
			//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
			//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID = cargar_diseno();
			Singleton.array_diseno.add(((Diseno_web)ID));
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	
	public static Diseno_web cargar_diseno () {
		
		String ID_course = Singleton.ID_course;
		String titulo =  dummies.randomString();
		String descripcion = dummies.randomString();
		String categoria =  "categoria" ; /*(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");*/
		String dificultad = "dificultad" ;/*(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");*/
		Fecha fecha_i = dummies.crear_random();
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha f_c_promocion_i = func_fecha.crear_fecha_automatic("f_c_promocion_i", fecha_i, 7);
		Fecha f_c_promocion_f = func_fecha.crear_fecha_automatic("f_c_promocion_f", fecha_i, 5);
		Fecha fecha_compra = dummies.generarFechaAleatoriaAnterior(fecha_i.toString());
		int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,f_c_promocion_i,  f_c_promocion_f, fecha_compra);
		
		return new Diseno_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, f_c_promocion_i, f_c_promocion_f,fecha_compra, precio);
	}
	
public static Cursos crear_ID_diseno () {
		
		Random random = new Random();
		char letra = (char) ('A' + random.nextInt(26));
		 
		 StringBuilder numeros = new StringBuilder();
		 for (int i = 0; i < 4; i++) {
			 numeros.append(random.nextInt(10));  
	    }
		 
	   String resultado = letra + numeros.toString();
	       
	   Singleton.ID_course = resultado;
	   return new Diseno_web (Singleton.ID_course );
	} 
}
