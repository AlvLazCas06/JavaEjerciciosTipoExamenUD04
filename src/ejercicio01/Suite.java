package ejercicio01;

public class Suite extends Habitacion {
	/*
	 * En la clase Suite tenemos también la característica de metros cuadrados y la
	 * cantidad de dinero consumido en servicio de habitaciones. En estas
	 * habitaciones (y solo en estas por ser las más caras), el hotel tiene como
	 * detalle, hacer un descuento al precio base de la habitación.
	 */

	private double metros;
	private double dineroConsum;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			double metros, double dineroConsum) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes);
		this.metros = metros;
		this.dineroConsum = dineroConsum;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public double getDineroConsum() {
		return dineroConsum;
	}

	public void setDineroConsum(double dineroConsum) {
		this.dineroConsum = dineroConsum;
	}

	public String toString() {
		return "Suite [metros=" + metros + ", dineroConsum=" + dineroConsum + "]";
	}

	public double calcularPrecio(double dinLimpieza, double descuento) {
		double cien = 100, total = 0;
		total = super.calcularPrecio(dinLimpieza, descuento) + dineroConsum;
		return total - (total * (descuento / cien));
	}

}
