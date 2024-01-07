package figuras;

import java.util.Scanner;

public class VolumenCubo {

	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double area = calcularVolumen(pedirLado());
		System.out.println("El volumen del cubo es: " + area);
		
	}

	public static double calcularVolumen(double lado) {
		double volumen = lado * lado * lado;
		return volumen;
	}
	
	public static double pedirLado() {
		System.out.println("Introduce el lado:");
		double lado = leer.nextInt();
		boolean salir = false;
		while (!salir) {
			if (lado <= 0) {
				System.err.println("Error. El lado no puede ser menor o igual que 0. Vuelve a introducirlo:");
				lado = leer.nextInt();
			}
			else {
				salir = true;
			}
		}
		return lado;
	}
}
