package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.controlador.Clasificador;
import ar.edu.utn.modelo.Boxeador;

public class VistaMain {
	
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
	Boxeador boxeadores[] = new Boxeador[25];
		
		for (int i = 0; i < 25; i++){
			
			
			Boxeador box = new Boxeador();
			System.out.println("Ingrese nombre del boxeador: ");
			String nombre = scan.next();
			box.setNombre(nombre);
			
			System.out.println("Ingrese el peso: ");
			Float peso = scan.nextFloat();
			box.setPeso(peso);
			
			box.setCategoria(peso);
			
			
			boxeadores[i] = box;
			
			
			
		}
		
		  /* Pruebo si me los toma y clasifica
		        for (int i=0 ; i<3 ; i++) {
		    	
		    	System.out.println("Nombre: " + boxeadores[i].getNombre());
		    	System.out.println("Peso: " + boxeadores[i].getPeso());
		    	System.out.println("Categoria: " + boxeadores[i].getCategoria().toString());
		    	
		    }
	     */
	
	
	}

}
