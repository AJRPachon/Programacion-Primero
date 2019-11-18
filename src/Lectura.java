/*
1.- Construye un programa que lea una serie de caracteres hasta que se introduzca un *,
    que indicará el fin de la entrada de datos (centinela).
    Una vez finalizada la entrada, emitirá un informe que nos diga cuántas letras mayúsculas se han introducido,
    cuantos signos de puntuación (.,;:-¿?¡!'), y cuantas veces se ha introducido el mismo carácter de forma consecutiva.
    El informe nos dirá el total de veces y el tanto por ciento.

    ENTRADAS:
        char caracter
        charrespuesta

    SALIDAS:
        int contMayusculas, contSignosPuntuacion ,contCaracterAcumulado, totalVecesCaracteres, totalVecesSignosPuntuacion,
            porcentajeCaracteres, porcentajeSignosPuntuacion

PSEUDOCÓDIGO
ProgramaPrincipal
Inicio

    HACER
        HACER
            LeerYValidar Caracter

            Si ( Caracter == .,;:-¿?¡! )
                contSignosPuntuacion++
                SiNo
                    contCaracteres++
                FinSiNo
            FinSi

            Si ( Character.isUpperCase(caracter) )
                contMayusculas++
            FinSi

            Si ( caracterAcumulado == caracter )
                contCaracterAcumulado++
            FinSi

            caracterAcumulado = caracter

            contadorTotal++

        MIENTRAS ( Caracter != '*' )

        //CalcularTotal de veces
        totalVecesCaracteres = contadorTotal - contCaracteres
        totalVecesSignosPuntuacion = contadorTotal - contSignosPuntuacion


       //CalcularPorcentaje
       porcentajeCaracteres = totalVecesCaracteres / contadorTotal * 100
       porcentajeSignosPuntuacion = contSignosPuntuacion / contadorTotal * 100


       MOSTRAR RESULTADOS

       PREGUNTAR Y VALIDAR EJECUTAR DE NUEVO

   MIENTRAS ( respuesta !='X' )

FIN


 */

import java.util.Scanner;

public class Lectura {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        char caracter =' ', respuesta = ' ';
        int contMayusculas, contSignosPuntuacion ,contCaracterAcumulado, totalVecesCaracteres, totalVecesSignosPuntuacion,
                porcentajeCaracteres, porcentajeSignosPuntuacion, contCaracteres, caracterAcumulado, contadorTotal;

        //Programa principal cuando se pide repetir
        do {

            contSignosPuntuacion = 0;
            contCaracteres = 0;
            contMayusculas = 0;
            caracterAcumulado = ' ';
            contCaracterAcumulado = 0;
            contadorTotal = 0;

            //Bucle para la lectura de caracteres
            do {

                //LeerYValidar Caracter
                System.out.println("Introduzca caracter");
                caracter = teclado.next().charAt(0);

                //validar caracter
                if ( caracter == '.' || caracter == '\'' || caracter == ',' || caracter == ';' || caracter == ':' || caracter == '-' || caracter == '¿' || caracter == '?' || caracter == '¡' || caracter == '!' ){
                    contSignosPuntuacion++;
                }else{
                    contCaracteres++;
                }

                //Contador de mayusculas
                if(Character.isUpperCase(caracter)){
                contMayusculas++;
                }

                //Para saber el número de veces que se han introducido el mismo caracter de forma consecutiva
                if(caracterAcumulado == caracter) {
                    contCaracterAcumulado++;
                }

                caracterAcumulado = caracter;

                //Para contar las veces que se ejecuta el bucle y luego hacer operaciones
                contadorTotal++;

            }while( caracter != '*');

            //CalcularTotal de veces
            totalVecesCaracteres = contadorTotal - contCaracteres;
            totalVecesSignosPuntuacion = (contadorTotal -1) - contSignosPuntuacion;


            //CalcularPorcentaje
            porcentajeCaracteres = totalVecesCaracteres / contadorTotal * 100;
            porcentajeSignosPuntuacion = contSignosPuntuacion / contadorTotal * 100;


            //MOSTRAR RESULTADOS0
            System.out.println("mayusculas: "+contMayusculas);
            System.out.println("Contador de signos de puntuación: "+contSignosPuntuacion);
            System.out.println("Total veces caracteres iguales consecutivos: "+totalVecesCaracteres);
            System.out.println("Total veces signos de puntuacion: "+totalVecesSignosPuntuacion);
            System.out.println("Porcentaje caracteres: " +porcentajeCaracteres);
            System.out.println("Porcentaje Signos de Puntuación: "+porcentajeSignosPuntuacion);
            System.out.println("Contador de caracteres: "+contCaracteres);

            //PREGUNTAR EJECUTAR DE NUEVO
            System.out.println("Ejecutar de nuevo ");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //VALIDAR EJECUTAR
            while ( respuesta != 'S' && respuesta != 'X' ){
                System.out.println("Introduzca una de las opciones S/X");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta != 'X' );


    }
}
