package object_fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import tema4_v03.validadors;
import tema4_v03.validar_regex;

public class test {

	public static void main(String[] args) throws ParseException {

		Fecha fecha = null;
		Fecha fecha2 = null;
		
		String fecha_i =  validadors.validar_string("Dame un String", "titulo");
		String fecha_f =  validadors.validar_string("Dame un String", "titulo");
		
		fecha = new Fecha (fecha_i);
		fecha2 = new Fecha (fecha_f);
		//JOptionPane.showMessageDialog(null, fecha.get_dia());
		//JOptionPane.showMessageDialog(null, fecha.get_mes());
		//JOptionPane.showMessageDialog(null, fecha.get_anio());
		JOptionPane.showMessageDialog(null, fecha.toDate());
		JOptionPane.showMessageDialog(null, fecha.toString());
		JOptionPane.showMessageDialog(null, fecha.comprobarFechas());
		JOptionPane.showMessageDialog(null, fecha2.comprobarFechas());
		JOptionPane.showMessageDialog(null, fecha.compararFechas(fecha2));
		JOptionPane.showMessageDialog(null, fecha.restarFechas(fecha2));
	}
}
