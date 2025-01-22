package ejercicio02;

public class Movil extends Producto {
	/*
	 * La clase móvil no tienen ningún atributo especial (podéis poner algunos que
	 * queráis como marca, modelo, etc.).
	 */

	private String marca;
	private String modelo;

	public Movil(double precioBase, int unidades, String nombre, boolean vendido, String marca, String modelo) {
		super(precioBase, unidades, nombre, vendido);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public double calcularPVP(double porcentaje, double espadaDoble,int cantidad) {
		double cien = 100;
        setUnidades(getUnidades() - cantidad);
		if (getUnidades() == 0) {
			setVendido(true);
		}
		return getPrecioBase() * cantidad + ((getPrecioBase() * cantidad) * (porcentaje / cien));
	}
	
}
