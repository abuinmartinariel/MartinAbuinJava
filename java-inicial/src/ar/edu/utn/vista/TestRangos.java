package ar.edu.utn.vista;

public class TestRangos {
	
	public static void main(String[] args) {
		
		int valor = 1;
		int minimo = 1;
		int maximo = 12;
		
		System.out.println(estaenRango(valor,minimo,maximo));;
		
		valor=15;
		minimo = 1;
		maximo = 29;
		System.out.println(estaenRango(valor,minimo,maximo));;
		
		valor=15;
		minimo = -273;
		maximo = 0;

	       int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	       System.out.println("Espero un 30: " + dias[5]);
	       System.out.println("Espero un 30: " + dias[7]);
 

	}

private static boolean estaenRango(int valor, int minimo, int maximo) {
		
		return valor >= minimo && valor <= maximo;
		
	}


}
