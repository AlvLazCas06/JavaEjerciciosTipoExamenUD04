package ejercicio01;

public class Apartamento extends Habitacion {
    /*
     * En los apartamentos, no está incluido el servicio de limpieza, pero se puede
     * contratar por lo que será un atributo extra.
     */

    private boolean limpieza;
    
    public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
                       boolean limpieza) {
        super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes);
        this.limpieza = limpieza;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public String toString() {
        return "Apartamento [limpieza=" + limpieza + "]";
    }

    public double calcularPrecio(double dinLimpieza, double descuento) {
		double total = super.calcularPrecio(dinLimpieza, descuento);
		if (limpieza) {
			total += dinLimpieza;
		}
        return total;
    }

}
