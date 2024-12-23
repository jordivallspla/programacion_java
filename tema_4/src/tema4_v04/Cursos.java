package tema4_v04;

public abstract class Cursos {
	/* ATRIBUTOS */
	private String ID_course;
	private String titulo;
	private String descripcion;
	private String categoria;
	private String dificultad;
	private int precio;
	private Fecha fecha_i;
	private Fecha fecha_f;
	/* ATRIBUTOS */

	/* MÉTPDPS */

	/* CONSTRUCTOR */
	public Cursos(String iD_course, String titulo, String descripcion, String categoria, String dificultad, int precio,
			Fecha fecha_i2, Fecha fecha_f2) {
		this.ID_course = iD_course;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.dificultad = dificultad;
		this.precio = precio;
		this.fecha_i = fecha_i2;
		this.fecha_f = fecha_f2;
	}
	/* CONSTRUCTOR */

	/* GET */
	String get_ID_course() {
		return this.ID_course;
	}

	String get_titulo() {
		return this.titulo;
	}

	String get_descripcion() {
		return this.descripcion;
	}

	String get_categoria() {
		return this.categoria;
	}

	String get_dificultad() {
		return this.dificultad;
	}

	int get_precio() {
		return this.precio;
	}

	Fecha get_fecha_i() {
		return this.fecha_i;
	}

	Fecha get_fecha_f() {
		return this.fecha_f;
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

	public int set_precio(int precio) {
		this.precio = precio;
		return precio;
	}

	public Fecha set_fecha_i(Fecha fecha_i) {
		this.fecha_i = fecha_i;
		return fecha_i;
	}

	public Fecha set_fecha_f(Fecha fecha_f) {
		this.fecha_f = fecha_f;
		return fecha_f;
	}
	/* SET */

	/* TOSTRING */
	public abstract String toString();
	/* TOSTRING */

}