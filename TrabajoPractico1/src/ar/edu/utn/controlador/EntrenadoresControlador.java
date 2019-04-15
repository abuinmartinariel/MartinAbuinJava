package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Boxeador;
import ar.edu.utn.modelo.Categoria;
import ar.edu.utn.modelo.Entrenador;
import ar.edu.utn.modelo.ListaEntrenadores;

public class EntrenadoresControlador {
	
	
private Entrenador[] listaEntrenadores;




public EntrenadoresControlador(){
	
	this.listaEntrenadores = new Entrenador[4];
	this.listaEntrenadores[0] = new Entrenador(ListaEntrenadores.JUAN, Categoria.MOSCA , Categoria.GALLO);
	this.listaEntrenadores[1] = new Entrenador(ListaEntrenadores.LUIS, Categoria.PLUMA, Categoria.LIGERO);
	this.listaEntrenadores[2] = new Entrenador (ListaEntrenadores.MARTIN , Categoria.WELTER , Categoria.MEDIANO);
	this.listaEntrenadores[3] = new Entrenador (ListaEntrenadores.PEDRO , Categoria.MEDIOPESADO , Categoria.PESADO);
	
}



public void asignacionBox(Boxeador box, int ent){
	
	
	
	this.listaEntrenadores[ent].asignoBoxeador(box);
	
}

public void imprimirResultado(int ent){
	
	
	System.out.println("======================================================");
	System.out.println("Nombre Entrenador: " + this.listaEntrenadores[ent].getNombre());
	System.out.println("Categorias asignadas: " + this.listaEntrenadores[ent].getCategoria1() + " y " + this.listaEntrenadores[ent].getCategoria2());
	System.out.println("Lista de Boxeadores Asignados: ");
	this.listaEntrenadores[ent].imprimirBoxeadores();
	System.out.println("Lista de Rechazados: ");
	this.listaEntrenadores[ent].imprimirRechazados();
}



}
