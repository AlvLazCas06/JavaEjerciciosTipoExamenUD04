package ejercicio02;

public class EspadaLaser extends Producto {
	/*
	 * La clase Espada tiene como atributo un String que informe sobre el tipo de
	 * espada que es (simple, double...).
	 */

	private String tipo;

	public EspadaLaser(double precioBase, int unidades, String nombre, boolean vendido, String tipo) {
		super(precioBase, unidades, nombre, vendido);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "EspadaLaser [tipo=" + tipo + "]";
	}

	public double calcularPVP(double porcentaje, double espadaDoble, int cantidad) {
		double cien = 100, total = 0;
		setUnidades(getUnidades() - cantidad);
		if (getUnidades() == 0) {
			setVendido(true);
		}
		if (tipo.equalsIgnoreCase("doble")) {
			total = getPrecioBase() * cantidad + ((getPrecioBase() * cantidad) * (porcentaje / cien)) + espadaDoble;
		} else {
			total = getPrecioBase() * cantidad + ((getPrecioBase() * cantidad) * (porcentaje / cien));
		}
		
		return total;
	}

}
