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

            Si ( Caracter != .,;:-¿?¡! )
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
        totalVecesCaracteres = contTotal - contCaracteres
        totalVecesSignosPuntuacion = contTotal - contSignosPuntuacion


       //CalcularPorcentaje
       porcentajeCaracteres = totalVecesCaracteres / contTotal * 100
       porcentajeSignosPuntuacion = totalVecesSignosPuntuacion = contSignosPuntuacion / contTotal * 100


       MOSTRAR RESULTADOS

       PREGUNTAR Y VALIDAR EJECUTAR DE NUEVO

   MIENTRAS ( respuesta !='X' )

FIN


 */


public class Lectura {
}
