package tema4_v03;

public class Desarrollo_web extends Cursos{
	
	/*ATRIBUTOS*/
	private String fecha_confirmacion_i;
	private String fecha_confirmacion_f;
	private String fecha_inscripcion_i;
	private String fecha_inscripcion_f;
	/*ATRIBUTOS*/

	/*CONSTRUCTOR*/
	public Desarrollo_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad, int precio, String fecha_i, String fecha_f, String fecha_confirmacion_i, String fecha_confirmacion_f, String fecha_inscripcion_i, String fecha_inscripcion_f) {
		super(iD_course, titulo, descripcion, categoria, dificultad, precio, fecha_i, fecha_f);
		this.fecha_confirmacion_i = fecha_confirmacion_i;
		this.fecha_confirmacion_f = fecha_confirmacion_f;
		this.fecha_inscripcion_i  =  fecha_inscripcion_i;
		this.fecha_inscripcion_f  =  fecha_inscripcion_f;
	}
	/*CONSTRUCTOR*/

	/*GET*/
	public String get_fecha_confirmacion_i() {
		return this.fecha_confirmacion_i;
	}
	
	public String get_fecha_confirmacion_f() {
		return this.fecha_confirmacion_f;
	}
	
	public String get_fecha_inscripcion_i() {
		return this.fecha_inscripcion_i;
	}
	
	public String get_fecha_inscripcion_f() {
		return this.fecha_inscripcion_f;
	}
	/*GET*/

	/*SET*/
	public String set_fecha_confirmacion_i(String fecha_confirmacion_i) {
		this.fecha_confirmacion_i = fecha_confirmacion_i;
		return fecha_confirmacion_i;
	}
	
	public String set_fecha_confirmacion_f(String fecha_confirmacion_f) {
		this.fecha_confirmacion_f = fecha_confirmacion_f;
		return fecha_confirmacion_f;
	}
	
	public String set_fecha_inscripcion_i(String fecha_inscripcion_i ) {
		this.fecha_inscripcion_i = fecha_inscripcion_i;
		return fecha_inscripcion_i;
	}
	
	public String set_fecha_inscripcion_f(String fecha_inscripcion_f) {
		this.fecha_inscripcion_f= fecha_inscripcion_f;
		return fecha_inscripcion_f;
	}
	/*SET*/

	/*TOSTRING*/	
	public String toString() { 
		return "ID_Course: " + super.get_ID_course() + "\n" +
						"titulo: " + get_titulo() + "\n" +
						"descripcion: " + get_descripcion() + "\n" +
						"categoria: " + get_categoria() + "\n" +
						"dificultad: " + get_dificultad() + "\n" +
						"precio: " + get_precio() + "€" + "\n" +
						"fecha_i: " + get_fecha_i() + "\n" +
						"fecha_f: " + get_fecha_f() + "\n" +
						"fecha_confirmacion_i: " + this.get_fecha_confirmacion_i() + "\n" + 
						"fecha_confirmacion_f: " + this.get_fecha_confirmacion_f() + "\n" + 
						"fecha_inscripcion_i: " + this.get_fecha_inscripcion_i() + "\n" +
						"fecha_inscripcion_f: " + this.get_fecha_inscripcion_f();
	}
	/*TOSTRING*/
}
