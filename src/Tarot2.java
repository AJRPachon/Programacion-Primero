/*

    ANÁLISIS:
         Realizar un programa que lea una fecha de nacimiento de la forma día, mes, año, y dé como resultado
         el número de Tarot. El programa verificará si la fecha es correcta.

    ENTRADA:
        int anio, mes , numeroTarot , dia, numeroSuma , acumulaTarot
        boolean bisiesto = false;
        char respuesta = ' ';

    SALIDA:
        Numero del tarot

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    PSEUDOCÓDIGO:
    ProgramaPrincipal
    Inicio

        ¿Mensaje?

        HACER

            Leer año
            Calcular si es bisiesto o no
                //Si es bisiesto, bisiesto = true

            Leer mes
            Validar rango entre 1 y 12

            Leer dia
            Validar dia segun mes:
            Segun (mes):
                caso 1,3,5,7,8,10,12
                    Escribir("El dia tiene que estar entre 1 y 31")
                    Leer dia
                    Validar dia

                caso 4,6,9,11
                    Escribir("El dia tiene que estar entre 1 y 30")

                caso 2
                    Si ( bisiesto == true )
                        Escribir ("El dia tiene que estar entre 1 y 29")
                        Leer dia
                        Validar dia

                    Sino
                        Escribir("El dia tiene que estar entre 1 y 28")
                        Leer dia
                        Validar dia
             FinSegun

             Calcular Numero tarot
             Mostrar numero tarot

             LeerYValidar ejecutar programa

        MIENTRAS ( respuesta != 'X' )
    Fin
 */

import java.util.Scanner;

public class Tarot2 {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        //VARIABLES BISIESTO
        int anio = 0;
        boolean bisiesto = false;

        //VARIABLES TAROT
        int mes = 0, numeroTarot = 0, dia = 0, numeroSuma = 0, acumulaTarot = 0;
        char respuesta = ' ';

        //Ejecutar el programa de nuevo
        do {
//////////////////////////////////////////CALCULAR AÑO BISIESTO////////////////////////////////////////////////////////////////////////////////////////

            //OBTENER Y VALIDAR AÑO
            System.out.println("Introduzca su año de nacimiento");
            anio = teclado.nextInt();

            while (anio < 1582){
                System.out.println("Por el amor de dios, ¡es usted más viejo que Matusalén!");
                System.out.println("Introduzca un año de nacimiento razonable, si es usted tan amable");
                anio = teclado.nextInt();
            }

            //Calcular Anio Bisiesto
            if ((anio % 4 == 0) && (anio % 400 == 0 || anio / 100 != 0)) {
                bisiesto = true;
            }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //LEER Y VALIDAR MES
            System.out.println("Introduzca su mes de nacimiento");
            mes = teclado.nextInt();

            while (mes < 1 || mes > 12) {
                System.out.println("Por favor, introduzca un mes entre 1 y 12");
                mes = teclado.nextInt();
            }


            //LEER Y VALIDAR DIA
            System.out.println("Introduzca su día de nacimiento");
            dia = teclado.nextInt();

            //validar dia segun mes
            switch (mes) {
                //Para cuando el dia acaba en 31
                case 1:case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia < 1 || dia > 31) {
                        System.out.println("El dia tiene que estar entre 1 y 31. Por favor, introduzca un dia entre 1 y 31");
                        dia = teclado.nextInt();
                    }

                    //Validar dia
                    while (dia < 1 || dia > 31) {
                        System.out.println(dia + " no es un dia valido. Por favor, introduzca un dia entre 1 y 31");
                        dia = teclado.nextInt();
                    }

                    break;

                //Para cuando el dia acaba en 30
                case 4: case 6: case 9: case 11:
                    if (dia < 1 || dia > 30) {
                        System.out.println("El dia tiene que estar entre 1 y 30. Por favor, introduzca un dia entre 1 y 30");
                        dia = teclado.nextInt();
                    }

                    //Validar dia
                    while (dia < 1 || dia > 30) {
                        System.out.println(dia + " no es un dia valido. Por favor, introduzca un dia entre 1 y 30");
                        dia = teclado.nextInt();
                    }

                    break;

                //CUANDO ANIO ES BISIESTO O NO
                case 2:
                    if (bisiesto) {
                        System.out.println("El dia tiene que estar entre 1 y 28. Por favor, introduzca un dia entre 1 y 28");
                        dia = teclado.nextInt();

                        //Validar dia
                        while (dia < 1 || dia > 28) {
                            System.out.println(dia + " no es un dia valido. Por favor, introduzca un dia entre 1 y 28");
                            dia = teclado.nextInt();
                        }
                    } else {
                        System.out.println("El dia tiene que estar entre 1 y 29. Por favor, introduzca un dia entre 1 y 29");
                        dia = teclado.nextInt();

                        //Validar dia
                        while (dia < 1 || dia > 29) {
                            System.out.println(dia + " no es un dia valido. Por favor, introduzca un dia entre 1 y 29");
                            dia = teclado.nextInt();
                        }
                    }
                    break;
            } //FIN SEGUN

////////////////////////////////////////////////AVERIGUAR NUMERO DEL TAROT///////////////////////////////////////////////////////////////////////////////

            //Sumar dia, mes y anio
            numeroSuma = dia + mes + anio;

            do {
                // Con estas operaciones lo que hace es correr la coma hacia la izquierda y coger el valor que queda a la derecha,
                // asi nos queda el numero sin decimales para la siguiente iteración y coger así los números uno a uno
                numeroTarot = numeroSuma % 10;
                numeroSuma = numeroSuma / 10;

                acumulaTarot += numeroTarot;

            } while (numeroSuma > 0);

            System.out.println("Su numero del tarot es: " + acumulaTarot + "\n");

/////////////////////////////////////////////EJECUTAR DE NUEVO EL PROGRAMA////////////////////////////////////////////////////////////////////////////////

            System.out.println("[S] Ejecutar de nuevo el programa \n [X] Salir del programa");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //validar salir o ejecutar programa de nuevo
            while ( respuesta !='S' && respuesta !='X' ){
                System.out.println("Por favor, introduzca una de las respuestas: \n [S] Ejecutar de nuevo el programa \n [X] Salir del programa");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta != 'X' );  //Fin ejecutar de nuevo

        System.out.println("Vuelva pronto, viva er Beti");

    }
}
