package tema4_v13.modules.users.dummies;

import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v13.classes.Fecha;

public class dummies_users {
	public static String randomString() {
		 Random random = new Random();
	        
	        // Longitud aleatoria entre 5 y 15 (puedes ajustar el rango)
	        int longitud = random.nextInt(11) + 5;  // Genera un número entre 5 y 15
	        
	        StringBuilder resultado = new StringBuilder();
	        
	        // Definir los caracteres posibles (letras y números)
	        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        
	        // Generar el String aleatorio
	        for (int i = 0; i < longitud; i++) {
	            int indice = random.nextInt(caracteres.length());
	            resultado.append(caracteres.charAt(indice));
	        }
	      return resultado.toString();
	}
	
	public static Fecha crear_fecha_random() {
		 Random random = new Random();

	        // Generar un año aleatorio entre 1900 y el año actual
	        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
	        int anio = random.nextInt(anioActual - 1900 + 1) + 1900;

	        // Generar un mes aleatorio entre 1 y 12
	        int mes = random.nextInt(12) + 1;

	        // Generar un día aleatorio válido para el mes y año
	        int dia;
	        switch (mes) {
	            case 2: // Febrero
	                if (esBisiesto(anio)) {
	                    dia = random.nextInt(29) + 1;
	                } else {
	                    dia = random.nextInt(28) + 1;
	                }
	                break;
	            case 4: case 6: case 9: case 11: // Meses con 30 días
	                dia = random.nextInt(30) + 1;
	                break;
	            default: // Meses con 31 días
	                dia = random.nextInt(31) + 1;
	                break;
	        }

	        // Construir y devolver la fecha
	        return new Fecha(dia + "/" + mes + "/" + anio);
	}
	    private static boolean esBisiesto(int anio) {
	        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	    }
	
	 public static String generarFechaAleatoria() {
	        Random random = new Random();

	        int año = random.nextInt(125) + 1900;  

	        int mes = random.nextInt(12) + 1;  
	        
	        int dia;
	        if (mes == 2) {  
	            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
	                dia = random.nextInt(29) + 1;  
	            } else {
	                dia = random.nextInt(28) + 1; 
	            }
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
	            dia = random.nextInt(30) + 1;
	        } else {  
	            dia = random.nextInt(31) + 1;
	        }

	        String fecha = String.format("%02d/%02d/%04d", dia, mes, año);

	        return fecha;
	    }
	 
	 public static Fecha generarFechaPosterior(Fecha fechaNacimiento) {
	        Random random = new Random();

	        // Extraemos el día, mes y año de la fecha de nacimiento
	        int anioNacimiento = fechaNacimiento.get_anio();
	        int mesNacimiento = fechaNacimiento.get_mes();
	        int diaNacimiento = fechaNacimiento.get_dia();

	        // Obtenemos la fecha actual
	        Calendar fechaActual = Calendar.getInstance();
	        int anioActual = fechaActual.get(Calendar.YEAR);

	        // Generar un año aleatorio entre el año de nacimiento + 1 y el año actual
	        int anio = random.nextInt(anioActual - anioNacimiento) + anioNacimiento + 1;

	        // Generar un mes aleatorio entre 1 y 12
	        int mes = random.nextInt(12) + 1;

	        // Generar un día aleatorio válido para el mes y año
	        int dia;
	        switch (mes) {
	            case 2: // Febrero
	                if (esBisiesto(anio)) {
	                    dia = random.nextInt(29) + 1;
	                } else {
	                    dia = random.nextInt(28) + 1;
	                }
	                break;
	            case 4: case 6: case 9: case 11: // Meses con 30 días
	                dia = random.nextInt(30) + 1;
	                break;
	            default: // Meses con 31 días
	                dia = random.nextInt(31) + 1;
	                break;
	        }

	        // Devolver la nueva fecha
	        return new Fecha(dia + "/" + mes + "/" + anio);
	    }
	 
}
