package object_fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Fecha {
	/*ATRIBUTOS*/
	private int dia;
	private int mes;
	private int anio;
	private String fecha = "";
	/*ATRIBUTOS*/
	
	/*METODOS*/
	
	/*CONSTRUCTOR*/
	public Fecha(String fecha){
		
		String[] SepararArray = null;
		
		SepararArray = fecha.split("/");
		
		this.dia = Integer.parseInt(SepararArray[0]);
		this.mes = Integer.parseInt(SepararArray[1]);
		this.anio = Integer.parseInt(SepararArray[2]);
		
		this.fecha =  fecha;
	}	
	/*CONSTRUCTOR*/
	
	/*GET*/
	int get_dia() {
		return this.dia;
	}
	
	int get_mes() {
		return this.mes;
	}
	
	int get_anio() {
		return this.anio;
	} 
	
	String get_fecha() {
		return fecha;
	}
	/*GET*/
	
	/*SET*/
	public int set_dia(int dia) {
		this.dia = dia;
		return dia;
	}
	
	public int set_mes(int mes) {
		this.mes = mes;
		return mes;
	}
	
	public int set_anio(int anio) {
		this.anio = anio;
		return anio;
	}
	
	public String fecha(String fecha) {
		this.fecha = fecha;
		return fecha;
	}
	/*SET*/
	
	
	public Date toDate() {
		 GregorianCalendar fecha1 = new GregorianCalendar(anio, mes - 1, dia);
		  this.mes++;
		  Date fecha = fecha1.getTime();
		  return fecha;
	}
	
	/*M AYOR MENOR*/
	public String compararFechas(Fecha fecha2) {
		String comprobar = "";
			if (this.anio == fecha2.anio) {
		    	if(this.mes == fecha2.mes) {
		    		if(this.dia == fecha2.dia) {
		    			comprobar = "igual";
		    		} else if (this.dia > fecha2.dia) {
		    			comprobar = "fecha 1 mayor";
		    		} else {
		    			comprobar = "fecha 1 menor";
		    		} // end dia if
		    	} else if(this.mes > fecha2.mes) {
		    		comprobar = "fecha 1 mayor";
		    	} else {
		    		comprobar = "fecha 1 menor";
		    	} // end mes if
		    } else if (this.anio > fecha2.anio) {
	    		comprobar = "fecha 1 mayor";
		    } else {
		    	comprobar = "fecha 1 menor";
		    } // end ano if
		    return comprobar;
	}
	/*M AYOR MENOR*/
	
	public boolean comprobarMes(){
		if((this.mes >= 1) && (this.mes <= 12)){
			return true;
		}else{
			return false;
		}
	}
	public boolean comprobarDia() {
	    GregorianCalendar calendar = new GregorianCalendar();
	    int dias[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    if (calendar.isLeapYear(this.anio)) {
	        dias[2] = 29;
	    }
	    return (this.dia >= 1) && (this.dia <= dias[this.mes]);
	}
	
	/*COMPARAR*/
	public boolean  comprobarFechas() {
		boolean fecha = true;
		if(!this.comprobarDia()) {
			 fecha = false;
		}
		if(!this.comprobarMes()) {
			 fecha = false;
		}
		return fecha;
	}
	/*COMPARAR*/
	
	/*RESTAR*/
	public int restarFechas(Fecha fecha2) {
	    GregorianCalendar cal1 = new GregorianCalendar(this.anio, this.mes - 1, this.dia);
	    GregorianCalendar cal2 = new GregorianCalendar(fecha2.get_anio(), fecha2.get_mes() - 1, fecha2.get_dia());
	   
	    long diferenciaEnMilisegundos = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
	    
	    int diferenciaEnDias = (int) (diferenciaEnMilisegundos / (1000 * 60 * 60 * 24));
	    
	    return diferenciaEnDias;
	}
	/*RESTAR*/
	
	/*TOSTRING*/
	public String toString() {
	    return this.dia + "/" + this.mes + "/" + this.anio;
	}
	/*TOSTRING*/
	/*METODOS*/
}