package ar.edu.utn.modelo;

public class Entrenador {
	
	private ListaEntrenadores nombre;
	private Boxeador listaBoxeadores[] = null;
	private Boxeador listaRechazados[] = null;
	private Categoria categoria1;
	private Categoria categoria2;
	private int i = 0;
	
	
	
	
	public Entrenador(ListaEntrenadores nombre , Categoria categoria1 , Categoria categoria2){
		
		this.listaBoxeadores = new Boxeador[5];
		this.listaRechazados = new Boxeador[20];
		this.nombre = nombre;
		this.categoria1 = categoria1;
		this.categoria2 = categoria2;
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



	public Boxeador[] getListaRechazados() {
		return listaRechazados;
	}

	public void setListaRechazados(Boxeador[] listaRechazados) {
		this.listaRechazados = listaRechazados;
	}

	public Categoria getCategoria2() {
		return categoria2;
	}


  
	public void asignoBoxeador(Boxeador box){
		
		if (i < 5){
			this.listaBoxeadores [i] = box;
		i ++;
		
		}
		else {
			
			this.listaRechazados[i] = box;
			i++;
		}
		
	}
	
	public void imprimirBoxeadores(){
		
		for(int i = 0 ; i <= listaBoxeadores.length ; i++) {
			
		if(listaBoxeadores[i] != null){
		System.out.println(listaBoxeadores[i].getNombre() );
		}
		
	
		}
		
	}
	
public void imprimirRechazados(){
		
		for(int i = 0 ; i <= listaRechazados.length ; i++) {
			
		if(listaRechazados[i] != null){
		System.out.println(listaRechazados[i].getNombre() );
		}
	
		}
		
	}
   
}
