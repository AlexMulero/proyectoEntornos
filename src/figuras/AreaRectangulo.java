package figuras;

import java.util.Scanner;

public class AreaRectangulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double area = calcularArea(pedirLado(),pedirLado());
		System.out.println("El area del rectangulo es: " + area);

	}

	public static double calcularArea(double lado1, double lado2) {

		return lado1*lado2;
	}
	
	public static double pedirLado() {
		double lado1=0;
		do {
			System.out.println("Introduzca lado del rectangulo-> ");
			lado1 = sc.nextDouble();
			
			if(lado1<1)
				System.err.println("Error, no puede ser menor que 0");
			
		}while(lado1<1);
		return lado1;
	}
	
}
