/*
 * Nombre del algoritmo: FasesHorarias
 * 
 * ANALISIS
 * 		- Realizar un programa que lea un instante de tiempo(H,M,) y de como respuesta el instante del día 
 * 			al que pertenece
 * 
 * ENTRADA:
 * 		- int horas
 * 		- int minutos
 * 		
 * SALIDA:
 * 		- Mensajes de comunicación con el usuario y eco de los datos de entrada
 * 
 * RESTRICCIONES:
 * 		- hora => 0 && <=23
 * 		- minuto =>0 && <60
 * 		
 * 		- "Buenos dias" si hora =>7:30 && <=14:00
 * 		- "Buenas tardes" si hora => 14:01 && <=20:30
 * 		- "Buenas noches" si hora =>20:31 && <=7:29
 * 
 * 
 * PSEUDOCODIGO GENERALIZADO
 * Nombre del algoritmo: FasesHorarias
 * ProgramaPrincipal
 * Inicio
 * 		LeerYValidarEjecutar
 * 		Mientras(Respuesta S)
 * 			ObtenerYValidarDatos
 * 			CalcularFaseYMostrarResultados
 * 			LeerYValidarEjecutar
 * 		FinMientras
 * Fin
 * 
 */
 
 import java.util.Scanner;
 
 public class FasesHorarias{
	 
	 public static void main ( String [] args ){
		 Scanner teclado = new Scanner(System.in);
		 
		 int horas = 0, minutos = 0;
		 char respuesta;
		 
		 //LeerYValidarEjecutar
		 do{
			 System.out.println("Desea ejecutar el programa (S/N)");
			 respuesta = teclado.next().charAt(0);
			 respuesta = Character.toUpperCase(respuesta);
		}while ( respuesta !='S' && respuesta !='N' );
		
		
		while ( respuesta == 'S' ){
			
			//ObtenerYValidarDatos
			do{
				System.out.println("Introduzca una hora valida");
				horas = teclado.nextInt();
			}while ( horas < 0 || horas > 23 );
			
			
			do{
				System.out.println("Introduzca minutos");
				minutos = teclado.nextInt();
			}while ( minutos < 0 || minutos > 59 );
			
			
			//CalcularFaseYMostrarResultados
			if (( horas == 7 && minutos >= 30 ) || ( horas == 14 && minutos == 0 ) || ( horas > 7 && horas < 14 )){
				
				System.out.println("Buenos dias");
				
				}else {
					if (( horas == 14 && minutos != 0 ) || ( horas == 20 && minutos <= 30 ) || ( horas > 14 && horas <= 20)){
						System.out.println("Buenas Tardes");
				
					}else{
						System.out.println("Buenas noches");
				}
			}
			
			//LeerYValidarEjecutar
			do{
				System.out.println("Desea ejecutar el programa (S/N)");
				respuesta = teclado.next().charAt(0);
				respuesta = Character.toUpperCase(respuesta);
			}while ( respuesta !='S' && respuesta !='N' );
		}
	}
}

				
				
		 
		 

