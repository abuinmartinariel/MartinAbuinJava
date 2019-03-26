package ar.edu.utn.condicionantes.switchcase;

public class TestSwitchCase {

	public static void main(String[] args) {

		
		char color= 'R';
		
		
		switch (color) {
	case 'R': 
		System.out.println("Color ROJO");
	    break;
	case 'B': 
		System.out.println("Color AZUL");
		break;
	case 'Y': 
		System.out.println("Color AMARILLO");
		break;
	default:
		System.out.println("No reconozco el color");
		break;
	}
	}

}
