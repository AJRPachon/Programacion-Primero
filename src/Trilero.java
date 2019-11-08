/*
    VARIABLES:
        - char jugar, apostar, salir, opcionInicio
        - int valorRandom, apuesta, puntos, adivinaBolita, jugar, salir, reintentar,

    PSEUDOCÓDIGO:
    Programa Principal
    Inicio

        Hacer
            Escribir ( Cuanto desea apostar - [1] = 20 euros  [2] = 40 euros  [3] = 80 euros )
            Leer(apuesta)

            Hacer
                Escribir( Que desea hacer - Jugar[J], Apostar[A], Salir[S] )
                Leer(opcionInicio)

                Hacer
                    Switch(opcionInicio)
                        Caso 1 - 'J'

                            Generar Random

                            Escribir ( Donde está la bolita )
                            Leer ( adivinaBolita )

                            Si ( adivinaBolita == valorRandom )
                                apuesta = apuesta x 2
                                Escribir ( Enhorabuena has ganado )
                            FinSi

                            Si ( adivinaBolita != valorRandom )
                                apuesta = apuesta - apuesta
                                Escribir ( Lo sentimos mucho, has perdido )
                            FinSi

                        Break

                        Caso 2 - 'A'
                            Escribir( De acuerdo! )
                        Break

                        Caso 3 - 'S'
                            Escribir ( Adios! )
                        Break

                    FinSwitch

                    Escribir ( Que desea hacer - Jugar[J], Cambiar apuesta[A], Salir[S] )
                    Leer ( opcionInicio )

                Mientras ( opcionInicio == 'J' )
            Mientras ( opcionInicio == 'A' )
        Mientras ( opcionInicio != 'S' )

    Fin



 */

import java.util.Scanner;
import java.util.Random;

public class Trilero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();

        char jugar = ' ', apostar = ' ', salir = ' ', opcionInicio = ' ';
        int valorRandom = 0, apuesta = 0, puntos = 0, adivinaBolita = 0, ganancias = 0, perdidas = 0;


        do{
            System.out.println("Cuanto desea apostar \n[1] = 20 euros  \n[2] = 40 euros  \n[3] = 80 euros");
            apuesta = teclado.nextInt();

            do {
                System.out.println("Que desea hacer - Jugar[J], Apostar[A], Salir[S]");
                opcionInicio = teclado.next().charAt(0);
                opcionInicio = Character.toUpperCase(opcionInicio);

                do{
                    switch(opcionInicio) {
                        case 'J':

                        valorRandom = rnd.nextInt(3)+1;

                        System.out.println("Donde está la bolita");
                        adivinaBolita = teclado.nextInt();

                        if (adivinaBolita == valorRandom) {
                            apuesta = apuesta * 2;
                            System.out.println("Enhorabuena has ganado");
                        }

                        if(adivinaBolita != valorRandom) {
                            apuesta = apuesta - apuesta;
                            System.out.println("Lo sentimos mucho, has perdido");
                        }
                        break;

                        case 'A':
                        System.out.println("De acuerdo !");
                        break;

                        case 'S':
                        System.out.println("Adios !");
                        break;
                    }

                System.out.println("Que desea hacer: \nJugar[J] \nCambiar apuesta[A] \nSalir[S]");
                opcionInicio = teclado.next().charAt(0);
                opcionInicio = Character.toUpperCase(opcionInicio);


                }while ( opcionInicio == 'J' );
            } while ( opcionInicio == 'A' );
        } while ( opcionInicio != 'S' );
    }
}
