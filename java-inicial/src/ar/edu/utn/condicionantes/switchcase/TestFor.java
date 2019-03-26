package ar.edu.utn.condicionantes.switchcase;

public class TestFor {

	public static void main(String[] args) {
		// Ciclo For tiene como fin repetir
		// un grupo de sentencias una cantidad
		// finita/determinada de veces.
		
		// Se compone de 4 secciones:
		// las primeras 3 estasn seguidas de la 
		// palabra clave for
		// la primera seccion es una accion inicial
		// al ciclo de repeticiones
		// la segunda seccion es una condicion que 
		//se evalua para determinar si se ingresa al
		// bloque de codigo (seccion 4)
		// la tercera seccion es una accion que se realiza
		// una vez finalizadas las acciones de la seccion 4
		for(int cantidad_de_veces = 0; cantidad_de_veces < 2000 ; cantidad_de_veces++) {
			System.out.println("++");
		}

	}

}
