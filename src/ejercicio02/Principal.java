package ejercicio02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int tam = 2, eleccion, eleccion2, unidades = 0, contador = 0, producto, cantidad;
        double precioBase, porcentaje = 10, espadaDoble = 5, pago;
        String nombre, marca, modelo, tipoEspada;
        boolean vendido = false;
        Producto lista[] = new Producto[tam];
        Ventas ventas = new Ventas(lista);
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido soy un vendedor ambulante de productos electronicos");
        do {
            System.out.println("""
                    ¿Qué deseas hacer?
                    0. Salir
                    1. Añadir producto
                    2. Cantidad de productos sin vender""");
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
                                System.out.println("Dime el precio que va a tener el móvil.");
                                precioBase = scan.nextDouble();
                                System.out.println("Dime el nombre del dispositivo.");
                                nombre = scan.next();
                                System.out.println("Cuantas unidades tenemos de este dispositivo.");
                                unidades = scan.nextInt();
                                System.out.println("Dime de que marca es el móvil");
                                marca = scan.next();
                                System.out.println("Dime que modelo es.");
                                modelo = scan.next();
                                lista[contador] = new Movil(precioBase, unidades, nombre, vendido, marca, modelo);
                                contador++;
                                break;
                            case 2:
                                System.out.println("Dime el precio que va a tener la espada láser.");
                                precioBase = scan.nextDouble();
                                System.out.println("Dime el nombre del dispositivo.");
                                nombre = scan.next();
                                System.out.println("Cuantas unidades tenemos de este dispositivo.");
                                unidades = scan.nextInt();
                                System.out.println("¿Qué tipo de espada es?");
                                tipoEspada = scan.next();
                                lista[contador] = new EspadaLaser(precioBase, unidades, nombre, vendido, tipoEspada);
                                contador++;
                                break;
                            default:
                                System.out.println("Elige una opción correcta.");
                                break;
                        }
                    } while (eleccion2 > 2 || eleccion2 < 1);
                    break;
                case 2:
                    System.out.println("La cantidad de productos sin vender es de " + ventas.cantidadProductosSinVender());
                    break;
                case 3:
                    System.out.printf("El beneficio es de %.2f", ventas.calcularVTP(porcentaje, espadaDoble, unidades));
                    break;
                case 4:
                    System.out.println("Que producto te quieres llevar");
                    producto = scan.nextInt();
                    System.out.println("Dime cuantos te vas a llevar");
                    cantidad = scan.nextInt();
                    System.out.println("Cuanto vas a pagar.");
                    pago = scan.nextDouble();
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
                    break;
            }
        } while (eleccion != 0);
        System.out.println("Gracias por usar este programa.");
        scan.close();
    }

}
