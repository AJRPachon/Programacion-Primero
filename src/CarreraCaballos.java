/*
8. Diseña un programa para simular una carrera de tres caballos. Las probabilidades de ganar
 las simulará el diseñador según sus propios criterios. El programa permitirá al usuario
 jugar repetidas veces si lo desea. Puede incluirse la posibilidad de apostar interactivamente.

    ANALISIS:


    VARIABLES:


    PSEUDOCODIGO:
    Programa Principal
    Inicio

        Escribir ( presentacion del programa )

        HACER
            HACER

                Inicializar contador a 0
                Escribir ( etapa actual )
                Escribir ( apostar ) y validar

                Generar randomCaballo1
                Generar randomCaballo2
                Generar randomCaballo3

                //Operaciones caballos
                    sumar caballo1 += randomCaballo1
                    sumar caballo2 += randomCaballo2
                    sumar caballo3 += randomCaballo3

                acumulaApuesta += apuesta

                Escribir ( valores de los randomCaballo )
                Escribir ( valores acumula apuesta )

                cont++

            MIENTRAS ( cont < 10 )

            //Saber el caballo ganador
            Si ( randomCaballo1 > randomCaballo2 && randomCaballo1 > randomCaballo3 )
                Escribir ( caballo 1 ha ganado )

                SiNo
                Si ( randomCaballo2 > randomCaballo1 && randomCaballo2 > randomCaballo3 )
                    Escribir ( caballo 2 ha ganado )

                    Sino
                        Escribir ( caballo 3 ha ganado )
                FinSi
            FinSi

            Escribir ( Quieres jugar de nuevo )
        MIENTRAS ( Salir != 'S' )

    Fin


 */

import java.util.Scanner;
import java.util.Random;

class CarreraCaballos{
    public static void main( String[] args ){

        Scanner teclado = new Scanner (System.in);
        Random rnd = new Random();

        char respuesta = ' ';
        int acumulaApuesta=0, caballoGanador=0, apuesta=0, ganaApuesta= 0, pierdeApuesta=0, apuestaCaballo= 0, randomCaballo1=0, randomCaballo2=0, randomCaballo3=0, sumacaballo1=0, sumacaballo2=0, sumacaballo3=0;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Presentacion del programa en construcción");

        do {
            int cont=0;

            //Apostar a un caballo
            System.out.println("A qué caballo desea apostar \n[1] Perdigón \n[2] Flash \n[3] Rayo McQueen");
            apuestaCaballo = teclado.nextInt();

            //Validar entrada del caballo
            while ( apuestaCaballo != 1 && apuestaCaballo != 2 && apuestaCaballo != 3 ){
                System.out.println("Por favor, no intente meter un caballo nuevo en esta carrera");
                System.out.println("Elija uno de nuestros veloces corceles \n[1] Perdigón \n[2] Flash \n[3] Rayo McQueen");
                apuestaCaballo = teclado.nextInt();
            }

            //Empezar carrera de caballos
            do {
                System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
                System.out.println("Etapa actual de la carrera: " +cont+".");
                System.out.println("Qué cantidad de dinero desea apostar");
                apuesta = teclado.nextInt();

                //Validar Apuesta en construccion
                if ( apuesta < 0 ){
                    System.out.println("Por favor, introduzca dinero, no intente retirarlo");
                    apuesta = teclado.nextInt();
                }

                //Generar carrera de caballos
                randomCaballo1 = rnd.nextInt(10)+1;
                randomCaballo2 = rnd.nextInt(10)+1;
                randomCaballo3 = rnd.nextInt(10)+1;

                //Operaciones caballos
                sumacaballo1 +=randomCaballo1;
                sumacaballo2 +=randomCaballo2;
                sumacaballo3 +=randomCaballo3;

                acumulaApuesta += apuesta;

                System.out.println();
                System.out.println("Perdigón lleva recorridos: "+sumacaballo1+" metros.");
                System.out.println("Flash lleva recorridos: "+sumacaballo2+" metros.");
                System.out.println("Rayo McQueen lleva recorridos "+sumacaballo3+" metros.");
                System.out.println("\nTu apuesta total suma: "+acumulaApuesta+" Euros");

                cont++;

            }while (cont < 10);

            //Saber el caballo ganador
            if(sumacaballo1 > sumacaballo2 && sumacaballo1 > sumacaballo3) {
                System.out.println("¡Perdigón ha sido el caballo ganador! con "+sumacaballo1+" metros recorridos.");
                caballoGanador = 1;
            }
            else {
                if (sumacaballo2 > sumacaballo1 && sumacaballo2 > sumacaballo3) {
                    System.out.println("¡Flash ha sido el caballo ganador! con "+sumacaballo2+" metros recorridos.");
                    caballoGanador = 2;
                } else {
                    System.out.println("¡Rayo McQueen ha sido el caballo ganador! con "+sumacaballo3+" metros recorridos.");
                    caballoGanador = 3;
                }
            }

            //Saber si has ganado o perdido la apuesta
            if ( caballoGanador == apuestaCaballo ){
                ganaApuesta = acumulaApuesta * 2;
                System.out.println("Has ganado "+ganaApuesta+" euros");
            }
            else{
                pierdeApuesta = -acumulaApuesta;
                System.out.println("Has perdido "+pierdeApuesta+" euros");
            }

            System.out.println("Quieres jugar de nuevo S/N");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //Validar salir
            while ( respuesta != 'S' && respuesta != 'N' ){
                System.out.println("Por favor, introduce una de las siguientes opciones S/N");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta != 'N' );

        System.out.println("¡Hasta luego!");
        teclado.close();
    }
}