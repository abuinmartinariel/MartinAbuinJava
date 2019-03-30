package com.utn.controlador;

import com.utn.modelo.Galleta;

public class FabricaControlador {

    // creo un objeto de tipo galleta
	
	public Galleta creoGalletita(String nombre, String descripcion, double precio) {
    	
    	Galleta g = new Galleta();
    	g.setNombre(nombre);
    	g.getDescripcion(descripcion);
    	g.setPrecio(precio);
    	
    	return g; // retorno el objeto de tipo galleta
    	
    }
}
