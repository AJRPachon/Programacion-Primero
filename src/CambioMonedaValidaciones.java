
/*
 13. Realizar un programa que proporcione el cambio de Euros a Dólares, Libras, Yenes, Franco Suizo,
   Corona Noruega, según opción. El programa debe controlar todas las entradas y ofrecer al usuario la
   posibilidad de repetir o salir.

   ANÁLISIS:
        Diseñar un programa que cambie de euros a X moneda
        Opción de repetir o de salir

   VARIABLES:
        int cantidadEuros, monedaCambio
        char reintentar, salir

   PSEUDOCÓDIGO
   Programa Principal
   Iniciar
        Mensaje de inicio
        Hacer
            Escribir(pedir cantidad de euros)
            Leer(cantidadEuros)

            Escribir(moneda que se desea hacer el cambio)
            Leer(monedaCambio)

            Segun (monedaCambio)
                caso1
                    Calcular cambio de moneda
                    Escribir(el cambio de la moneda que se ha efectuado)
                .
                .
                casoN
                    Calcular cambio de moneda
                    Escribir(el cambio de la moneda que se ha efectuado)
            FinSegun

            Escribir(Preguntar si se desea reintentar o salir)
            Leer(reintentar)

        Mientras ( reintentar == 'R' )
   Fin

 */

import java.util.Scanner;

public class CambioMonedaValidaciones {
    public static void main(String[] args ){

        Scanner teclado = new Scanner (System.in);

        double cantidadEuros = 0, monedaCambiada = 0;
        char reintentar = ' ', salir = ' ', cambioMoneda = ' ';

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //PRESENTACIÓN DEL PROGRAMA
        System.out.println("-------------------------------CAMBIO DE MONEDEITOR 4.0-------------------------------");
        System.out.println("--------------Bienvenido a nuestro sistema de cambio de moneda automático---------------");
        System.out.println("-----------Solo tienes que introducir la cantidad en euros que deseas cambiar-----------");
        System.out.println("--------------------------------------------------------------------------------------\n");


        //BUCLE PARA VOLVER A HACER EL CAMBIO DE MONEDA
        do{

            //Pedimos la cantidad de euros que deseamos cambiar
            System.out.println("Cuánta cantidad de euros desea cambiar [€]");
            cantidadEuros = teclado.nextInt();

            //Validar que sea positivo
            while ( cantidadEuros < 0 ){
                System.out.println("\nPor favor, introduce un valor de moneda mayor que cero");
                cantidadEuros = teclado.nextInt();
            }


            //Pedimos a la moneda que deseamos hacer el cambio
            System.out.println("\nA qué moneda desea hacer el cambio:");
            System.out.println("[D] Dolares \n[L] Libras \n[Y] Yenes \n[F] Franco Suizo \n[C] Corona Noruega");
            cambioMoneda = teclado.next().charAt(0);
            cambioMoneda = Character.toUpperCase(cambioMoneda);

            //Validar que sea una de esas opciones
            while ( cambioMoneda != 'D' && cambioMoneda != 'L' && cambioMoneda != 'Y' && cambioMoneda != 'F' && cambioMoneda != 'C' ){
                System.out.println("Por favor, introduzca una de las opciones");
                System.out.println("[D] Dolares \n[L] Libras \n[Y] Yenes \n[F] Franco Suizo \n[C] Corona Noruega");
                cambioMoneda = teclado.next().charAt(0);
                cambioMoneda = Character.toUpperCase(cambioMoneda);
            }

            //Saber qué cambio se va a efectuar
            switch (cambioMoneda){

                case 'D':
                    monedaCambiada = (cantidadEuros * 1.1137);
                    System.out.println(cantidadEuros+"€ equivalen a: "+monedaCambiada+" Dolares.");
                    break;

                case 'L':
                    monedaCambiada = (cantidadEuros * 0.863779);
                    System.out.println(cantidadEuros+"€ equivalen a: "+monedaCambiada+" Libras.");
                    break;

                case 'Y':
                    monedaCambiada = (cantidadEuros * 121.008);
                    System.out.println(cantidadEuros+"€ equivalen a: "+monedaCambiada+" Yenes.");
                    break;

                case 'F':
                    monedaCambiada = (cantidadEuros * 1.10308);
                    System.out.println(cantidadEuros+"€ equivalen a: "+monedaCambiada+" Francos Suizos.");
                    break;

                case 'C':
                    monedaCambiada = (cantidadEuros * 10.1456);
                    System.out.println(cantidadEuros+"€ equivalen a: "+monedaCambiada+" Coronas Noruegas.");
                    break;
            }

            //Preguntar si de desea cambiar de moneda de nuevo o salir
            System.out.println("Desea realizar de nuevo el cambio de moneda[R] o salir[S]");
            reintentar = teclado.next().charAt(0);
            reintentar = Character.toUpperCase(reintentar);

            //Validar Reintentar o Salir
            while ( reintentar != 'R' && reintentar != 'S' ){
                System.out.println("Por favor, introduzca una de las opciones: \n[R]Cambio de moneda \n[S]Salir ");
                reintentar = teclado.next().charAt(0);
                reintentar = Character.toUpperCase(reintentar);
            }

        }while ( reintentar == 'R' );

        System.out.println("\n¡Hasta pronto!");
    }
}
