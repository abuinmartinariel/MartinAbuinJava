package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.modelo.Persona;

public class CumpleanosATi {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);

       int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
       Persona personas[] = new Persona[5];
       
       for(int i = 0 ; i < 5 ; i++) {
    	Persona per = new Persona();
       
       int mes = ingresoDato(scan, "mes",1, 12);
       per.setMes(mes);
       
       System.out.println(mes);
       
       int dia = ingresoDato(scan, "dia",1, dias[mes-1]);
       System.out.println(dia);
       per.setDia(dia);
       
       int anio = ingresoDato(scan, "a�o", 2000,2018);
       System.out.println(anio);
       per.setAnio(anio);
   
    	   //TODO Usar el metodo ingresoDato para que soporte la
    	   // condicion de menor a ... cuando el momento es a�o
    	   
    	   //TODO Solicitar al usuario el nombre
           System.out.println("Ingrese su nombre: ");
           String nombre = scan.next();      
           per.setNombre(nombre);
           //TODO mostrar el siguiente texto:
    	   // <nombre>: tu cumple es el <dia>/<mes>/<a�o>
       personas[i] = per;   
       System.out.println(nombre + ":" + dia + "/" + mes + "/" + anio);
    	      
       }
       System.out.println("----------------------");
     for (Persona persona : personas) {
		persona.identificarse();
	}
     System.out.println("--- Busco el mas joven ---");
     int menor = Integer.MAX_VALUE;
     Persona masJoven = null;
	 for (Persona x : personas) {
	    if(x.getEdad() < menor) {
	    	menor = x.getEdad();
	    	masJoven = x;
	    	}
	}
     System.out.println("El mas joven es: ");
     masJoven.identificarse();
     System.out.println("Hay alguien de 13 a�os en la sala?" + existeElemento(13,personas));
}
	
	private static boolean existeElemento(int edad, Persona[] personas)
	{
		for (Persona persona : personas) {
			if (persona.getEdad() == edad)
                   {  return true;
                	   
                   }
		}
		
		return false;
		
	}
	
	private static int ingresoDato(Scanner scan, 
			                       String momento, 
			                       int valorMinimo,
			                       int valorMaximo
			                      ) {
		String mensaje = "Ingrese %s de su cumple (valor minimo %d valor maximo %d)";
		System.out.println("Ingrese " + momento +" de su cumple");
		int valor = scan.nextInt();
		
			while(!estaenRango(valor, valorMinimo, valorMaximo)) {
				System.out.println(String.format(mensaje, momento,valorMinimo, valorMaximo));
				valor = scan.nextInt();

		}
		
			return valor;
		
}

	
private static boolean estaenRango(int valor, int minimo, int maximo) {
		
		return valor >= minimo && valor <= maximo;
		
	}
	
	
	
}	
