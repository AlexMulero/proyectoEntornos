package figuras;

import java.util.Scanner;

public class AreaCubo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double area = calcularArea(pedirLado());
		System.out.println("El area del cubo es: " + area);
		

	}

	public static double calcularArea(double lado1) {

		return (lado1*lado1)*6;
	}
	
	public static double pedirLado() {
		double lado1=0;
		do {
			System.out.println("Introduzca lado del cubo-> ");
			lado1 = sc.nextDouble();
			
			if(lado1<1)
				System.err.println("Error, no puede ser menor que 0");
			
		}while(lado1<1);
		return lado1;
	}
	
}
