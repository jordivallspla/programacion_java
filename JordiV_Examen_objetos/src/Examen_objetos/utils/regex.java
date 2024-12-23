

package Examen_objetos.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class regex {

	private static final String plan_id="^([A-Z]{1})([0-9]{4})$";
	private static final String plan_fecha="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
	private static final String regex_horasDias= "^[1-8]$";
	private static final String regex_email ="[^ @]+@(gmail|hotmail).[a-z]{1,3}";
	private static final String regex_phone = "\\(?[0-9]{2,4}\\)?[ -]?[0-9]{3,4}[ -]?[0-9]{3,4}";


	

	
	public static boolean validar_id(String id) {
		Pattern pattern = Pattern.compile(plan_id);
		Matcher matcher = pattern.matcher(id);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null, "El formato debe de ser 1 letra mayuscula 4 digitos");
		return false;
	}
	
	public static boolean validar_telefono(String tlf) {
		Pattern pattern = Pattern.compile(regex_phone);
		Matcher matcher = pattern.matcher(tlf);
		
		if (matcher.matches()) {
			return true;
		}
		
		JOptionPane.showMessageDialog(null,"Dame un telefono  válido" + "\n 912 345 678 \n 912345678 \n 91-234-5678 ");
		return false;
	}
	
	public static boolean validar_email(String email) {
		Pattern pattern = Pattern.compile(regex_email);
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null,"Dame un email válido");
		return false;
	}
	
	public static boolean validar_fecha(String fecha) {
		Pattern pattern = Pattern.compile(plan_fecha);
		Matcher matcher = pattern.matcher(fecha);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null,"Dame un String con formato 01/01/2013");
		return false;
	}
	
	public static boolean validar_horasDias(int horasDias) {
		//Pattern pattern = Pattern.compile(regex_horasDias);
		Matcher matcher = Pattern.compile(regex_horasDias).matcher(String.format("%d", horasDias));
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null,"El máximo de horas que se puden hacer al dia son 8 y el minimo 1");
		return false;
	}
		
}
