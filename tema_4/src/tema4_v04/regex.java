

package tema4_v04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class regex {

	private static final String plan_id="^([A-Z]{1})([0-9]{4})$";
	private static final String plan_fecha="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
	
	public static boolean validar_id(String id) {
		Pattern pattern = Pattern.compile(plan_id);
		Matcher matcher = pattern.matcher(id);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null, "El formato debe de ser 1 letra mayuscula 4 digitos");
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
}
