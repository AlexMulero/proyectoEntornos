package figuras;

import java.util.Scanner;

public class AreaClindro {

	static Scanner leer = new Scanner(System.in);
	private static final double pi = 3.14;
	
	public static void main(String[] args) {
		
		double area = calcularArea(pedirRadio(), pedirAltura());
		System.out.println("El area es: " + area);
	}
	
	public static double calcularArea(double radio, double altura) {
		double area = (2*pi) * radio * altura + (2*pi) * (radio * radio);
		return area;
	}
	
	public static double pedirAltura() {
		System.out.println("Introduce la altura:");
		double altura = leer.nextInt();
		boolean salir = false;
		while (!salir) {
			if (altura <= 0) {
				System.err.println("Error. La altura no puede ser menor o igual que 0. Vuelve a introducirla:");
				altura = leer.nextInt();
			}
			else {
				salir = true;
			}
		}
		return altura;
	}
	
	public static double pedirRadio() {
		System.out.println("Introduce el radio:");
		double radio = leer.nextInt();
		boolean salir = false;
		while (!salir) {
			if (radio <= 0) {
				System.err.println("Error. El radio no puede ser menor o igual que 0. Vuelve a introducirlo:");
				radio = leer.nextInt();
			}
			else {
				salir = true;
			}
		}
		return radio;
	}

}
