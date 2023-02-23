package personas;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona> {

	
	private int comoOrdenar;
	public static final int ASCENTENTE_EDAD = 1;
	public static final int DESCENTENTE_EDAD = 2;
	public static final int ASCENTENTE_NOMBRE = 4;
	public static final int DESCENTENTE_NOMBRE = 3;
	
	public ComparadorPersonas() {
        //ascendente
		comoOrdenar = ASCENTENTE_EDAD; 
	}

	public void serComoOrdenar(int como) {

		switch(como) {
		
		case ASCENTENTE_EDAD:    comoOrdenar = ASCENTENTE_EDAD;break;
		case DESCENTENTE_EDAD:   comoOrdenar = DESCENTENTE_EDAD;break;
		case ASCENTENTE_NOMBRE:  comoOrdenar = ASCENTENTE_NOMBRE;break;
		case DESCENTENTE_NOMBRE: comoOrdenar = DESCENTENTE_NOMBRE;break;
		
		}
	}
	
	@Override
	public int compare(Persona p1, Persona p2) {
		int devolver = 0;
		
		switch(comoOrdenar) {
		
		case ASCENTENTE_EDAD : devolver = p1.getEdad()-p2.getEdad(); 
		if(devolver==0) devolver = p1.getNombre().charAt(0)-p2.getNombre().charAt(0);
		break;	
		case DESCENTENTE_EDAD: devolver = p2.getEdad()-p1.getEdad(); 
		if(devolver==0) devolver = p2.getNombre().charAt(0)-p1.getNombre().charAt(0);
		break;	
		case ASCENTENTE_NOMBRE: devolver = p1.getNombre().charAt(0)-p2.getNombre().charAt(0); 
		if(devolver==0) devolver = p1.getEdad()-p2.getEdad(); 
		break;
		case DESCENTENTE_NOMBRE: devolver = p1.getNombre().charAt(0)-p2.getNombre().charAt(0); 
		if(devolver==0) devolver = p2.getEdad()-p1.getEdad(); 
		break;
	    
		}
        return devolver;
        }
	  }
