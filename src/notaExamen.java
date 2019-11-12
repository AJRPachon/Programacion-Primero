/*

10. Diseñar un algoritmo que lea de teclado una nota de un examen de cada uno de los alumnos de una
 clase y calcule la media, la nota más alta, la más baja y el número de alumnos presentados al examen.
  La entrada de datos acaba cuando se lee una nota negativa

ENTRADA:
    double nota
    char respuesta

SALIDA:
    double notaMedia, notaAlta, notaBaja
    int cont

PSEUDOCODIGO GENERALIZADO
Programa Principal
Inicio
    Hacer
        Hacer
            Leer Y Validar Nota

            Comprobar Nota Con NotaAlta
            Comprobar Nota Con NotaBaja
                Comprobar Si NotaBaja>=0

            AcumulaNotaMedia

            Contador

        Mientras ( nota >= 0 )

        Calcular NotaMedia
        Mostrar Resultados

        Preguntar Ejecutar De Nuevo

    Mientras ( respuesta != 'X' )
Fin


 */

import java.util.Scanner;

public class notaExamen {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double nota=0, notaMedia=0, acumulaNotaMedia=0, notaAlta=0, notaBaja=10;
        int cont=0;
        char respuesta = ' ';

        //Mensaje de Bienvenida
        System.out.println("************************** SUSPENDEITOR 4.2 *****************************");
        System.out.println("*************** Bienvenide a le nueve actualización 4.2 *****************");
        System.out.println("*********** Ahore podrá calcular le note medie al instante **************");
        System.out.println("***** Para acabar de introducir notes, introduzque une note negative *****");
        System.out.println("************** PD: Recuerde que el sotane no es une opción **************");

        do {

            System.out.println("\n******************* Introduzque notes de sus alumnes ********************");

            //Bucle que controla la salida de notas cuando se introduce una negativa
            do {

                nota = teclado.nextDouble();

                //validar nota que sea entre 0 y 10
                while (nota > 10) {
                    System.out.println("Por favor, introduzque une note entre 0 y 10");
                    nota = teclado.nextDouble();
                }

                //Para asignar  notaAlta
                if (nota > notaAlta) {
                    notaAlta = nota;
                }

                //Para asignar notaBaja
                if (nota < notaBaja) {
                    if ( nota >= 0 ) {
                        notaBaja = nota;
                    }
                }

                acumulaNotaMedia += nota;

                cont++;

            } while (nota >= 0);

            //Calcular nota media
            notaMedia = (acumulaNotaMedia / cont);


            //Mostrar resultados
            System.out.println("Le note mes alte ha sido un: " + notaAlta);
            System.out.println("Le note mes baje ha sido un: " + notaBaja);
            System.out.println("Le note medie es de: " + notaMedia);
            System.out.println("Le cantided de alumnes presentades al examen ha sido de: " + cont + " alumne/s");

            //Preguntar Ejecutar De Nuevo
            System.out.println("\nDesea ejecutar de nuevo el programe:\n[S] Ejecutar de nueve\n[X] Salir del programe\n");
            respuesta = teclado.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);


            //Validar respuesta
            while ( respuesta != 'X' && respuesta != 'S' ){
                System.out.println("Por favor, introduzque une de les opciones a elegir:\n[S] Ejecuter de nueve\n[X] Salir del programe\n");
                respuesta = teclado.next().charAt(0);
                respuesta = Character.toUpperCase(respuesta);
            }

        }while ( respuesta != 'X' );

        System.out.println("Vuelve pronte");
    }
}
