package com.lineadecodigo.java.basico.arrays;

/**
 * @file ListarElementosArray.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   17-junio-2007
 * @url    http://lineadecodigo.com/2007/06/17/listar-elementos-de-un-array/
 * @description Utilizaci�n de un bucle for para listar los elementos de un array.
 */

public class ListarElementosArray {

	 public static void main(String[] args) {
		   
		   String a[] = {"Avila","Burgos","Le�n","Palencia",
		     "Salamanca","Segovia","Soria","Valladolid","Zamora"};
		   
		   // Volcamos los arrays
		   listarArray(a); 
		   
		 }
		   
		   
		 public static void listarArray (String[] a){
		   
		   for (int x=0;x<a.length;x++){
		     System.out.println(a[x]);
		   }
		   
		 }
		   

}
