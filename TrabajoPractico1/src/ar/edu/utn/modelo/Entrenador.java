package ar.edu.utn.modelo;

public class Entrenador {
	
	private ListaEntrenadores nombre;
	private Boxeador listaBoxeadores[];
	private Categoria categoria1;
	private Categoria categoria2;
	private int i = 0;
	
	
	
	
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

	public Categoria getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(Categoria categoria1) {
		this.categoria1 = categoria1;
	}

	public Categoria getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(Categoria categoria2) {
		this.categoria2 = categoria2;
	}

  
	public void asignoBoxeador(Boxeador box){
		
		if (i < 4){
			this.listaBoxeadores [i] = box;
		i ++;
		
		}
		else {
			System.out.println(this.nombre + " llego al maximo de boxeadores asignados");
		}
		
	}
	
	
	
	
   
}
