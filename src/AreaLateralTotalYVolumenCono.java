/*
14.- Implementa un algoritmo para calcular el área lateral, total y el volumen del cono cuyos datos deberán ser leídos de teclado.

Nombre del algoritmo: ÁreaLateralTotalYVolumenCono
Variables:
	Real: radio, altura, generatriz, volumen, áreaLateral, áreaTotal

Constantes:
	Pi

Programa Principal:
Inicio:
	//ObtenerRadioYAltura
		Escribir ("Introducir radio y altura del cono")
		Leer (radio y altura)

		//CalcularGeneratriz
			generatriz= Raiz de (radio + altura)
		//CalcularAreaLateral
			areaLateral= Pi * r * g
		//CalcularAreaTotal
			areaTotal= Pi * r * (r+g)
		//CalcularVolumen
			volumen= (Pi * r^2 * h) / 3

	//MostrarResultado
		Escribir ("El área lateral del cono es:---")
		Escribir ("El área total del cono es: ---")
		Escribir ("El volumen total del cono es: ---")
Fin

 */

import java.util.Scanner;
import java.lang.Math;


class AreaLateralTotalYVolumenCono {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        double radio=0, altura=0, generatriz=0, volumen=0, areaLateral=0, areaTotal=0, PI=3.1415;
        char respuesta=0;

        //Preguntar ejecutar
        do {
            System.out.println("Desea ejecutar el programa");
            respuesta = Character.toUpperCase(teclado.next().charAt(0));  //Character es en mayuscula porque es un objeto
        }while ( respuesta != 'S' && respuesta != 'N' );

        while ( respuesta == 'S' ) {

            //Obtener radio y altura
            System.out.println("Introduzca radio");
            radio = teclado.nextDouble();

            System.out.println("Introduzca altura");
            altura = teclado.nextDouble();


            //Calcular Generatriz
            generatriz = Math.sqrt( radio + altura );

            //Calcular area lateral

            //CalcularAreaLateral
            areaLateral = PI * radio * generatriz;

            //CalcularAreaTotal
            areaTotal = PI * radio * (radio + generatriz);

            //CalcularVolumen
            volumen = (PI * Math.pow(radio,radio) * altura) / 3;
            //MostrarResultado
            System.out.println("El área lateral del cono es:" +areaLateral+".");
            System.out.println("El área total del cono es:" +areaTotal+".");
            System.out.println("El volumen total del cono es:" +volumen+".");

            //Preguntar ejecutar
            do{
                System.out.println("Desea ejecutar de nuevo el programa");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }while ( respuesta != 'S' && respuesta != 'N' );

        }
    }
}
