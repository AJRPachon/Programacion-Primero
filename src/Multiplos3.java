/*
 *Nombre del algoritmo: Multiplos3
 * 
 * ANALISIS:
 *	Diseñar un programa que imprima, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado
 * 
 * ENTRADA:
 * 		-int numero
 * 		-char respuesta
 * 
 * SALIDA:
 * 		Eco de los datos, mensajes al usuario
 * 		Multiplos, suma y cantidad de múltiplos que hay
 * 
 * RESTRICCIONES:
 * 		-El numero debe ser mayor que 1 
 * 	
 * PSEUDOCÓDIGO:
 * Nombre del algoritmo: Multiplos3
 * ProgramaPrincipal
 * Inicio
 *		LeerYValidarEjecutar
 *  	Mientras ( respuesta = 's" )
 * 			ObtenerYValidarNumero
 * 			RealizarOperacionesYMostrarMúltiplos
 * 			LeerYValidarEjecutar
 * 		FinMientras
 * Fin
 *
 *  
 */

import java.util.Scanner;

public class Multiplos3{
	
	public static void main ( String [] args ){
		
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		
		do{	
			int numero = 0, cont = 0, Mun = 0, vecescontadas = 0, suma = 0;
								 
			//ObtenerYValidarNumero
			do{
				System.out.println("Introduzca un numero mayor que 1");
				numero = teclado.nextInt();
			}while( numero <= 1 );
			
			System.out.println();		
						
			//RealizarOperacionesYMostrarMúltiplos
			System.out.print("Los multiplos son: ");
			
			for ( cont = 1; cont <= numero ; cont++ ){
				
					if ( cont%3==0 ){
					System.out.print(+cont+", ");
					vecescontadas++;
					suma = suma + cont;
					}
			}
			
			System.out.println();
			System.out.println();
			
			//MostrarVecesContadas
			System.out.println("Mostrar contar "+vecescontadas+".");
			System.out.println();
			
			//MostrarSumaNumeros
			System.out.println("Mostrar sumar "+suma+".");
			System.out.println();
			
			//LeerYValidarEjecutar
			do{
			 System.out.println("Desea ejecutar el programa (S/N)");
			 respuesta = Character.toUpperCase(teclado.next().charAt(0));
			 
			 System.out.println();
			}while( respuesta != 'S' && respuesta != 'N' );
		}while ( respuesta != 'N' );		
	}
}


