/*
6. Una caja contiene una serie de papeletas marcadas con los números 1, . . . , n.
Elegimos al azar una papeleta de la caja. Determinar las probabilidades de los siguientes sucesos.

    1. La primera papeleta tiene el número 1 y la segunda el número 2.
    2. Los números de las dos papeletas son números enteros consecutivos, esto es, la primera papeleta tiene
     un número una unidad inferior a la segunda.


    ANÁLISIS:





 */

import java.util.Scanner;
import java.util.Random;

public class Papeletas {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        Random rnd = new Random();

        int valorRandom=0, cont=0, ultimoRandom=0, valorSiguiente=0, valorUnoDos=0, papeletas =0;
        double probabilidadValorSiguiente=0, probabilidadUnoDos=0;
        char respuesta = ' ';

        do {

            //Pedir la cantidad de papeletas que deseamos meter
            System.out.println("Cantidad de papeletas que desea sacar");
            papeletas = teclado.nextInt();

            //Validar papeletas mayor que cero
            while ( papeletas < 0 ){
                System.out.println("Por favor introduzca un número mayor que 0");
                papeletas = teclado.nextInt();
            }

            //Iniciar bucle para contar los dos casos, mayor en 1 unidad y que contenga 1 y 2
            for (cont = 0; cont <= papeletas; cont++) {

                valorRandom = rnd.nextInt(papeletas)+1;
                System.out.println(valorRandom);

                //Saber si la primera papeleta es una unidad inferior a la segunda
                if (valorRandom == ultimoRandom + 1) {
                    valorSiguiente++;
                }

                //Esto solo sirve del 1 al 10.
                if ( ultimoRandom == 1 && valorRandom == 2 ){
                    valorUnoDos++;
                }

                //guardar valor del último random para poder compararlo luego
                ultimoRandom = valorRandom;

            }

            //CALCULAR PROBABILIDAD PRIMERA OPCIÓN
            probabilidadValorSiguiente = ((double)valorSiguiente / (double)papeletas) * 100 ;

            System.out.println("la propabilidad de valor siguiente "+probabilidadValorSiguiente+"%");
            System.out.println("Valor siguiente "+valorSiguiente);
            System.out.println("valor papeletas " +papeletas);


            //CALCULAR PROBABILIDAD SEGUNDA OPCIÓN
            probabilidadUnoDos = ((double)valorUnoDos / (double)papeletas) * 100;
            System.out.println("\nla propabilidad de UnoDos "+probabilidadUnoDos+"%");
            System.out.println("Valor UnoDos "+valorUnoDos);
            System.out.println("valor papeletas " +papeletas);

            //Preguntar salir o repetir
            System.out.println("\nDesea ejecutar de nuevo el programa S/N");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //Validar preguntar
            while ( respuesta !='S' && respuesta !='N' ){
                System.out.println("Introduzca una de las opciones S/N");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while (respuesta != 'N');
    }
}
