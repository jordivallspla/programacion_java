package tema4_v7;

import javax.swing.JOptionPane;

import tema4_v7.classes.Fecha;
import tema4_v7.modules.course.utils.func_fecha;

public class test {

	public static void main(String[] args) {
	
		/*Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_dias_despues("fecha_f", fecha_i, 20);

		int preuPerHora = 20;
		int horesPerDia = 8;

		int diesCurs = fecha_i.restarFechas(fecha_f);

		int preuTotal = diesCurs * horesPerDia * preuPerHora;

		System.out.println("El preu total del curs és: " + preuTotal + " euros");*/
		
		/*int num = validar_regex.validar_horas();
		System.out.println(num); */
		
		Fecha fecha_i =  func_fecha.craar("fecha_i");
		Fecha fecha_f =  func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		Fecha fecha_inscripcion_i = func_fecha.crear_fecha_automatic("fecha_inscripcion_i", fecha_i, 7);
		Fecha fecha_inscripcion_f = func_fecha.crear_fecha_automatic("fecha_inscripcion_f", fecha_i, 5);
		
		
		System.out.println(fecha_i + "fecha_i"); 
		System.out.println(fecha_f + "fecha_f"); 
		System.out.println(fecha_inscripcion_i +"fecha_inscripcion_i"); 
		System.out.println(fecha_inscripcion_f +"fecha_inscripcion_f"); 
	}
}