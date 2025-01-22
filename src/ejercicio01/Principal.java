package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero
		 * estilo hotel para que tenga caché. Debemos gestionar mi “minihotel” y para
		 * ello, debemos crear la clase Habitación estándar, dos hijas llamadas Suite y
		 * Apartamento. Una clase más de gestión del hotel, que se puede llamar
		 * GestionHabitaciones y una clase principal de prueba para probar todos los
		 * métodos. Los atributos de una habitación estándar serán: precio base, si está
		 * ocupada o no, nombre del cliente, número de días de ocupación y número de
		 * ocupantes. En la clase Suite tenemos también la característica de metros
		 * cuadrados y la cantidad de dinero consumido en servicio de habitaciones. En
		 * estas habitaciones (y solo en estas por ser las más caras), el hotel tiene
		 * como detalle, hacer un descuento al precio base de la habitación. En los
		 * apartamentos, no está incluido el servicio de limpieza, pero se puede
		 * contratar por lo que será un atributo extra. Usaremos un método rescrito para
		 * calcular el precio de cualquier habitación. Para una habitación estándar la
		 * cantidad a pagar es el precio base por el número de días. Para los otros
		 * tipos: ✓ Suites: hay que sumarle la cantidad según lo consumido en el
		 * servicio de habitaciones y descontarle el porcentaje que se pase como
		 * parámetro para el descuento. ✓ Apartamentos: Hay que sumarle el extra por el
		 * servicio de limpieza. En la clase gestión, se debe crear un array de
		 * habitaciones donde guardaremos una habitación de cada tipo, incluyendo una
		 * estándar y podremos hacer lo siguiente: Calcular el precio a pagar por una
		 * habitación de la lista elegida por el usuario. Calcular lo recaudado en total
		 * entre todas las habitaciones ocupadas. Mostrar factura con toda la
		 * información. Mostrar listado solo de las habitaciones que no están ocupadas.
		 */
		
		int tam = 4, contador = 0, eleccion, eleccion2, eleccion3, numHuespedes, days, habitacion;
		double precioBaseS = 1000, precioBaseA = 750, precioBase = 500, metros, dinServicio, dinLimpieza = 200, descuento = 10;
		String nombre;
		boolean ocupada, limpieza;
		Habitacion lista[] = new Habitacion[tam];
		GestionHabitaciones habitaciones = new GestionHabitaciones(lista);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenidos al hotel fuerte.");
		
		do {
			System.out.println("""
					¿Qué deseas hacer?
					0. Salir
					1. Añadir habitación
					2. Calcular precio de una habitación
					3. Calcular venta de todos los hoteles
					4. Mostrar factura de una habitación
					5. Mostrar habitaciones vacias""");
			eleccion = scan.nextInt();
			switch (eleccion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("""
						¿Qué habitación deseas escoger?
						1. Estandar
						2. Suite
						3. Apartamento""");
				do {
					eleccion2 = scan.nextInt();
					switch (eleccion2) {
					case 1:
						System.out.println("Dime el nombre y apellidos del titular de la reserva");
						nombre = scan.next();
						System.out.println("Cuantos integrantes van a asistir.");
						numHuespedes = scan.nextInt();
						System.out.println("""
								¿La habitación ya va a estar ocupada?
								0. No
								1. Sí""");
						eleccion3 = scan.nextInt();
						if (eleccion3 == 1) {
							ocupada = true;
						} else {
							ocupada = false;
						}
						System.out.println("¿Cuántos días se van a hospedar?");
						days = scan.nextInt();
						lista[contador] = new Habitacion(precioBase, ocupada, nombre, days, numHuespedes);
						contador++;
						break;
					case 2:
						System.out.println("Dime el nombre y apellidos del titular de la reserva");
						nombre = scan.next();
						System.out.println("Cuantos integrantes van a asistir.");
						numHuespedes = scan.nextInt();
						System.out.println("""
								¿La habitación ya va a estar ocupada?
								0. No
								1. Sí""");
						eleccion3 = scan.nextInt();
						if (eleccion3 == 1) {
							ocupada = true;
						} else {
							ocupada = false;
						}
						System.out.println("¿Cuántos días se van a hospedar?");
						days = scan.nextInt();
						System.out.println("¿De cuantos metros sería la habitación?");
						metros = scan.nextDouble();
						System.out.println("Cuánto dinero va a gastar en el servico de habitaciones.");
						dinServicio = scan.nextDouble();
						lista[contador] = new Suite(precioBaseS, ocupada, nombre, numHuespedes, days, metros, dinServicio);
						contador++;
						break;
					case 3:
						System.out.println("Dime el nombre y apellidos del titular de la reserva");
						nombre = scan.next();
						System.out.println("Cuantos integrantes van a asistir.");
						numHuespedes = scan.nextInt();
						System.out.println("""
								¿La habitación ya va a estar ocupada?
								0. No
								1. Sí""");
						eleccion3 = scan.nextInt();
						if (eleccion3 == 1) {
							ocupada = true;
						} else {
							ocupada = false;
						}
						System.out.println("¿Cuántos días se van a hospedar?");
						days = scan.nextInt();
						System.out.println("""
								Va a querer servicio de habitaciones.
								0. No
								1. Sí""");
						eleccion3 = scan.nextInt();
						if (eleccion3 == 1) {
							limpieza = true;
						} else {
							limpieza = false;
						}
						lista [contador] = new Apartamento(precioBaseA, ocupada, nombre, numHuespedes, days, limpieza);
						break;
					default:
						System.out.println("Elije una opción valida.");
						break;
					}
				} while (eleccion2 >= 4);
				break;
			case 2:
				System.out.println("Elige la habitación a la que quieres calcular el precio.");
				habitacion = scan.nextInt();
				System.out.printf("El precio de la habitación es de: %.2f€\n", habitaciones.calcularPH(habitacion, dinLimpieza, descuento));
				break;
			case 3:
				System.out.printf("El dinero total recaudado de todas las habitaciones es de: %.2f€\n", habitaciones.calcularPTH(dinLimpieza, descuento));
				break;
			case 4:
				System.out.println("De que habitación quiere la factura.");
				habitacion = scan.nextInt();
				habitaciones.mostrarFactura(habitacion);
				break;
			case 5:
				habitaciones.mostrarHabitacionesVacias();
				break;
			default:
				System.out.println("Elige una opción correcta");
				break;
			}
		} while (eleccion != 0);
		System.out.println("Gracias por usar este programa.");
		scan.close();
		
	}

}
