package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Boxeador;
import ar.edu.utn.modelo.Entrenador;
import ar.edu.utn.modelo.ListaEntrenadores;

public class EntrenadoresControlador {
	
	
private Entrenador[] listaEntrenadores;



public EntrenadoresControlador(){
	
	this.listaEntrenadores = new Entrenador[4];
	this.listaEntrenadores[0] = new Entrenador(ListaEntrenadores.JUAN);
	this.listaEntrenadores[1] = new Entrenador(ListaEntrenadores.LUIS);
	this.listaEntrenadores[2] = new Entrenador (ListaEntrenadores.MARTIN);
	this.listaEntrenadores[3] = new Entrenador (ListaEntrenadores.PEDRO);
	
	
}


public void asignacionBox(Boxeador box, int ent){
	
	System.out.println("Entrenador asignado:" + this.listaEntrenadores[ent].getNombre());
	this.listaEntrenadores[ent].asignoBoxeador(box);
	
	
}


}
