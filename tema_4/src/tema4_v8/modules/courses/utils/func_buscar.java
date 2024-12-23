package tema4_v8.modules.courses.utils;

import tema4_v8.modules.courses.classes.Desarrollo_web;
import tema4_v8.modules.courses.classes.Desplegamiento_web;
import tema4_v8.modules.courses.classes.Diseno_web;
import tema4_v8.modules.courses.classes.Singleton;

public class func_buscar {
	
	public static int find_desarrollo (Desarrollo_web desarrollo) {
		for (int i = 0; i <= (Singleton.array_desarrollo.size() -1); i++) {
			if((Singleton.array_desarrollo.get(i).equals(desarrollo)) ) return i;
		}
		return -1;
	}
	
	public static int find_diseno (Diseno_web diseno) {
		for (int i = 0; i <= (Singleton.array_diseno.size() -1); i++) {
			if((Singleton.array_diseno.get(i).equals(diseno)) ) return i;
		}
		return -1;
	}
	
	public static int find_desplegamiento (Desplegamiento_web desplegamiento) {
		for (int i = 0; i <= (Singleton.array_desplegamiento.size() -1); i++) {
			if((Singleton.array_desplegamiento.get(i).equals(desplegamiento)) ) return i;
		}
		return -1;
	}
}
