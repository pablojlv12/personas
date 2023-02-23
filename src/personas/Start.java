package personas;

import java.util.Arrays;

public class Start {
	public static void main(String[] args) {

		Persona[] personas = new Persona[5];

		personas[0] = new Persona("juanjo", 67);
		personas[1] = new Persona("Xuanxe", 7);
		personas[2] = new Persona("Blete", 7);
		personas[3] = new Persona("Tuna", 43);
		personas[4] = new Persona("Pepe", 54);

		System.out.println(Arrays.toString(personas));
		
	    ComparadorPersonas cp = new ComparadorPersonas();
	    Arrays.sort(personas,cp);
	    System.out.println(Arrays.toString(personas));
		
	    
	    cp.serComoOrdenar(ComparadorPersonas.ASCENTENTE_EDAD);
	    Arrays.sort(personas,cp); 
		System.out.println(Arrays.toString(personas));
		
		
		//for (Persona Persona : personas) {
		//System.out.println(Persona);
		//}

	}

}
