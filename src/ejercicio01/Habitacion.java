package ejercicio01;

public class Habitacion {
	/*
	 * Los atributos de una habitación estándar serán: precio base, si está ocupada
	 * o no, nombre del cliente, número de días de ocupación y número de ocupantes.
	 */

	private double preicoBase;
	private boolean ocupada;
	private String nombreCliente;
	private int diasOcupacion;
	private int numOcupantes;

	public Habitacion(double preicoBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes) {
		this.preicoBase = preicoBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupacion = diasOcupacion;
		this.numOcupantes = numOcupantes;
	}

	public double getPreicoBase() {
		return preicoBase;
	}

	public void setPreicoBase(double preicoBase) {
		this.preicoBase = preicoBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupacion() {
		return diasOcupacion;
	}

	public void setDiasOcupacion(int diasOcupacion) {
		this.diasOcupacion = diasOcupacion;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	public String toString() {
		return "Habitacion [preicoBase=" + preicoBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", diasOcupacion=" + diasOcupacion + ", numOcupantes=" + numOcupantes + "]";
	}
	
	public double calcularPrecio(double dinLimpieza, double descuento) {
		return preicoBase * diasOcupacion;
	}

}
