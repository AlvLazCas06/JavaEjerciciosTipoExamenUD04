package ejercicio02;

import java.util.Arrays;

public class Ventas {
	/*
	 * En una clase ventas, además de tener un array de productos, se deben crear
	 * métodos que hagan las siguientes operaciones: Devolver la cantidad de
	 * productos que quedan por vender (en total), sin especificar de qué tipo.
	 * Calcular la cantidad total de dinero recaudado entre todas ventas. Devolver
	 * cambio, pasando lo que se debe pagar y el dinero entregado y retornando la
	 * cantidad a devolver. Mostrar listado de productos completo mostrando los
	 * avisos cuando sea necesario
	 */
	private Producto lista[];

	public Ventas(Producto[] lista) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}

	public int cantidadProductosSinVender() {
		int total = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (!lista[i].isVendido()) {
				total += lista[i].getUnidades();
			}
		}
		return total;
	}

	public double calcularVTP(double porcentaje, double espadaDoble, int cantidad) {
		double total = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			total += lista[i].calcularPVP(porcentaje, espadaDoble, cantidad);
		}
		return total;
	}
	
	public double devolverCambio(double pago, int prod, double porcentaje, double espadaDoble,int cantidad) {
		return pago - lista[prod - 1].calcularPVP(porcentaje, espadaDoble, cantidad);
	}
	
	public void mostrarTP() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			System.out.println(lista[i]);
		}
	}
	
}
