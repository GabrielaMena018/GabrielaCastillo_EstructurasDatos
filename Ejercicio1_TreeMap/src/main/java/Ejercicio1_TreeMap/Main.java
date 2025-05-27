package Ejercicio1_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

      /*Crear un Treemap donde las claves sean nombres de productos y los valores sean sus precios
      * ordena los productos alfabeticamente
      * Busca el precio de un producto especifico
      * Imprime el producto más barato y más caro
      * */

        TreeMap<String , Double> productos = new TreeMap<String, Double>();

        //Añadir productos
        productos.put("Arroz",1.1);
        productos.put( "Frijoles",1.0 );
        productos.put("Pupusas",0.5);
        productos.put("Te de limon" ,1.25);

        //Precio de valor especifico
        System.out.println("\nProducto del arroz " + productos.get("Arroz"));

        //Producto más caro y más barato
        System.out.println("\nproducto más barato " + productos.firstEntry());
        System.out.println("\nProducto más caro " + productos.lastEntry());

        //Orden alfabetico
        for (Map.Entry<String, Double> producto : productos.entrySet()){

            System.out.println("\n" + producto);
        }
    }
}