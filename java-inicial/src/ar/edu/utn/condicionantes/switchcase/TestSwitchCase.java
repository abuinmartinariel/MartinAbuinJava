package ar.edu.utn.condicionantes.switchcase;

public class TestSwitchCase {

	public static void main(String[] args) {

		
		char color= 'r';
		
		
		switch (color) {
	case 'R': case'r':
		System.out.println("Color ROJO");
	    break;
	case 'B': case 'b': 
		System.out.println("Color AZUL");
		break;
	case 'Y': case 'y': 
		System.out.println("Color AMARILLO");
		break;
	default:
		System.out.println("No reconozco el color");
		break;
	}
	}

}
