
/*
    VARIABLES:
       - char opcionInicio
       - int valorRandom, apuesta, puntos, adivinaBolita, ganaApuesta, pierdeApuesta

    PSEUDOCÓDIGO:
    Programa Principal
    Inicio

        //PRESENTACION DEL PROGRAMA Y EJECUTAR OPCIONES
        Escribir ( Presentación del programa)
        Escribir ( Que desea hacer - Jugar[J] Salir[X] )
        LeerYValidar ( opcionInicio )

        MIENTRAS ( opcionInicio != 'X' )
        Escribir (apuesta)
        LeerYValidar (apuesta)

            MIENTRAS ( opcionInicio != 'S' )

                SEGUN (opcionInicio)
                    CASO  'J'
                        Generar valorRandom
                        Escribir( Donde se encuentra la bolita [ ][ ][ ] )
                        Escribir(                               1  2  3 )
                        LeerYValidar ( adivinaBolita )

                        SI ( adivinaBolita == valorRandom )
                            puntos = puntos + apuesta;
                            ganaApuesta = (apuesta * 2);
                            Escribir ( Enhorabuena, has ganado +ganaApuesta+ euros tu saldo es de +puntos+ )

                            SiNo
                                puntos = puntos - apuesta;
                                pierdeApuesta = -apuesta;
                                Escribir ( Lo sentimos mucho, has perdido +pierdeApuesta+ euros tu saldo es de +puntos+)
                            FinSi
                        FinSi

                    CASO  'A'
                        Escribir ( De acuerdo )
                        Escribir (apuesta)
                        LeerYValidar(apuesta)

                FINSEGUN

                //PREGUNTAR
                    Escribir ( Que desea hacer - Jugar[J], Cambiar apuesta[A], Salir[S] )
                    Leer ( OpciónInicio )
            FINMIENTRAS

            Escribir ( estas seguro que deseas salir )
            LeerYvalidar ( opcionInicio )
        FINMIENTRAS

        Escribir ( Vuelve pronto )
        Cerrar teclado
    Fin


 */

import java.util.Scanner;
import java.util.Random;

public class  TrileroValidaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();

        char opcionInicio = ' ';
        int valorRandom = 0, apuesta = 0, puntos = 0, adivinaBolita = 0, ganaApuesta = 0, pierdeApuesta = 0;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //PRESENTACIÓN DEL PROGRAMA Y EJECUTAR OPCIONES
        System.out.println("----------------------------TRILERO MASTER 3000----------------------------");
        System.out.println("                 Bienvenido a nuestro Trilero Master 3000");
        System.out.println("Nuestro famoso juego de apuestas donde tienes que adivinar dónde se encuentra la bolita.");
        System.out.println("     Disponemos de tres casilleros de los cuales tendrás que elegir uno de ellos.");
        System.out.println("                 El premio será el doble de lo que apostó.");
        System.out.println("                     Empecemos, pues. ¿Qué desea hacer?: \nJugar[J] \nSalir[X]");
        opcionInicio = teclado.next().charAt(0);
        opcionInicio = Character.toUpperCase(opcionInicio);


        //VALIDAR QUE LA ENTRADA DE DATOS SEA CORRECTA
        while( opcionInicio !='J' && opcionInicio !='X' ){
            System.out.println("\nPorfavor, introduce una de las opciones de nuestro menú");
            System.out.println("Jugar[J] \nSalir[X]");
            opcionInicio = teclado.next().charAt(0);
            opcionInicio = Character.toUpperCase(opcionInicio);
        }

        while ( opcionInicio != 'X' ) {
            System.out.println("-------------------DING DING DING!!! A JUGAR!!-------------------");
            System.out.println("                       Indique su apuesta \n                  [20€] **** [40€] **** [80€]");
            System.out.println("   \nRecuerde que se duplicará x2 el valor de las ganancias en caso de ganar");
            apuesta = teclado.nextInt();


            //VALIDAR ENTRADA DE LA APUESTA
            while (apuesta != 20 && apuesta != 40 && apuesta != 80) {
                System.out.println();
                System.out.println("Enserio? ¿" + apuesta + "? y mira que solo tienes tres opciones...");
                System.out.println("Por favor, seleccione una de las siguientes TRES opciones:");
                System.out.println("                 Indique su apuesta: \n            [20€] **** [40€] **** [80€]");
                apuesta = teclado.nextInt();
            }

            while (opcionInicio != 'S') {

                //EJECUTAR PROGRAMA OPCION INICIO PARA J - A - S
                switch (opcionInicio) {

                    case 'J':
                        //GENERAR RANDOM
                        valorRandom = rnd.nextInt(3) + 1;

                        System.out.println();
                        System.out.println("  Llegó el momento más difícil.");
                        System.out.println("  ......      .......     .......    ");
                        System.out.println("  #     #     #     #     #     #  ");
                        System.out.println("  #  1  #     #  2  #     #  3  #  ");
                        System.out.println("  #     #     #     #     #     #  ");
                        System.out.println("  ......      .......     .......");

                        System.out.println();
                        System.out.println("¿Dónde se encuentra la bolita?");
                        adivinaBolita = teclado.nextInt();

                        //VALIDAR ENTRADA BOLITA ENTRE 1, 2 Y 3
                        while (adivinaBolita != 1 && adivinaBolita != 2 && adivinaBolita != 3) {
                            System.out.println();
                            System.out.println("¡" + adivinaBolita + " no es un valor admitido! ¡No seas tramposo!");
                            System.out.println("No te pongas nervioso, solo es dinero. ");
                            System.out.println("Te lo repito de nuevo, ¿dónde está la bolita?");
                            System.out.println("  ......      .......     .......    ");
                            System.out.println("  #     #     #     #     #     #  ");
                            System.out.println("  #  1  #     #  2  #     #  3  #  ");
                            System.out.println("  #     #     #     #     #     #  ");
                            System.out.println("  ......      .......     .......");
                            adivinaBolita = teclado.nextInt();
                        }


                        //SABER SI HA GANADO
                        if (adivinaBolita == valorRandom) {
                            puntos = puntos + apuesta;
                            ganaApuesta = (apuesta * 2);
                            System.out.println("¡¡¡PRRRRRRRRRREEEEEEEMIOOOOOOOOOOOOOOOOOOOOO!!!");
                            System.out.println("   ¡ENHORABUENA! has ganado " + ganaApuesta + "€  \n Tu saldo actual es de: " + puntos + "€.");
                        }

                        //SABER SI HA PERDIDO
                            else {
                                puntos = puntos - apuesta;
                                pierdeApuesta = -apuesta;
                                System.out.println("\nRevisa tu vista y tu dinero porque....¡HAS PERDIDO!");
                                System.out.println("Lo sentimos mucho (o no) \nHas perdido " + pierdeApuesta + "€ \nTu saldo actual es de: " + puntos + "€.");
                            }
                        break;


                    //CASO PARA CAMBIAR APUESTA
                    case 'A':
                        System.out.println("De acuerdo");
                        System.out.println("                       Indique su apuesta \n                  [20€] **** [40€] **** [80€]");
                        System.out.println("   \nRecuerde que se duplicará x2 el valor de las ganancias en caso de ganar");
                        apuesta = teclado.nextInt();


                        //VALIDAR ENTRADA DE LA APUESTA
                        while (apuesta != 20 && apuesta != 40 && apuesta != 80) {
                            System.out.println();
                            System.out.println("?Enserio? ¿" + apuesta + "? y mira que solo tienes tres opciones...");
                            System.out.println("Por favor, seleccione una de las siguientes TRES opciones:");
                            System.out.println("                 Indique su apuesta: \n            [20€] **** [40€] **** [80€]");
                            apuesta = teclado.nextInt();
                        }
                        break;

                } //FIN SWITCH

                //PREGUNTAR
                System.out.println();
                System.out.println("Que desea hacer: Jugar[J] Apostar/Cambiar Apuesta[A] Salir[S]");
                opcionInicio = teclado.next().charAt(0);
                opcionInicio = Character.toUpperCase(opcionInicio);

                //VALIDAR PREGUNTAR
                while ( opcionInicio != 'J' && opcionInicio != 'A' && opcionInicio != 'S' ){
                    System.out.println("Por favor, introduzca una de nuestras siguientes opciones:");
                    System.out.println("Jugar[J] Apostar/Cambiar Apuesta[A] Salir[S]");
                    opcionInicio = teclado.next().charAt(0);
                    opcionInicio = Character.toUpperCase(opcionInicio);
                }

            }//FIN MIENTRAS OPCION INICIO != 'S'

            System.out.println();
            System.out.println("¿Estás eguro? \nSalir[X] \nSeguir jugando[R]" );
            opcionInicio = teclado.next().charAt(0);
            opcionInicio = Character.toUpperCase(opcionInicio);

            //VALIDAR QUE LA ENTRADA DE DATOS SEA CORRECTA
            while( opcionInicio !='R' && opcionInicio !='X' ){
                System.out.println("Porfavor, introduce una de las opciones de nuestro menú");
                System.out.println("\nSalir[X] \nSeguir jugando[R]");
                opcionInicio = teclado.next().charAt(0);
                opcionInicio = Character.toUpperCase(opcionInicio);
            }

        }//FIN MIENTRAS OPCION INICIO != 'X'

        System.out.println("¡Hasta luego! Vuelve pronto");


        teclado.close();

    }
}