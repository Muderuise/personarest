package comun.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="persona")
public class Persona {
	@Id
	private int id;
	private String nombre;
	private String apellido;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
