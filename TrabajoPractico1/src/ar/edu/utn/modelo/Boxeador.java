package ar.edu.utn.modelo;

import ar.edu.utn.controlador.Clasificador;

public class Boxeador {
	
	private String nombre;
	private float peso;
	private Categoria categoria;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(float peso) {
		this.categoria = Clasificador.getCategoria(peso);
	}
	
	
	

}
