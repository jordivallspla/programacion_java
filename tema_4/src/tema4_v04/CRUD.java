package tema4_v04;

import javax.swing.JOptionPane;

import tema4_v03.validadors;

public class CRUD {

	/* CRUD */

	/* CREATE (crear) */
	public static Cursos create(int curso) {

		Cursos objeto = null;

		String ID_course = validar_regex.validar_reg_id();
		String titulo = validadors.validar_string("Dame un String", "titulo");
		String descripcion = validadors.validar_string("Dame un String", "descripcion");
		String categoria = (String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");
		String dificultad = (String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");
		int precio = validadors.validar_int("Dame num", "num");
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_dias_despues("fecha_f", fecha_i, 20);

		if (curso == 0) {

			Fecha fecha_inscripcion_i = func_fecha.crear_fecha_dias_antes("fecha_inscripcion_i", fecha_i, 7);
			Fecha fecha_inscripcion_f = func_fecha.crear_fecha_dias_despues("fecha_inscripcion_f",
					fecha_inscripcion_i,3);
			Fecha fecha_confirmacion_i = func_fecha.crear_fecha_dias_despues("fecha_confirmacion_i",
					fecha_inscripcion_f,1);
			Fecha fecha_confirmacion_f = func_fecha.crear_fecha_dias_despues("fecha_confirmacion_i",
					fecha_confirmacion_i, 2);

			objeto = new Desarrollo_web(ID_course, titulo, descripcion, categoria, dificultad, precio, fecha_i, fecha_f,
					fecha_confirmacion_i, fecha_confirmacion_f, fecha_inscripcion_i, fecha_inscripcion_f);
		}

		if (curso == 1) {

			Fecha f_c_promocion_i = func_fecha.crear_fecha_anterior("f_c_promocion_i", fecha_i);
			Fecha f_c_promocion_f = func_fecha.crear_entre2("f_c_promocion_f", f_c_promocion_i, fecha_i);

			objeto = new Diseno_web(ID_course, titulo, descripcion, categoria, dificultad, precio, fecha_i, fecha_f,
					f_c_promocion_i, f_c_promocion_f);
		}
		if (curso == 2) {

			Fecha fecha_ultimas_plazas_i = func_fecha.crear_fecha_anterior("fecha_ultimas_plazas_i", fecha_i);
			Fecha fecha_ultimas_plazas_f = func_fecha.crear_entre2("fecha_ultimas_plazas_f", fecha_ultimas_plazas_i,
					fecha_i);

			objeto = new Desplegamiento_web(ID_course, titulo, descripcion, categoria, dificultad, precio, fecha_i,
					fecha_f, fecha_ultimas_plazas_i, fecha_ultimas_plazas_f);
		}
		return objeto;
	}
	/* CREATE (crear) */

	/* READALL */
	public static void readall(Cursos objeto) {
		if (objeto != null) {
			if (objeto instanceof Desarrollo_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
			if (objeto instanceof Diseno_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
			if (objeto instanceof Desplegamiento_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objeto");
		}
	}

	/* READALL */

	/* READONE */
	public static void readone(Cursos objeto) {
		Object menu_readone = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i",
				"fecha_f", "fecha_confirmacion_i ", "fecha_confirmacion_f", "fecha_inscripcion_i",
				"fecha_inscripcion_f", "salir" };
		Object atributos_diw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i",
				"fecha_f", "f_c_promocion_i", "f_c_promocion_f", "salir" };
		Object atributos_despw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio",
				"fecha_i", "fecha_f", "fecha_ultimas_plazas_i", "fecha_ultimas_plazas_f", "salir" };
		int salir = 0;

		if (objeto != null) {
			if (objeto instanceof Desarrollo_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,
						atributos_dw[12]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 12;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 12;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 12;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 12;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 12;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 12;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 12;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 12;
							break;
						case "fecha_confirmacion_i":
							JOptionPane.showMessageDialog(null, "fecha_confirmacion_i");
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_confirmacion_i());
							salir = 12;
							break;
						case "fecha_confirmacion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_confirmacion_f());
							salir = 12;
							break;
						case "fecha_inscripcion_i":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_inscripcion_i());
							salir = 12;
							break;
						case "fecha_inscripcion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_inscripcion_f());
							salir = 12;
							break;
						case "salir":
							break;
					}// end switch
				} while (salir != 12);
			}
			if (objeto instanceof Desplegamiento_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_despw,
						atributos_despw[10]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 10;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 10;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 10;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 10;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 10;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 10;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 10;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 10;
							break;
						case "fecha_ultimas_plazas_i":
							JOptionPane.showMessageDialog(null,
									((Desplegamiento_web) objeto).get_fecha_ultimas_plazas_i());
							salir = 10;
							break;
						case "fecha_ultimas_plazas_f":
							JOptionPane.showMessageDialog(null,
									((Desplegamiento_web) objeto).get_fecha_ultimas_plazas_f());
							salir = 10;
							break;
						case "salir":
							break;
					}// end switch
				} while (salir != 10);
			}
			if (objeto instanceof Diseno_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_diw,
						atributos_diw[10]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 10;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 10;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 10;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 10;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 10;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 10;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 10;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 10;
							break;
						case "f_c_promocion_i":
							JOptionPane.showMessageDialog(null, ((Diseno_web) objeto).get_f_c_promocion_i());
							salir = 10;
							break;
						case "f_c_promocion_f":
							JOptionPane.showMessageDialog(null, ((Diseno_web) objeto).get_f_c_promocion_i());
							salir = 10;
							break;
						case "salir":
							break;
					}// end switch
				} while (salir != 10);
			}
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objeto");
		} // end if
	}
	/* READONE */

	/* UPDATE */
	public static Cursos update(Cursos curso) {

		Object menu_update = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i",
				"fecha_f", "fecha_confirmacion_i ", "fecha_confirmacion_f", "fecha_inscripcion_i",
				"fecha_inscripcion_f", "salir" };
		Object atributos_diw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i",
				"fecha_f", "f_c_promocion_i", "f_c_promocion_f", "salir" };
		Object atributos_despw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio",
				"fecha_i", "fecha_f", "fecha_ultimas_plazas_i", "fecha_ultimas_plazas_f", "salir" };
		int salir = 0;

		if (curso != null) {
			if (curso instanceof Desarrollo_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,
							atributos_dw[12]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria(
									(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad(
									(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precio":
							curso.set_precio(validadors.validar_int("Dame un número", "num"));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_fecha.craar("fecha_i"));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_fecha.crar_fecha_posterior("fecha_f", curso.get_fecha_i()));
							break;
						case "fecha_confirmacion_i":
							((Desarrollo_web) curso).set_fecha_confirmacion_i(func_fecha.crear_fecha_dias_despues("fecha_confirmacion_i",((Desarrollo_web) curso).get_fecha_inscripcion_i(), 1));
							break;
						case "fecha_confirmacion_f":
							((Desarrollo_web) curso).set_fecha_confirmacion_f(func_fecha.crear_fecha_dias_despues("fecha_confirmacion_f", ((Desarrollo_web) curso).get_fecha_confirmacion_i(), 2));
							break;
						case "fecha_inscripcion_i":
							((Desarrollo_web) curso).set_fecha_inscripcion_i(func_fecha.crear_fecha_dias_antes("fecha_inscripcion_i", curso.get_fecha_i(), 7));
							break;
						case "fecha_inscripcion_f":
							((Desarrollo_web) curso).set_fecha_inscripcion_f(func_fecha.crear_fecha_dias_despues("fecha_inscripcion_f", ((Desarrollo_web) curso).get_fecha_confirmacion_i(), 3));
							break;
						case "salir":
							salir = 12;
							break;
					} // end switch
				} while (salir != 12);
				return curso;
			} // end if

			if (curso instanceof Diseno_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_diw,
							atributos_diw[10]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria(
									(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad(
									(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precio":
							curso.set_precio(validadors.validar_int("Dame un número", "num"));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_fecha.craar("fecha_i"));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_fecha.craar("fecha_f"));
							break;
						case "f_c_promocion_i":
							((Diseno_web) curso).set_f_c_promocion_i(func_fecha.crear_fecha_anterior("f_c_promocion_i", curso.get_fecha_f()));
							break;
						case "f_c_promocion_f":
							((Diseno_web) curso).set_f_c_promocion_f(func_fecha.crear_entre2("f_c_promocion_f",((Diseno_web) curso).get_f_c_promocion_i(), curso.get_fecha_i() ));
							break;
						case "salir":
							salir = 10;
							break;
					} // end switch
				} while (salir != 10);
				return curso;
			} // end if

			if (curso instanceof Desplegamiento_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_despw,
							atributos_despw[10]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria(
									(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad(
									(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precio":
							curso.set_precio(validadors.validar_int("Dame un número", "num"));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_fecha.craar("fecha_i"));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_fecha.craar("fecha_f"));
							break;
						case "fecha_ultimas_plazas_i":
							((Desplegamiento_web) curso)
									.set_fecha_ultimas_plazas_i(func_fecha.crear_fecha_anterior("fecha_ultimas_plazas_i", curso.get_fecha_i()));
							break;
						case "fecha_ultimas_plazas_f":
							((Desplegamiento_web) curso)
									.set_fecha_ultimas_plazas_f(func_fecha.crear_entre2("fecha_ultimas_plazas_f", ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), curso.get_fecha_i()));
							break;
						case "salir":
							salir = 10;
							break;
					} // end switch
				} while (salir != 10);
				return curso;
			} // end if
			return curso;
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objecto");
			return null;
		}
	}
	/* UPDATE */

	/* DELETE */
	public static Cursos delete(Cursos curso) {
		if (curso != null) {
			if (curso instanceof Desarrollo_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
			if (curso instanceof Diseno_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
			if (curso instanceof Desplegamiento_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
		} else {
			return curso;
		}
		return curso;
	}
	/* DELETE */
}