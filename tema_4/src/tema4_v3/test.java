package tema4_v3;

public class test {

	public static void main(String[] args) {
			
		String fecha="";
		do {
			fecha = validadors.validar_string("Dame un String", "fecha");
		}while(!regex.validar_fecha(fecha));
	}
}
