package tema4_v7.modules.course.utils;

import javax.swing.JOptionPane;

import tema4_v7.classes.Fecha;
import tema4_v7.modules.course.classes.Cursos;
import tema4_v7.modules.course.classes.Desarrollo_web;

public class func_updates {
	public static Fecha fecha_i(String titulo, Cursos curso) {
			
			Fecha fecha = null;
			fecha = func_fecha.crear_entre2(titulo, ((Desarrollo_web) curso).get_fecha_confirmacion_f(), curso.get_fecha_f());
		    
		   curso.set_precio(func_precio.calcular_precio(fecha, curso.get_fecha_f(), curso.get_precioHora(),curso.get_horasDias()));
		    return fecha;
	}
	 
	public static Fecha fecha_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crar_fecha_posterior(titulo, curso.get_fecha_i());
		
		curso.set_precio(func_precio.calcular_precio(curso.get_fecha_i(), fecha, curso.get_precioHora(), curso.get_horasDias()));
		return fecha;
	}

	/*DESARROLLO WEB*/
	public static Fecha fecha_confirmacion_i(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo, ((Desarrollo_web) curso).get_fecha_inscripcion_f(), ((Desarrollo_web) curso).get_fecha_confirmacion_f());
		return fecha;
	}
	
	public static Fecha fecha_confirmacion_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo, ((Desarrollo_web) curso).get_fecha_confirmacion_i(), curso.get_fecha_i());
		return fecha;
	}
	
	public static Fecha fecha_inscripcion_i(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_anterior(titulo, ((Desarrollo_web) curso).get_fecha_inscripcion_f());
		
		return fecha;
	}
	
	public static Fecha fecha_inscripcion_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo, ((Desarrollo_web) curso).get_fecha_inscripcion_i(), ((Desarrollo_web) curso).get_fecha_confirmacion_i());
		return fecha;
	}
	/*DESARROLLO WEB*/
	
	/*DISEÑO WEB*/
	
	/*DISEÑO WEB*/
	
}