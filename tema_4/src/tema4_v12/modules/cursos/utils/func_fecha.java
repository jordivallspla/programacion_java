package tema4_v12.modules.cursos.utils;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import tema4_v12.classes.Fecha;

public class func_fecha {
	public static Fecha craar(String titulo) {

		Fecha fecha = null;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			}
		} while (!fecha.comprobarFechas());

		return fecha;
	}
	
	/*Fecha  posterior dias despues */
	public static Fecha crear_fecha_dias_despues(String titulo, Fecha fecha1, int dias) {
		Fecha  fecha = null;
		boolean valido = false;
		int comprobar = 0;
		int dias_diferencia = 0;
		
		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha(fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias_diferencia = fecha.restarFechas(fecha1);
				comprobar = fecha1.compararFechas(fecha);
				
				if (comprobar == -1 && dias_diferencia == dias) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser " + dias + " dias despues de " + fecha1.toString());
				}
			}
		} while (!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_dias_antes(String titulo, Fecha fecha1, int dias) {
		Fecha  fecha = null;
		boolean valido = false;
		int comprobar = 0;
		int dias_diferencia = 0;
		
		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha(fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias_diferencia = fecha.restarFechas(fecha1);
				comprobar = fecha1.compararFechas(fecha);
				
				if (comprobar == 1 && dias_diferencia == dias) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser " + dias + " dias antes  de " + fecha1.toString());
				}
			}
		} while (!valido);
		
		return fecha;
	}
	
	public static Fecha crear_entre2(String titulo, Fecha fecha1, Fecha fecha2) {
	    Fecha fecha = null;
	    boolean valido = false;
	    int comprobarFecha1 = 0;
	    int comprobarFecha2 = 0;

	    do {
	        String fecha_s = validar_regex.validar_reg_fecha(titulo);
	        fecha = new Fecha(fecha_s);

	        if (!fecha.comprobarFechas()) {
	            JOptionPane.showMessageDialog(null, "Fecha Inválida");
	        } else {
	            comprobarFecha1 = fecha1.compararFechas(fecha); 
	           comprobarFecha2 = fecha2.compararFechas(fecha);  

	            if (comprobarFecha1 == -1 && comprobarFecha2 == 1) {
	                valido = true;  
	            } else {
	                if (comprobarFecha1 != -1) {
	                    JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a " + fecha1.toString());
	                }
	                if (comprobarFecha2 != 1) {
	                    JOptionPane.showMessageDialog(null, "La fecha debe ser anterior a " + fecha2.toString());
	                }
	            }
	        }
	    } while (!valido);

	    return fecha;
	}

	public static Fecha crar_fecha_posterior(String titulo, Fecha fecha1) {

		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);

				if (comprobar == -1) {
					valido = true;

				} else if (comprobar == 0) {
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser posterior a  " + fecha1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es anterior" + "\n" + "Debe de ser posterior a " +  fecha1.toString());
				}
			}
		} while (!valido);

		return fecha;
	} 

	public static Fecha crear_fecha_anterior(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);

				if (comprobar == 1) {
					valido = true;

				} else if (comprobar == 0) {
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es posterior" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				}
			}
		} while (!valido);

		return fecha;
	} 
	
	public static Fecha crear_fecha_compra(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);

				if (comprobar == 1) {
					valido = true;

				} else if (comprobar == 0) {
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es posterior" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				}
			}
		} while (!valido);

		return fecha;
	} 
	
	public static Fecha crear_fecha_automatic(String titulo, Fecha fecha_i, int dies) {
	    Fecha fecha = null;
	    String fecha_s;
	    
	    GregorianCalendar cal = new GregorianCalendar(fecha_i.get_anio(), fecha_i.get_mes() - 1, fecha_i.get_dia());
	    
	    cal.add(GregorianCalendar.DAY_OF_MONTH, -dies);
	    
	    do {

	        int anio = cal.get(GregorianCalendar.YEAR);
	        int mes = cal.get(GregorianCalendar.MONTH) + 1; 
	        int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
	        
	        fecha_s = String.format("%02d/%02d/%04d", dia, mes, anio); 
	        fecha = new Fecha(fecha_s);
	        
	        if (!fecha.comprobarFechas()) {
	            JOptionPane.showMessageDialog(null, "Fecha Inválida");
	        }
	    } while (!fecha.comprobarFechas());
	    
	    return fecha;
	}
	
	public static Fecha crear_fecha_automatic_suma(String titulo, Fecha fecha_i, int dies) {
	    Fecha fecha = null;
	    String fecha_s;
	    
	    GregorianCalendar cal = new GregorianCalendar(fecha_i.get_anio(), fecha_i.get_mes() - 1, fecha_i.get_dia());
	    
	    cal.add(GregorianCalendar.DAY_OF_MONTH, +dies);
	    
	    int anio = cal.get(GregorianCalendar.YEAR);
        int mes = cal.get(GregorianCalendar.MONTH) + 1; 
        int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
        
        fecha_s = String.format("%02d/%02d/%04d", dia, mes, anio);
        fecha = new Fecha(fecha_s);

	    
	    return fecha;
	}
	
}