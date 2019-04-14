package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.controlador.EntrenadoresControlador;
import ar.edu.utn.modelo.Boxeador;

public class VistaMain {
	
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
	Boxeador boxeadores[] = new Boxeador[25];
	Boxeador rechazados[] = new Boxeador[5];
		
		for (int i = 0; i < 25; i++){
			
			
			Boxeador box = new Boxeador();
			
			System.out.println("Ingrese nombre del boxeador: ");
			String nombre = scan.next();
			box.setNombre(nombre);
			
			System.out.println("Ingrese el peso: ");
			double peso = scan.nextDouble();
			box.setPeso(peso);
			
			box.setCategoria(peso); //Asigno la categoria al boxeador ingresado
			
			
			boxeadores[i] = box;
			
			
			
		}
		
         EntrenadoresControlador ec = new EntrenadoresControlador();
			  int j = 0;
			  int m = 0;
              
			  for (int i = 0 ; i < 25 ; i ++){
	
	            if(i < 20){
				  
				m++;   
	            
	            System.out.println("============");
	            System.out.println("Nombre: " + boxeadores[i].getNombre());
		    	System.out.println("Peso: " + boxeadores[i].getPeso());
		    	System.out.println("Categoria: " + boxeadores[i].getCategoria().toString());
	            
	            
	            
	            
	            ec.asignacionBox(boxeadores[i], j);
        	   
        	   if(m % 5 == 0){
        	   j++;
        	    }
        
	         }
	            else{
	            	
	            	for(int n = 0 ; n < 5 ; n++){
	            	rechazados[n] = boxeadores[i];
	            }
	            
	                System.out.println("============");
	            	System.out.println("Boxeador: " + boxeadores[i].getNombre() + " rechazado");	
	            	
	            }
			  }
	}
}

	

