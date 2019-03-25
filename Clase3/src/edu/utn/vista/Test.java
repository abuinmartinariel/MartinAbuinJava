package edu.utn.vista;

public class Test {

	public static void main(String[] args) {
		
		//variable local para el metodo main de tipo String
			  
			  String message="hola mundo";
			  
			  saludar(message);
		    
			  //invocamos al IMC donde le pasamos la altura y el peso
			  
			  double resultado = imc(76.0, 1.71);
			  
			  if(resultado < 18) {
				  System.out.println("Flaque escopeta");
				  
				  
			  } else if (resultado < 18 && resultado < 25) {
				System.out.println("Hace ejercicio igual pero vas bien");
				  
				  
			  }
			  else if(resultado>25&&resultado < 29) {
				  System.out.println("afloja los postres");
			  }
			  else { System.out.println("gorde pedorre");
			  
			  }
			  
			  System.out.println(resultado);
			  System.out.println("la suma de 2+2= " + sumosDosNumeros(2,2));
			  System.out.println((sumosDosNumeros(sumosDosNumeros(1,3),2)));
			  muestroValores("Martin","Abuin",32);
		}
			

		//visibilidad statico procedimiento nombre(argumento cadena)


		//un procedimineto que recibe un parametro de tipo String (cadena)
		public static void saludar(String mensaje) {
			  System.out.println(mensaje);
		}
			
			//creamos una funcion donde chequeamos el IMC o indice de masa corporal

		public static double imc(double peso,double altura) {
			  
			  double resultado = peso/(altura*altura);
			  
			  return(resultado);
			  
		}
			


		public static int sumosDosNumeros(int num1,int num2) {
			return (num1 + num2);
		}

		public static void muestroValores(String nombre, String apellido, int edad) {
			  
			  System.out.println("su nombre es " + nombre);
			  System.out.println("su apellido es " + apellido);
			  if(edad<18){
				  System.out.println("Es un puber");
				  
				  
			  }  else if(edad>18 && edad < 60) {
				  System.out.println("Estas en la cresta de la ola");
			  }
			  else {
				  System.out.println("mas cerca del arpa que de la guitarra");
			  }


		}
		 


}


