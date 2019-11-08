
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

public class CambioMoneda {
    public static void main(String[] args ){

        Scanner teclado = new Scanner (System.in);

        double cantidadEuros = 0, monedaCambiada = 0;
        char reintentar = ' ', salir = ' ', cambioMoneda = ' ';

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //PRESENTACIÓN DEL PROGRAMA
        System.out.println("Presentación del sistema en construcción");


        //BUCLE PARA VOLVER A HACER EL CAMBIO DE MONEDA
        do{

            //Pedimos la cantidad de euros que deseamos cambiar
            System.out.println("Cuánta cantidad de euros desea cambiar");
            cantidadEuros = teclado.nextInt();

            //Pedimos a la moneda que deseamos hacer el cambio
            System.out.println("A qué moneda desea hacer el cambio");
            cambioMoneda = teclado.next().charAt(0);

            switch (cambioMoneda){

                case 'D':
                    monedaCambiada = (cantidadEuros * 1.1137);
                    System.out.println(cantidadEuros+" equivalen a: "+monedaCambiada+".");
                break;

                case 'L':
                    monedaCambiada = (cantidadEuros * 0.863779);
                    System.out.println(cantidadEuros+" equivalen a: "+monedaCambiada+".");
                break;

                case 'Y':
                    monedaCambiada = (cantidadEuros * 121.008);
                    System.out.println(cantidadEuros+" equivalen a: "+monedaCambiada+".");
                break;

                case 'F':
                    monedaCambiada = (cantidadEuros * 1.10308);
                    System.out.println(cantidadEuros+" equivalen a: "+monedaCambiada+".");
                break;

                case 'C':
                    monedaCambiada = (cantidadEuros * 10.1456);
                    System.out.println(cantidadEuros+" equivalen a: "+monedaCambiada+".");
                break;
            }

            //Preguntar si de desea cambiar de moneda de nuevo o salir
            System.out.println("Desea realizar de nuevo el cambio de moneda[R] o salir[S]");
            reintentar = teclado.next().charAt(0);
            reintentar = Character.toUpperCase(reintentar);

        }while ( reintentar == 'R' );

        System.out.println("¡Hasta pronto!");
    }
}
