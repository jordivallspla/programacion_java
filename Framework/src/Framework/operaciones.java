package Framework;

public class operaciones {
	public static int suma_dos_num(int num1, int num2) {
		int suma = 0;
		suma = num1 + num2;
		return suma;
	}
	
public static int resta_dos_num(int num1, int num2) {
		int resta = 0;
		resta = num1 - num2;
		return resta;
	}
	
	public static int multi_dos_num(int num1, int num2) {
		int multiplicacion = 0;
		multiplicacion = num1 * num2;
		return multiplicacion;
	}
	
	public static int divide_dos_num(int num1, int num2) {
		int divide = 0;		
		if ((num1 != 0 ) && (num2 != 0)) {		
			divide = num1 / num2;
			return divide;			
		} else {
			return 0;
		}
	}
	
	public static int media(int num1, int num2) {
		int media = 0;		
		media = num1 / num2;		
		return media;
	}
	
	public static void coma() {
		String loquesea = "";
		int coma = 0;
		
		int cont_coma = 0;
		if (coma == 0) {
			loquesea = cont_coma + loquesea;
			coma++;
		} else {
			loquesea = cont_coma + "," + loquesea;
		}
	}
}