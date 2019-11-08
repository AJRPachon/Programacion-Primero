/*
11. Realizar un programa que lea una fecha de nacimiento de la forma día, mes, año, y dé como resultado el número de Tarot.
El programa verificará si la fecha es correcta.
El número de Tarot se haya sumando los números de la fecha de nacimiento y reduciéndolos a un único dígito.
Por ejemplo, si su fecha de nacimiento es 20 de julio de 1984, el número de Tarot sería:
        20 + 7+ 1984 = 2011 => 2 + 0 + 1+1 = 4
 */

import java.util.Scanner;

public class Tarot {
    public static void main (String[] args){

        int numeroTarot = 0, suma = 2011, cont=0;

        //for ( cont = 0; cont <  )
        numeroTarot = suma % 10;
        suma = suma / 10;

        System.out.println("numero tarot "+numeroTarot);
        System.out.println("suma "+suma);



    }
}
