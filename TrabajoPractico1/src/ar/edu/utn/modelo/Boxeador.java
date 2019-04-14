package ar.edu.utn.modelo;

import ar.edu.utn.controlador.Clasificador;

public class Boxeador {
	
	private String nombre;
	private double peso;
	private Categoria categoria;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(double peso) {
		this.categoria = Clasificador.getCategoria(peso);  
	}
	
	
	

}
