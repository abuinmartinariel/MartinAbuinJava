package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Categoria;

public class Clasificador {

	
public static Categoria getCategoria(double peso){
	
	 
	if(peso > 0 && peso < 52.163){
		
	    return Categoria.MOSCA;
	}
		else if (peso >= 52.163 && peso < 55.338){
			
		return Categoria.GALLO;
		}
		else if (peso >= 55.338 && peso < 58.967)
		{
			
			return Categoria.PLUMA;
			
		}
		
		else if(peso >= 58.967 && peso < 63.503) {
			return Categoria.LIGERO;
		}
		else if (peso >= 63.503 && peso < 69.853) {
			return Categoria.WELTER;
		}
		else if (peso >= 69.853 && peso < 76.205) {
			return Categoria.MEDIANO;
		}
		else if (peso >= 76.205 && peso < 91) {
			return Categoria.MEDIOPESADO;
		}
		else if (peso >=91)
		  {  
			return Categoria.PESADO;
		  }
	 	
	return null;
}



}
