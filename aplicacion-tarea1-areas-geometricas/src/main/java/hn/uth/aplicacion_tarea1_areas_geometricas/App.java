package hn.uth.aplicacion_tarea1_areas_geometricas;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //System.out.println( "App para calcular el área de Figuras Geométricas" );
        
       int opcion = 0;
       
       
       while(opcion != 5) {
       	imprimirMenu();
       	opcion = leerEnteroTeclado("");
       	Double resultado = null;
       	if(opcion == 1) {
       		resultado = circulo(leerDecimalTeclado("Escriba el radio del círculo: "),leerDecimalTeclado("Introduzca cualquier número y luego presione la tecla ENTER"));
       	}else if(opcion == 2) {
       		resultado = cuadrado(leerDecimalTeclado("Escriba el número del lado #1: "),leerDecimalTeclado("Escriba el número del lado #2: "));

       	}else if(opcion == 3) {
       		resultado = rectangulo(leerDecimalTeclado("Escriba el número de la base: "),leerDecimalTeclado("Escriba el número de la altura: "));

       	}else if(opcion == 4) {
       		resultado = triangulo(leerDecimalTeclado("Escriba el número de la base: "),leerDecimalTeclado("Escriba el número de la altura: "));

       	}else {
       		System.out.println("Finalizando la aplicación.");
       	}
       	System.out.println("El resultado de la operación es: "+resultado);
       }
       
       
       
   }

	private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		System.out.println("*** CÁLCULO DE ÁREAS DE FIGURAS GEOMÉTRICAS ***");
		System.out.println("1. CÍRCULOS");
		System.out.println("2. CUADRADOS");
		System.out.println("3. RECTÁNGULOS");
		System.out.println("4. TRIÁNGULOS");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}

    
	


	public static double circulo(double pi, double radio) { 
        		double radio2 = radio*radio;
        		double pi2 = 3.1415;
			
        		
        		return pi2*radio2;
        		
	} 
	  
     
	public static double cuadrado(double lado1, double lado2) {
		
		return lado1*lado2;
	}



	public static double rectangulo(double base, double altura) {
		
		return base*altura;
	}



	public static double triangulo(double base, double altura) {
	int entre = 2;
		return base*altura/entre;
	}	  
}
	

