/*
5.- Construye un programa que lea un número entero positivo y dibuje un triángulo empezando por un *, la línea siguiente dos, y así sucesivamente hasta llegar al número leído.

6.- Modifica el programa anterior para que nos permita elegir el carácter con el que se rellena el triángulo.

7.- Modifica el programa anterior para poder elegir entre pintar una triángulo, un cuadrado o un rectángulo.
    En el tercer caso, además del número de columnas habrá que leer el número de filas.

ENTRADA:
    Numero de filas que desea que tenga el triangulo

SALIDA:
    Triangulo pintado en pantalla


PG
Programa Principal
Inicio



Fin


 */

import java.util.Scanner;

public class Triangulo3 {
    public static void main ( String[] args ){

        Scanner teclado = new Scanner (System.in);

        int numeroDeFilas = 0, cont, numero1 = 0, numero2 = 0, opcionInicio = 0;
        char caracter = ' ', respuesta = ' ';

        do{
            //Mostrar elegir opcion (triangulo, cuadrado, rectangulo )
            System.out.println("");

            //Segun (opcionInicio)
                //case 1: triangulo
                //case 2: cuadrado
                //case 3: rectangulo
            //FinSegun

            //Ejecutar de nuevo (S/N)

        }while ( respuesta != 'N'  );

//////////////////////////////////////////////////////////TRIANGULO//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Introduzca un numero de filas");
        numeroDeFilas = teclado.nextInt();

        //Para elegir el carácter que queremos imprimir;
        System.out.println("Introduzca el caracter que desea imprimir");
        caracter = teclado.next().charAt(0);

        //Para saber el número de filas que tenemos que pintar
        for ( cont = 0; cont <= numeroDeFilas; cont++){

            //Hay que inicializar la variable a 0 para que en cada iteracion no se guarde el valor anterior cuando entramos en el bucle while
            numero1 = 0;

            //Pinta cada una de las filas individualmente
            while (numero1 < numero2) {
                System.out.print(caracter);
                numero1++;
            }

            //Actualiza el numero2 para que en la siguiente iteración vaya sumando las filas
            numero2++;
            System.out.println("");
        }
/////////////////////////////////////////////////////////CUADRADO//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Introduzca un numero de filas");
        numeroDeFilas = teclado.nextInt();

        //Para elegir el carácter que queremos imprimir;
        System.out.println("Introduzca el caracter que desea imprimir");
        caracter = teclado.next().charAt(0);

        //Para saber el número de filas que tenemos que pintar
        for ( cont = 0; cont <= numeroDeFilas; cont++){

            //Hay que inicializar la variable a 0 para que en cada iteracion no se guarde el valor anterior cuando entramos en el bucle while
            numero1 = 0;

            //Pinta cada una de las filas individualmente
            while (numero1 < numeroDeFilas) {
                System.out.print(caracter+"  ");
                numero1++;
            }

            //Actualiza el numero2 para que en la siguiente iteración vaya sumando las filas
            numero2++;
            System.out.println("");

        }


////////////////////////////////////////////////////////////////RECTANGULO///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int filas = 0, columnas = 0;

        System.out.println("filas");
        filas = teclado.nextInt();

        System.out.println("Columnas");
        columnas = teclado.nextInt();

        for ( cont = 0; cont <= filas; cont++){

            //Hay que inicializar la variable a 0 para que en cada iteracion no se guarde el valor anterior cuando entramos en el bucle while
            numero1 = 0;

            //Pinta cada una de las filas individualmente
            while (numero1 < columnas) {
                System.out.print("*  ");
                numero1++;
            }

            //Actualiza el numero2 para que en la siguiente iteración vaya sumando las filas
            numero2++;
            System.out.println("");

        }
    }
}
