package personas;

public class Persona {

	private String nombre;
	private int edad;

	//constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

    //getters
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		
		
		return nombre;
	}
	
	
	//toString
		@Override
	public String toString() {
		return "[" + nombre + " (" + edad + ")]";
	}
	
	
	
}
