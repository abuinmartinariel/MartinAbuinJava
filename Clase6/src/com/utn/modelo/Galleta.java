package com.utn.modelo;

public class Galleta {

      // TODOS LOS ATRIBUTOS SON PRIVADOS
	 
	/* 
	 * private  ---> solo puede ser leido por la misma clase
	 * public --> lo puede ver la clase corriente y otras clases
	 * protected --> la clase corriente + las que hereden ....
	 */
	
	
	// private String nombre;
	// private String descripcion;
	
	// ENCAPSULAMIENTO
	
	/* 
	 * Todo atributo privado es accedido por un metodo publico
	 * tanto sea para leerlo como para escribirlo
	 */
	
	// MALA PRACTICA

    //Buena practica
	
	private String nombre;
    private double precio;
    private String descripcion;
    
    
    // Getter ... devolvemoss el atributo
    
    public String getNombre() {
    	
    	return nombre;
    	
    }
 
  //Setter escribo la variable con el valor del mismo tipo que fue definida
    
    public void setNombre(String nombreParam) {
    	
    	if(this.nombre==null){
    		this.nombre=nombreParam;
    	}
    	else {
    		System.out.println(("NO SE PUEDE MODIFICAR EL ELEMENTO"));
    	}


}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		
	//this hace referencia a la misma clase	
		
		this.descripcion = descripcion;
	}


 
    
    



}
