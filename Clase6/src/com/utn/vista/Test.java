package com.utn.vista;

// para traerse los imports se presiona en el eclipse ctrl + shift + o
import com.utn.modelo.Galleta;

public class Test {

	public static void main(String[] args) {
		
		
		// Creamos un objeto del tipo Galleta
		
		
		/*
		 * La creaciòn del objeto es por medio del nombre de la clase, nombre del atributo
		 * e inicializacion con la palabra reservada new + nombre de la clase y sos ()
		 */
		
		// g1 ahora es un objeto instanciado del tipo Galleta() --> los parentesis hacen referencia al constructor
		Galleta g1 = new Galleta();
        
        g1.setNombre("Oreo");   
     
        System.out.println("Procesando..... sigue trabajando el codigo");		
        System.out.println("Algo ocurrio un programador travieso hizo macanas");
		g1.setNombre("Robertos");;
        System.out.println("Devolviendo la galletita!");
	    g1.setDescripcion("Epica galletita a base de vainilla y copos de maiz");
	    System.out.println("Ya tiene su pedido de: " + g1.getNombre() + " listos para degustar!!!!");
	
	  System.out.println("desripcion de la " + g1.getNombre() + ": " + g1.getDescripcion());
	  
	  System.out.println(g1.getDescripcion());
	  
	  
	  
	  System.out.println(" ======================== FABTICA DE GALLETAS ============================");
	  
	  //cREO EL OBJETO DE LA FABRTICA
	  
	  FabricaControlador fc=new FabricaControlador();
	  
	  
	  Galleta chocolina = fc.creoGalletita("Chocolina,"Ideal para la chocotorta",precio);"
	  
	  Galleta opera = fc.creoGalletita("Pepito,"Chispas de chocolate",precio);"
	}

	 Galleta listaGalleta = new Galleta
}
