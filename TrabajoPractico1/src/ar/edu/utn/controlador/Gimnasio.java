package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Entrenador;
import ar.edu.utn.modelo.ListaEntrenadores;

public class Gimnasio {
	
	
private Entrenador[] listaEntrenadores;

public Gimnasio(){
	
	this.listaEntrenadores = new Entrenador[4];
	this.listaEntrenadores[0] = new Entrenador(ListaEntrenadores.JUAN);
	this.listaEntrenadores[1] = new Entrenador(ListaEntrenadores.LUIS);
	this.listaEntrenadores[2] = new Entrenador (ListaEntrenadores.MARTIN);
	this.listaEntrenadores[3] = new Entrenador (ListaEntrenadores.PEDRO);
	
	
}






}
