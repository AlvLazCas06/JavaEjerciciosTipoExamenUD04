package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 2, eleccion, eleccion2;
		Producto lista[] = new Producto[tam];
		Ventas ventas = new Ventas(lista);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido soy un vendedor ambulante de productos electronicos");
		do {
			System.out.println("""
					¿Qué deseas hacer?
					0. Salir
					1. Añadir producto""");
			eleccion = scan.nextInt();
			switch (eleccion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("""
						¿Que deseas añadir?
						1. Movil
						2. Espada laser""");
				do {
					eleccion2 = scan.nextInt();
					switch (eleccion2) {
					case 1:
						
						break;
					case 2:
						break;
					default:
						System.out.println("Elige una opción correcta.");
						break;
					}
				} while (eleccion2 > 2 || eleccion2 < 1);
			default:
				System.out.println("Elige una opción correcta.");
				break;
			}
		} while (eleccion != 0);
		System.out.println("Gracias por usar este programa.");
		scan.close();
	}

}
