package ar.edu.utn.modelo;

public class Entrenador {
	
	private ListaEntrenadores nombre;
	private Boxeador listaBoxeadores[];
	
	public Entrenador(ListaEntrenadores nombre){
		
		this.listaBoxeadores = new Boxeador[5];
		this.nombre = nombre;	
	}

	public ListaEntrenadores getNombre() {
		return nombre;
	}

	public void setNombre(ListaEntrenadores nombre) {
		this.nombre = nombre;
	}

	public Boxeador[] getListaBoxeadores() {
		return listaBoxeadores;
	}


	
	
	
	
	
	
	
	

}
