package ejercicio01;

import java.util.Arrays;

public class GestionHabitaciones {
	/*
	 * En la clase gestión, se debe crear un array de habitaciones donde guardaremos
	 * una habitación de cada tipo, incluyendo una estándar y podremos hacer lo
	 * siguiente: Calcular el precio a pagar por una habitación de la lista elegida
	 * por el usuario. Calcular lo recaudado en total entre todas las habitaciones
	 * ocupadas. Mostrar factura con toda la información. Mostrar listado solo de
	 * las habitaciones que no están ocupadas.
	 */

	private Habitacion lista[];

	public GestionHabitaciones(Habitacion[] lista) {
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion lista[]) {
		this.lista = lista;
	}

	public String toString() {
		return "GestionHabitaciones{" + "lista=" + Arrays.toString(lista) + '}';
	}

	// Calcular el precio a pagar por una habitación de la lista elegida por el
	// usuario.
	public double calcularPH(int habitacion, double dinLimpieza, double descuento) {
		return lista[habitacion - 1].calcularPrecio(dinLimpieza, descuento);
	}

	// Calcular lo recaudado en total entre todas las habitaciones ocupadas.
	public double calcularPTH(double dinLimpieza, double descuento) {
		double total = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			total += lista[i].calcularPrecio(dinLimpieza, descuento);
		}
		return total;
	}

	// Mostrar factura con toda la información.
	public void mostrarFactura(int habitacion) {
		
		if (lista[habitacion - 1] != null) {
			if (lista[habitacion - 1] instanceof Suite) {
				System.out.printf("""
						***************************************************
						*                Hotel Fuerte                     *
						*                                                 *
						*  Nombre: %s                                     *
						*  Ocupantes: %d                                  *
						*  Habitación: Suite                              *
						*  Días: %d                                       *
						*  Servicio de Habitaciones: %.2f€                *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						***************************************************
						""", lista[habitacion - 1].getNombreCliente(), lista[habitacion - 1].getNumOcupantes(), lista[habitacion - 1].getDiasOcupacion(), ((Suite)lista[habitacion - 1]).getDineroConsum());
			} else if (lista[habitacion - 1] instanceof Apartamento) {
				System.out.printf("""
						***************************************************
						*                Hotel Fuerte                     *
						*                                                 *
						*  Nombre: %s                                     *
						*  Ocupantes: %d                                  *
						*  Habitación: Apartamento                        *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						***************************************************
						""", lista[habitacion - 1].getNombreCliente(), lista[habitacion - 1].getNumOcupantes());
			} else {
				System.out.printf("""
						***************************************************
						*                Hotel Fuerte                     *
						*                                                 *
						*  Nombre: %s                                     *
						*  Ocupantes: %d                                  *
						*  Habitación: Estandar                           *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						*                                                 *
						***************************************************
						""", lista[habitacion - 1].getNombreCliente(), lista[habitacion - 1].getNumOcupantes());
			}
		}

	}
	// Mostrar listado solo de las habitaciones que no están ocupadas.
	public void mostrarHabitacionesVacias() {
		for (int i = 0; i < lista.length && lista [i] != null; i++) {
			if (!lista[i].isOcupada()) {
				System.out.println(lista[i]);
			}
		}

	}

}
