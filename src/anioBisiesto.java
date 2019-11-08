/*
 * 9. Para comprobar si un año es o no bisiesto se usa la siguiente 
 * regla: “Un año es bisiesto si es divisible por 400, o bien es divisible por 4 pero no por 100”.
 * Diseñar un programa que utilizando una variable lógica que tenga valor cierto 
 * si el año es bisiesto y falso si no lo es.  
 * 
 * ANALISIS:
 * 		Hacer un programa para calcular el año bisiesto
 * 		anio bisiesto = ((anio % 4 == 0) && (anio % 400 == 0 || anio / 100 != 0))
 *      anio >= 1580
 * 		
 * ENTRADA:
 * 		-double anio
 * 		-string respuesta
 * 		
 * 
 * SALIDA:
 * 		-eco datos de entrada y mensajes de comunicación con el usuario
 * 
 * RESTRICCIONES:
 * 		- anio no puede ser < 0 
 * 
 * PSEUDOCODIGO 
 * Nombre del algoritmo: anioBisiesto
 * Programa Principal
 * Inicio
 * 		
 * 		//PreguntarIniciar		
 * 			Repetir
 * 				Escribir ("Desea inicializar el programa")
 * 			Mientras ( respuesta != 'S' || respuesta != 'N' )
 *
 *      Mientras ( respues == 'S' )
 * 		    //ObtenerAnio y validar
 *          Hacer
 * 			    Escribir ("Introduzca el año que desea saber si es bisiesto o no")
 * 			    Leer (anio);
 *
 *          Mientras ( anio >= 1582 )
 *
 * 		    //CalcularAnioBisiesto
 * 			    Si ((anio % 4 == 0) && (anio % 400 == 0 || anio / 100 != 0))
 * 				    Escribir ("Este año es bisiesto")
 * 			    SiNo
 * 				    Escribir ("Este año no es bisiesto")
 * 				FinSi
 *      FinMientras
 * Fin 
 *
 */

import java.util.Scanner;

public class anioBisiesto{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double anio = 0;
        char respuesta = ' ';

        //Preguntar Iniciar
        do {
            System.out.println("Desea inicializar el programa");
            respuesta = Character.toUpperCase(teclado.next().charAt(0));
        } while (respuesta != 'S' && respuesta != 'N');

        while ( respuesta == 'S' ) {
            //Obtener Anio y Validar
            do {
                System.out.println("Introduzca el año que desea saber si es bisiesto o no, mayor o igual que 1582");
                anio = teclado.nextDouble();
            } while (anio < 1582);

            //Calcular Anio Bisiesto
            if ((anio % 4 == 0) && (anio % 400 == 0 || anio / 100 != 0)) {
                System.out.println("Este año es bisiesto");
            } else {
                System.out.println("Este año no es bisiesto");
            }

            do {
                System.out.println("desea ejecutar el programa");
                respuesta = Character.toUpperCase(teclado.next().charAt(0));
            } while (respuesta != 'S' && respuesta != 'N');
        }
    }
}