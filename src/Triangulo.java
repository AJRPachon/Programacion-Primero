/*
5.- Construye un programa que lea un número entero positivo y dibuje un triángulo empezando por un *, la línea siguiente dos, y así sucesivamente hasta llegar al número leído.


ENTRADA:
    Numero de filas que desea que tenga el triangulo

SALIDA:
    Triangulo pintado en pantalla


PG
Programa Principal
Inicio

    LeerNumeroDeFilas  //y validar

    Para contador < NumeroFila
        Imprimir * x contador

Fin



 */

import java.util.Scanner;

public class Triangulo {
    public static void main ( String[] args ){

        Scanner teclado = new Scanner (System.in);

        int numeroDeFilas = 0, cont, numero1 = 0, numero2 = 0;

        numeroDeFilas = teclado.nextInt();

        //Para saber el número de filas que tenemos que pintar
        for ( cont = 0; cont < numeroDeFilas; cont++){

            //Hay que inicializar la variable a 0 para que en cada iteracion no se guarde el valor anterior cuando entramos en el bucle while
            numero1 = 0;

            //Pinta cada una de las filas individualmente
            while (numero1 <= numero2) {
                System.out.print("*");
                numero1++;
            }

            //Actualiza el numero2 para que en la siguiente iteración vaya sumando las filas
            numero2++;
            System.out.println("");
        }


    }
}
