package ejercicio02;

public abstract class Producto {
	/*
	 * Vamos a intentar modelar a un vendedor ambulante de “productos tecnológicos”.
	 * Tendremos una clase abstracta Producto cuyos atributos serán, como mínimo
	 * (quizá hagan falta más), precio base, cantidad de unidades de un producto y
	 * nombre. Tendremos dos tipos específicos de productos, móviles y espadas
	 * láser.
	 */

	private double precioBase;
	private int unidades;
	private String nombre;
	private boolean vendido;

	public Producto(double precioBase, int unidades, String nombre, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.unidades = unidades;
		this.nombre = nombre;
		this.vendido = vendido;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public String toString() {
		return "Producto [precioBase=" + precioBase + ", unidades=" + unidades + ", nombre=" + nombre + "]";
	}

	public double calcularPVP(double porcentaje, int cantidad) {
		unidades -= cantidad;
		if (unidades == 0) {
			vendido = true;
		}
		return precioBase * cantidad;
	}

}
