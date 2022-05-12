package tareaf17;

import java.util.ArrayList;
import comprobaciones.*;
public class Main {
	
	public static void main(String[] args) {
		ArrayList<ProductoDisponible> productos = new ArrayList<ProductoDisponible>();
		ProductoDisponible producto1 = new ProductoDisponible("pantalon",100);
		ProductoDisponible producto2 = new ProductoDisponible("falda",50);
		ProductoDisponible producto3 = new ProductoDisponible("zapatos",120);
		ProductoDisponible producto4 = new ProductoDisponible("shorts",214);
		ProductoDisponible producto5 = new ProductoDisponible("zapatillas",310);
		ProductoDisponible producto6 = new ProductoDisponible("jersey",190);
		ProductoDisponible producto7 = new ProductoDisponible("niki",34);
		ProductoDisponible producto8 = new ProductoDisponible("gabardina",270);
		ProductoDisponible producto9 = new ProductoDisponible("sudadera",110);
		ProductoDisponible producto10 = new ProductoDisponible("chandal",50);
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
		productos.add(producto6);
		productos.add(producto7);
		productos.add(producto8);
		productos.add(producto9);
		productos.add(producto10);
		new Menu(productos);
//		Comprobaciones comprobaciones = new Comprobaciones();
//		System.out.println(comprobaciones.compruebaTelefono("651708152"));
	}

}
