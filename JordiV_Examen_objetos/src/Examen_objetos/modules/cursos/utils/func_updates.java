package Examen_objetos.modules.cursos.utils;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.IA;
import Examen_objetos.utils.validadors;

public class func_updates {
	public static Fecha fecha_i(String titulo, Cursos curso) {
			Fecha fecha = null;
			fecha = func_fecha.crear_entre2(titulo, ((Desarrollo_web) curso).get_fecha_confirmacion_f(), curso.get_fecha_f());
			curso.set_precio(func_precio.calcular_precio(fecha, curso.get_fecha_f(), curso.get_precioHora(),curso.get_horasDias()));
		    return fecha;
	}
	
	public static Fecha fecha_i_2(String titulo,  Fecha fecha1, Fecha fecha2, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo,fecha2 , curso.get_fecha_f());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora(), curso.get_horasDias(), fecha1, fecha2, curso.get_fecha_compra()));
	    return fecha;
}
	 
	public static Fecha fecha_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crar_fecha_posterior(titulo, curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio(curso.get_fecha_i(), fecha, curso.get_precioHora(), curso.get_horasDias()));
		return fecha;
	}
	
	public static Fecha fecha_f_2(String titulo, Fecha fecha1, Fecha fecha2, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crar_fecha_posterior(titulo, curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora(), curso.get_horasDias(), fecha1, fecha2, curso.get_fecha_compra()));
		return fecha;
	}
	
	public static Fecha fecha_compra(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_compra(titulo, curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio(curso.get_fecha_i(), fecha, curso.get_precioHora(), curso.get_horasDias()));		
		return fecha;
	}
	
	public static Fecha fecha_compra_2(String titulo, Fecha fecha1, Fecha fecha2, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_compra(titulo, curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora(), curso.get_horasDias(), fecha1, fecha2, curso.get_fecha_compra()));
		return fecha;
	}
	
	public static int horasDias(Cursos curso) {
		int horasDias =  validar_regex.validar_horas();
		curso.set_precio(func_precio.calcular_precio(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora(),horasDias));
		return horasDias;
	}
	
	public static int horasDias_2(Cursos curso, Fecha fecha1, Fecha fecha2) {
		int horasDias =  validar_regex.validar_horas();
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora(), horasDias, fecha1, fecha2, curso.get_fecha_compra()));
		return horasDias;
	}
	
	public static int precioHoras(Cursos curso) {
		int precioHoras = validadors.validar_int("Dame num", "precioHora");
		curso.set_precio(func_precio.calcular_precio(curso.get_fecha_i(), curso.get_fecha_f(), precioHoras, curso.get_horasDias()));
		return precioHoras;
	}
	
	public static int precioHoras_2(Cursos curso, Fecha fecha1, Fecha fecha2) {
		int precioHoras = validadors.validar_int("Dame num", "precioHora");
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), precioHoras ,curso.get_horasDias(), fecha1, fecha2, curso.get_fecha_compra()));
		return precioHoras;
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
	public static Fecha f_c_promocion_i (String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_anterior(titulo,((Diseno_web) curso).get_f_c_promocion_f());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora() ,curso.get_horasDias(), fecha,((Diseno_web) curso).get_f_c_promocion_f() , curso.get_fecha_compra()));
		return fecha;
	}
	
	public static Fecha f_c_promocion_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo,((Diseno_web) curso).get_f_c_promocion_i() , curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora() ,curso.get_horasDias(), ((Diseno_web) curso).get_f_c_promocion_i(), fecha , curso.get_fecha_compra()));
		return fecha;
	}
	/*DISEÑO WEB*/
	
	public static Fecha f_cupon_ini (String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_anterior(titulo,((IA) curso).get_f_cupon_fin());
		return fecha;
	}
	
	public static Fecha f_cupon_fin(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo,((IA) curso).get_f_cupon_ini() , curso.get_fecha_i());
		return fecha;
	}
	
	
	/*DESPLEGAMIENTO WEB*/
	public static Fecha fecha_ultimas_plazas_i (String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_fecha_anterior(titulo, ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora() ,curso.get_horasDias(), fecha,((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f() , curso.get_fecha_compra()));
		return fecha;
	}
	
	public static Fecha fecha_ultimas_plazas_f(String titulo, Cursos curso) {
		Fecha fecha = null;
		fecha = func_fecha.crear_entre2(titulo,((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i() , curso.get_fecha_i());
		curso.set_precio(func_precio.calcular_precio_ultimas_plazas(curso.get_fecha_i(), curso.get_fecha_f(), curso.get_precioHora() ,curso.get_horasDias(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), fecha , curso.get_fecha_compra()));
		return fecha;
	}
	/*DESPLEGAMIENTO WEB*/	
}