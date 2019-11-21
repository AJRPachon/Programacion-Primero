/*
5.- Construye un programa que lea un número entero positivo y dibuje un triángulo empezando por un *, la línea siguiente dos, y así sucesivamente hasta llegar al número leído.

6.- Modifica el programa anterior para que nos permita elegir el carácter con el que se rellena el triángulo.

7.- Modifica el programa anterior para poder elegir entre pintar una triángulo, un cuadrado o un rectángulo.
    En el tercer caso, además del número de columnas habrá que leer el número de filas.

ENTRADAS:
    Numero de filas que desea que tenga el triangulo
    Numero de longitud del cuadrado
    Numero de ancho y largo del rectangulo
    Caracter a pintar

SALIDAS:
    Triangulo cuadrado, rectangulo


PG
Programa Principal
Inicio

    Mostrar mensaje de Bienvenida

    REPETIR

        Mostrar elegir opcion (triangulo, cuadrado, rectangulo )

        Segun (opcionInicio)
            case 1: triangulo
                Pedir datos y validar
                Pintar triangulo

            case 2: cuadrado
                Pedir datos y validar
                Pintar cuadrado

            case 3: rectangulo
                Pedir datos y validar
                Pintar rectangulo

        FinSegun

        Ejecutar de nuevo (S/N) Y Validar

    MIENTRAS ( respuesta != N)

Fin


 */

import java.util.Scanner;

public class Triangulo3 {
    public static void main ( String[] args ){

        Scanner teclado = new Scanner (System.in);

        int numeroDeFilas = 0, cont, cont2, opcionInicio = 0, altura, ancho;
        char caracter = ' ', respuesta = ' ';

        //Mensaje de bienvenida
        System.out.println("Mensaje de Bienvenida en construcción");

        do{
            //Mostrar elegir opcion (triangulo, cuadrado, rectangulo )
            System.out.println("Qué programa desea ejecutar:\n[1] Triangulo\n[2] Cuadrado\n[3] Rectangulo");
            opcionInicio = teclado.nextInt();

            //validar opcionInicio
            while ( opcionInicio < 1 || opcionInicio > 3 ){
                System.out.println("La opción elegida tiene que ser una de las siguientes:\n[1] Triangulo\n[2] Cuadrado\n[3] Rectangulo");
                opcionInicio = teclado.nextInt();
            }

            //Segun (opcionInicio)
            switch (opcionInicio) {
                //case 1: triangulo
                case 1:

                    System.out.println("Introduzca la altura que desea que tenga su triángulo");
                    numeroDeFilas = teclado.nextInt();

                        //validar numero de filas
                        while ( numeroDeFilas <= 0 ){
                            System.out.println("Por favor, introduzca un número mayor que 0, una altura no puede ser negativa");
                            numeroDeFilas = teclado.nextInt();
                        }

                    //Para elegir el carácter que queremos imprimir
                    System.out.println("Introduzca el caracter con el que desea rellenar el triángulo");
                    caracter = teclado.next().charAt(0);

                    //Para saber el número de filas que tenemos que pintar
                    for ( cont = 0; cont <= numeroDeFilas; cont++){ //Cuenta las filas

                        for ( cont2 = 0; cont2 < cont; cont2++ ){  //Dibuja el ancho de cada fila
                            System.out.print(caracter);
                        }
                        System.out.println("");
                    }
                break;

                //case 2: cuadrado
                case 2:

                    System.out.println("Introduzca el alto/ancho que desea que tenga su cuadrado");
                    numeroDeFilas = teclado.nextInt();

                    //validar que el numero no sea negativo
                    while ( numeroDeFilas <= 0 ){
                        System.out.println("Por favor, introduzca un número mayor que 0, una altura/anchura no puede ser negativa");
                        numeroDeFilas = teclado.nextInt();
                    }

                    //Para elegir el carácter que queremos imprimir
                    System.out.println("Introduzca el caracter con el que desea rellenar el cuadrado");
                    caracter = teclado.next().charAt(0);

                    //Para saber el número de filas que tenemos que pintar
                    for ( cont = 0; cont <= numeroDeFilas; cont++){ //Cuenta las filas

                        for ( cont2=0; cont2 < numeroDeFilas; cont2++ ) { //Dibuja el ancho de cada fila
                            System.out.print(caracter+"   ");
                        }

                        System.out.println("");

                    }
                break;

                //case 3: rectangulo
                case 3:
                    altura = 0; ancho = 0;

                    //Pedir altura rectángulo
                    System.out.println("Introduzca la altura del rectangulo");
                    altura = teclado.nextInt();

                    //validar que el numero no sea negativo
                    while ( altura <= 0 ){
                        System.out.println("Por favor, introduzca un número mayor que 0, una altura/anchura no puede ser negativa");
                        altura = teclado.nextInt();
                    }

                    //Pedir anchura rectángulo
                    System.out.println("Introduzca el ancho del rectángulo");
                    ancho = teclado.nextInt();

                    //validar que el numero no sea negativo
                    while ( ancho <= 0 ){
                        System.out.println("Por favor, introduzca un número mayor que 0, una altura/anchura no puede ser negativa");
                        ancho = teclado.nextInt();
                    }

                    //Para elegir el carácter que queremos imprimir
                    System.out.println("Introduzca el caracter con el que desea rellenar el cuadrado");
                    caracter = teclado.next().charAt(0);

                    for ( cont = 0; cont < altura; cont++){  //Cuenta las filas

                        for ( cont2 = 0; cont2 < ancho; cont2++) {  //Dibuja el largo de las filas
                            System.out.print(caracter+"  ");
                        }

                        System.out.println("");
                    }
                break;

            }//FinSegun

            //Ejecutar de nuevo (S/N)
            System.out.println("\nDesea ejecutar de nuevo S/N\n");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //Validar ejecutar
            while ( respuesta != 'S' && respuesta != 'N' ){
                System.out.println("Por favor, introduzca una de las opciones S/N");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta != 'N'  );
    }
}
