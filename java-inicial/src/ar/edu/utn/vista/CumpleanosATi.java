package ar.edu.utn.vista;

import java.util.Scanner;

public class CumpleanosATi {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
    
       int dia = ingresoDato(scan, "dia", 29);
       System.out.println(dia);
       int mes = ingresoDato(scan, "mes", 12);
    	   //TODO Usar el metodo ingresoDato para que soporte la
    	   // condicion de menor a ... cuando el momento es año
    	   
    	   //TODO Solicitar al usuario el nombre
       
           //TODO mostrar el siguiente texto:
    	   // <nombre>: tu cumple es el <dia>/<mes>/<año>
    	   
    	   
	}
	
	
	private static int ingresoDato(Scanner scan, String momento, int valorMaximo) {
		String mensaje = "Ingrese %s de su cumple (valor maximo %d)";
		System.out.println("Ingrese " + momento +" de su cumple");
		int dia = scan.nextInt();
		while(dia > valorMaximo) {
			System.out.println(String.format(mensaje, momento,valorMaximo));
			dia = scan.nextInt();
		}
		
		
		return dia;
	}

}
