package com.lineadecodigo.java.util.dates;

/* 
* @file ContarPalabras.java
* @version 1.0
* @author V�ctor Cuervo. (http://lineadecodigo.com)
* @date   03/junio/2015
* @url    http://lineadecodigo.com/java/obtener-la-hora-en-java/
* @description C�digo que nos muestra la hora actual.
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObtenerLaHora {
	
	public static void main(String[] args) {
	
		// Ambas instanciaciones son v�lidas
		Calendar calendario = new GregorianCalendar();
		//Calendar calendario = Calendar.getInstance();
		
		int hora, minutos, segundos;
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		System.out.println(hora + ":" + minutos + ":" + segundos);
		
	}

}
