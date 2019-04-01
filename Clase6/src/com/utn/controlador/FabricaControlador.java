package com.utn.controlador;

import com.utn.modelo.Galleta;
import com.utn.modelo.TipoGalleta;

public class FabricaControlador {

    // creo un objeto de tipo galleta
	
	public Galleta creoGalletita(String nombre, String descripcion, double precio, TipoGalleta tipo) {
    	
    	Galleta g = new Galleta();
    	
    	switch (tipo) {
		case CHOCOLINA:
			g.setNombre(tipo.CHOCOLINA.toString());
	    	g.setDescripcion(descripcion);
	    	g.setPrecio(precio);
			
			break;
        case OREO:
        	g.setNombre(tipo.OREO.toString());
        	g.setDescripcion(descripcion);
        	g.setPrecio(precio);
			
			break;
        case PITUSSA:
        	g.setNombre(tipo.PITUSSA.toString());
        	g.setDescripcion(descripcion);
        	g.setPrecio(precio);
	
	        break;
        case TODDY:
        	g.setNombre(tipo.TODDY.toString());
        	g.setDescripcion(descripcion);
        	g.setPrecio(precio);
	
	        break;

		default:
			break;
		}
    	
    	
    	
    	
    
    	
    	return g; // retorno el objeto de tipo galleta
    	
    }
}
