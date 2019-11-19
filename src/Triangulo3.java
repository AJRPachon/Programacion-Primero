/*
5.- Construye un programa que lea un número entero positivo y dibuje un triángulo empezando por un *, la línea siguiente dos, y así sucesivamente hasta llegar al número leído.

6.- Modifica el programa anterior para que nos permita elegir el carácter con el que se rellena el triángulo.

7.- Modifica el programa anterior para poder elegir entre pintar una triángulo, un cuadrado o un rectángulo.
    En el tercer caso, además del número de columnas habrá que leer el número de filas.

ENTRADAS:
    Numero de filas que desea que tenga el triangulo
    Numero de longitud del cuadrado
    Numero de filas y columnas del rectangulo

SALIDAS:
    Triangulo cuadrado, rectangulo


PG
Programa Principal
Inicio

    //HACER

        //Mostrar elegir opcion (triangulo, cuadrado, rectangulo )

        //Segun (opcionInicio)
            //case 1: triangulo
            //case 2: cuadrado
            //case 3: rectangulo
        //FinSegun

        //Ejecutar de nuevo (S/N)

    //MIENTRAS ( respuesta != N)

Fin


 */

import java.util.Scanner;

public class Triangulo3 {
    public static void main ( String[] args ){

        Scanner teclado = new Scanner (System.in);

        int numeroDeFilas = 0, cont, numero1 = 0, numero2, opcionInicio = 0,altura, ancho;
        char caracter = ' ', respuesta = ' ';

        do{
            //Mostrar elegir opcion (triangulo, cuadrado, rectangulo )
            System.out.println("Qué programa desea ejecutar:\n[1] Triangulo\n[2] Cuadrado\n[3] Rectangulo\n");
            opcionInicio = teclado.nextInt();

            //validar opcionInicio
            while ( opcionInicio < 1 || opcionInicio > 3 ){
                System.out.println("La opción elegida tiene que ser una de las siguientes:\n[1] Triangulo\n[2] Cuadrado\n[3] Rectangulo\n");
                opcionInicio = teclado.nextInt();
            }

            //Segun (opcionInicio)
            switch (opcionInicio) {
                //case 1: triangulo
                case 1:
                    //Para cuando ejecutemos de nuevo se restablezca a 0
                    numero2 = 0;

                    System.out.println("Introduzca un numero de filas que desea que tenga su triángulo");
                    numeroDeFilas = teclado.nextInt();

                    //validar numero de filas
                    while ( numeroDeFilas <= 0 ){
                        System.out.println("Por favor, introduzca un número mayor que 0");
                        numeroDeFilas = teclado.nextInt();
                    }

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
                break;

                //case 2: cuadrado
                case 2:

                    numero2 = 0;

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
                break;

                //case 3: rectangulo
                case 3:
                    altura = 0; ancho = 0;

                    numero2 = 0;

                    System.out.println("Introduzca la altura del rectangulo");
                    altura = teclado.nextInt();

                    System.out.println("Introduzca el ancho del rectangulo");
                    ancho = teclado.nextInt();

                    for ( cont = 0; cont <= altura; cont++){

                        //Hay que inicializar la variable a 0 para que en cada iteracion no se guarde el valor anterior cuando entramos en el bucle while
                        numero1 = 0;

                        //Pinta cada una de las filas individualmente
                        while (numero1 < ancho) {
                            System.out.print("*  ");
                            numero1++;
                        }

                        //Actualiza el numero2 para que en la siguiente iteración vaya sumando las filas
                        numero2++;
                        System.out.println("");

                    }
                break;

            }//FinSegun

            //Ejecutar de nuevo (S/N)
            System.out.println("\nDesea ejecutar de nuevo S/N\n");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

        }while ( respuesta != 'N'  );
    }
}
