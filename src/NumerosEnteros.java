/*
    2.- Construye un programa que lea dos números enteros positivos y nos de una lista de los divisores de cada uno de ellos y de los comunes.


    ENTRADAS:
        numero1, numero2, respuesta

    SALIDAS:
        acumula1, acumula2, comunes

    VARIABLES:
        int cont, listaDivisores = 1, listaDivisores2 = 1, numeroPequeño = 0, numeroGrande = 0, numero1, numero2;
        String acumula1 = "", acumula2 = "", comunes = "";
        char respuesta

    PSEUDOCÓDIGO DETALLADO
    ProgramaPrincipal
    Inicio

        Inicializar numeroGrande= 0, NumeroPequeño=0, listaDivisores = 1, listaDivisores2 = 1
        String acumula1, acumula2, comunes

        Pedir nunero1 y validar
        Pedir numero2 y validar

        Si ( numero1 > numero2 )
            numeroGrande = numero1
            numeroPequeño = numero2
        SiNo
            numeroGrande = numero2
            numeroPequeño = numero1

        Para ( cont=0, cont <= numeroGrande, cont++ )
            Si ( numeroGrande % cont == 0 )
                listaDivisores = cont
                acumula1 += " "+listaDivisores1
            FinSi

            Si ( cont <= numeroPequeño )
                Si ( numeroPequeño % cont == 0 )
                    listaDivisores = cont
                    acumula2 += " "+listaDivisores2
                FinSi
            FinSi

            Si ( listaDivisores == listaDivisores2 )
                comunes += " "+listaDivisores
            FinSi

      Fin

 */

import java.util.Scanner;

public class NumerosEnteros {
    public static void main (String[] args ){

        Scanner teclado = new Scanner(System.in);

        int cont, listaDivisores = 1, listaDivisores2 = 1, numeroPequeño = 0, numeroGrande = 0, numero1, numero2;
        String acumula1 = "", acumula2 = "", comunes = "";
        char respuesta = ' ';

        do {
            //Pedir nunero1
            System.out.println("Introduce valor de primer número");
            numero1 = teclado.nextInt();

            //Validar numero1
            while (numero1 < 0) {
                System.out.println("Por favor, introduzca un número mayor que 0");
                numero1 = teclado.nextInt();
            }

            //Pedir numero2
            System.out.println("Introduce valor para el segundo número");
            numero2 = teclado.nextInt();

            //Validar numero2
            while (numero2 < 0) {
                System.out.println("Por favor, introduzca un número mayor que 0");
                numero2 = teclado.nextInt();
            }

            //Para saber cuál es el número mayor y menor
            if (numero1 > numero2) {
                numeroGrande = numero1;
                numeroPequeño = numero2;
            } else {
                numeroPequeño = numero1;
                numeroGrande = numero2;
            }


            for (cont = 1; cont <= numeroGrande; cont++) {

                if (numeroGrande % cont == 0) {
                    listaDivisores = cont;
                    acumula1 += " " + listaDivisores;
                }

                if (cont <= numeroPequeño) {
                    if (numeroPequeño % cont == 0) {
                        listaDivisores2 = cont;
                        acumula2 += " " + listaDivisores2;
                    }
                }

                if (listaDivisores == listaDivisores2) {
                    comunes += " " + listaDivisores;
                }
            }

            System.out.println("Divisores primer número: " + acumula1);
            System.out.println("Divisores segundo número: " + acumula2);
            System.out.println("Divisores comunes: " + comunes);

            //Preguntar ejecutar de nuevo
            System.out.println("\nDesea ejecutar de nuevo S/N");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);

            //Validar ejecutar
            while ( respuesta != 'S' && respuesta != 'N' ){
                System.out.println("Por favor, introduzca una de las opciones S/N");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta !='N' );
    }
}
