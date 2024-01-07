package figuras;

import java.util.Scanner;
public class AreaPerimetroCircunferencia {

	private static final double pi = 3.14;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		do {
			System.out.println("Introduce el radio de la circunferencia->");
			radio = sc.nextDouble();
			if ( radio<=0)
				System.err.println("Error, no puede ser menor a 0");
		}while(radio<=0);

		
		System.out.println("El area de la circunferencia con radio "+radio+" es "+areaCircunferencia(radio));
		System.out.println("El perímetro de la circunferencia con radio "+radio+" es "+perimetroCircunferencia(radio));
		

	}
	
//Area de la circunferencia
	
	public static double areaCircunferencia(double radio) {
		return pi*radio*radio;
				
		
	}
	
//Perimetro de la circunferencia
	public static double perimetroCircunferencia(double radio) {
		return 2*pi*radio;
		
	}
	

}
