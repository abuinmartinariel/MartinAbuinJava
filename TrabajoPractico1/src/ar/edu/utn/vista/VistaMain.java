package ar.edu.utn.vista;

import java.util.Scanner;

import ar.utn.edu.modelo.Boxeador;

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
			
			
			boxeadores[i] = box;
			
		}
		

		
	}

}
