package ar.edu.utn.java.inicial.condicionante;

public class CondicionanteIf {
	
    public static void main(String[] args) {
		
    	
    	int valor = -7;
    	
    	
    	if(valor < 0) {
    		// bloque de codigo si se cumple
    		// la condicion
    		System.out.println("Valor es negativo");
    		
    	}  else if (valor>0)
    	    { System.out.println("Valor es positivo");
    	    }
    	else {
    		System.out.println("Valor es cero");
                }
    	System.out.println("El valor es: " + valor + "<- ese fue valor ");
    	
}
}