package edu.utn.intermedio.modelo;

import java.time.LocalDateTime;

public interface Identificable {
	public String identificate();
	
	public default void saludar() {
		
		LocalDateTime horaActual = LocalDateTime.now();
		int horario = horaActual.getHour() * 100 + horaActual.getMinute();
		
	
		if(horario >= 600 && horario <= 1200) {
			System.out.println("Buenos dias");
		    } else if (horario >= 1200 && horario <= 1959) {
			System.out.println("Buenas tardes");
			}
		else {
			System.out.println("Buenas noches");
		}
		}
}