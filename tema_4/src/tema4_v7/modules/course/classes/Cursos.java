package tema4_v7.modules.course.classes;

import tema4_v7.classes.Fecha;

public abstract class Cursos {
	/* ATRIBUTOS */
	private String ID_course;
	private String titulo;
	private String descripcion;
	private String categoria;
	private String dificultad;
	private Fecha fecha_i;
	private Fecha fecha_f;
	private Fecha fecha_compra;
	private int precio;
	private int precioHora;
	private int horasDias;
	/* ATRIBUTOS */

	/* MÉTPOPS */

	/* CONSTRUCTOR */
	public Cursos(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			Fecha fecha_i, Fecha fecha_f,int precioHora, int horasDias, Fecha fecha_compra, int precio) {
		this.ID_course = iD_course;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.dificultad = dificultad;
		this.fecha_i = fecha_i;
		this.fecha_f = fecha_f;
		this.fecha_compra = fecha_compra;
		this.precioHora = precioHora;
		this.horasDias = horasDias;
		this.precio = precio;
	}
	/* CONSTRUCTOR */

	/* GET */
	public String get_ID_course() {
		return this.ID_course;
	}

	public String get_titulo() {
		return this.titulo;
	}

	public String get_descripcion() {
		return this.descripcion;
	}

	public String get_categoria() {
		return this.categoria;
	}

	public String get_dificultad() {
		return this.dificultad;
	}

	public Fecha get_fecha_i() {
		return this.fecha_i;
	}

	public Fecha get_fecha_f() {
		return this.fecha_f;
	}
	
	public Fecha get_fecha_compra() {
		return this.fecha_compra;
	}
	
	public int get_precioHora() {
		return this.precioHora;
	}
	
	public int get_horasDias() {
		return this.horasDias;
	}
	
	public int get_precio() {
		return this.precio;
	}
	/* GET */

	/* SET */
	public String set_ID_course(String ID_course) {
		this.ID_course = ID_course;
		return ID_course;
	}

	public String set_titulo(String titulo) {
		this.titulo = titulo;
		return titulo;
	}

	public String set_descripcion(String descripcion) {
		this.descripcion = descripcion;
		return descripcion;
	}

	public String set_categoria(String categoria) {
		this.categoria = categoria;
		return categoria;
	}

	public String set_dificultad(String dificultad) {
		this.dificultad = dificultad;
		return dificultad;
	}

	public Fecha set_fecha_i(Fecha fecha_i) {
		this.fecha_i = fecha_i;
		return fecha_i;
	}

	public Fecha set_fecha_f(Fecha fecha_f) {
		this.fecha_f = fecha_f;
		return fecha_f;
	}	
	
	public Fecha set_fecha_compra(Fecha fecha_compra) {
		this.fecha_compra = fecha_compra;
		return fecha_compra;
	}	
	
	public int set_precioHora(int precioHora) {
		this.precioHora = precioHora;
		return precioHora;
	}
	
	public int set_horasDias(int horasDias) {
		this.horasDias = horasDias;
		return horasDias;
	}
	
	public int set_precio(int precio) {
		this.precio = precio;
		return precio;
	}
	/* SET */

	/* TOSTRING */
	public abstract String toString();
	/* TOSTRING */

}