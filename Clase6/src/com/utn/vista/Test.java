package com.utn.vista;

// para traerse los imports se presiona en el eclipse ctrl + shift + o
import com.utn.controlador.FabricaControlador;
import com.utn.modelo.Galleta;
import com.utn.modelo.TipoGalleta;

public class Test {

	public static void main(String[] args) {
		
		
		// Creamos un objeto del tipo Galleta
		
		
		/*
		 * La creación del objeto es por medio del nombre de la clase, nombre del atributo
		 * e inicializacion con la palabra reservada new + nombre de la clase y sos ()
		 */
		
		// g1 ahora es un objeto instanciado del tipo Galleta() --> los parentesis hacen referencia al constructor
		
		Galleta g1 = new Galleta();
        
        g1.setNombre("Oreo");   
        System.out.println(g1.getNombre());
        System.out.println("Procesando..... sigue trabajando el codigo");		
        System.out.println("Algo ocurrio un programador travieso hizo macanas");
		
        g1.setNombre("Robertos");;
        
        System.out.println("Devolviendo la galletita!");
	    g1.setDescripcion("Rica galletita a base de vainilla y copos de maiz");
	    System.out.println("Ya tiene su pedido de: " + g1.getNombre() + " listos para degustar!!!!");
	
	    System.out.println("Descripcion de la " + g1.getNombre() + ": " + g1.getDescripcion());
	  
	  
	  
	  
	  System.out.println(" ======================== FABRICA DE GALLETAS ========================");
	  
	  // Creo el objeto de la fabrica
	  
	  FabricaControlador fc = new FabricaControlador();
	  
	      // ME DEVUELVE UNA INSTANCIA DE TIPO GALLETA
	  Galleta chocolina = fc.creoGalletita("Chocolina","Ideal para la chocotorta",2.0,TipoGalleta.CHOCOLINA);
	  Galleta opera = fc.creoGalletita("Opera", "rellenas de crema", 5.0,TipoGalleta.CHOCOLINA);
      Galleta pepito = fc.creoGalletita("Pepito", "Chispas de chocolate", 10.0,TipoGalleta.TODDY);	
	  Galleta Pitussa = fc.creoGalletita("Pitussa", "pequeñas pero efectivas", 1.0,TipoGalleta.PITUSSA);
      Galleta toddy = fc.creoGalletita("Toddy", "Para burgueses!", 100.0,TipoGalleta.OREO);
	  
	  System.out.println(opera.getNombre());
	  System.out.println(opera.getDescripcion());
	
	  // me creo un vector de objetos de tipo Galletas de 5 posiciones
	  // o de indice 0 a 4
	  Galleta[] listaGalleta = new Galleta[7]; 
	  
	  // en cada uno de los indices sabiendo que arranca desde 0 guardo cada objeto creado
	  listaGalleta[0] = chocolina;
	  listaGalleta[1] = opera;
	  listaGalleta[2] = pepito;
	  listaGalleta[3] = Pitussa;
	  listaGalleta[4] = toddy;
	  listaGalleta[5] = fc.creoGalletita("9 de oro", "Ideal para el mate", 30.0,TipoGalleta.TODDY);
	  
	  int n =1;
	  for (Galleta item : listaGalleta) {
		
		if(item != null){
		System.out.println("=== Galleta N "+ n + " ===");
		System.out.println(item.getNombre());
		System.out.println(item.getDescripcion());
		System.out.println(item.getPrecio());
		System.out.println("===================");
		n++;
	    }
		else{
			System.out.println("El objeto es nulo y no lo puedo mostrar");
		  }
		}  
		
	  
	
	System.out.println("======== MISMO EJEMPLO CON UN FOR ========");
	  
	  for (int i = 0; i < listaGalleta.length; i++) {
		  
		  if(listaGalleta[i] != null){
			  
			  System.out.println(" === GALLETA N " + (i+1) + " ====");
			  System.out.println(listaGalleta[i].getNombre());
			  System.out.println(listaGalleta[i].getDescripcion());
			  System.out.println(listaGalleta[i].getPrecio());
			  System.out.println("====================");
			  
		  } else{
			  System.out.println("NO EXISTE EL ELEMENTO");
		  }
		  
		
	    }
	  
	  
	}
	}


