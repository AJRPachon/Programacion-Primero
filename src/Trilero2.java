
/*
    VARIABLES:
       - char jugar, apostar, salir, opcionInicio
       - int valorRandom, apuesta, puntos, adivinaBolita, jugar, salir, reintentar,

    PSEUDOCÓDIGO:
    Programa Principal
    Inicio

        //PREGUNTAR
             Escribir ( Que desea hacer - Jugar[J], Cambiar apuesta[A], Salir[S] )
             Leer ( opcionInicio )
        HACER
            SEGUN (opcionInicio)
                CASO  'J'
                    Generar valorRandom
                    Escribir( Donde se encuentra la bolita [ ][ ][ ] )
                    Escribir(                               1  2  3 )
                    Leer ( adivinaBolita )

                    SI ( adivinaBolita == valorRandom )
                        puntos = apuesta * 2
                        Escribir ( Enhorabuena, has ganado +puntos+ euros )
                    FINSI

                    SI ( adivinaBolita == valorRandom )
                        puntos = apuesta - apuesta
                        Escribir ( Lo sentimos mucho, has perdido +puntos+ euros )

                CASO  'A'
                    Escribir ( De acuerdo )

            FINSEGUN

            //PREGUNTAR
                Escribir ( Que desea hacer - Jugar[J], Cambiar apuesta[A], Salir[S] )
                Leer ( OpciónInicio )

        MIENTRAS ( opcionInicio != 'S' )

        Escribir ( Vuelve pronto )

    Fin


 */

import java.util.Scanner;
import java.util.Random;

public class Trilero2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();

        char jugar = ' ', apostar = ' ', salir = ' ', opcionInicio = ' ';
        int valorRandom = 0, apuesta = 0, puntos = 0, adivinaBolita = 0, ganancias = 0, perdidas = 0;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Preguntar la opción que queremos hacer
        System.out.println("Que desea hacer: Jugar[J] Apostar/Cambiar Apuesta[A] Salir[S]");
        opcionInicio = teclado.next().charAt(0);
        opcionInicio = Character.toUpperCase(opcionInicio);

        System.out.println("Cuanta cantidad desea apostar: 20€, 40€, 60€");
        apuesta = teclado.nextInt();

        do{
            switch (opcionInicio){

                case 'J':
                    //generar random
                    valorRandom = rnd.nextInt(3)+1;

                    System.out.println("Donde se encuentra la bolita [ ][ ][ ] ");
                    System.out.println("                              1  2  3 ");
                    adivinaBolita = teclado.nextInt();


                    if ( adivinaBolita == valorRandom ){
                        puntos = apuesta * 2;
                        System.out.println("Enhorabuena has ganado:" +puntos+"€.");
                    }

                    if ( adivinaBolita != valorRandom ){
                        puntos = apuesta - apuesta;
                        System.out.println("Lo sentimos, has perdido:" +puntos+"€.");
                    }
                break;

                case 'A':
                    System.out.println("De acuerdo");
                    System.out.println("Cuanta cantidad desea apostar: 20€, 40€, 60€");
                    apuesta = teclado.nextInt();
                break;

            } //FIN SWITCH

            //PREGUNTAR
            System.out.println("Que desea hacer: Jugar[J] Apostar/Cambiar Apuesta[A] Salir[S]");
            opcionInicio = teclado.next().charAt(0);
            opcionInicio = Character.toUpperCase(opcionInicio);

        }while ( opcionInicio != 'S' );

        System.out.println("Hasta luego! Vuelve pronto");

    }
}

