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

        Double maxDouble = Double.MIN_VALUE;
        Double minDouble = Double.MAX_VALUE;
        String minKey = null;
        String maxKey = null;

        for (Map.Entry<String, Double> value : productos.entrySet()){
                String llave = value.getKey();
                Double valor = value.getValue();

                if (valor > maxDouble){
                    maxDouble= valor;
                    maxKey = llave;
                }

                if (valor < minDouble){
                    minDouble = valor;
                    minKey = llave;
                }

        }

       // Imprimir los valores máximo y mínimo
        System.out.println("Producto más caro: " + maxDouble + ", Clave: " + maxKey);
        System.out.println("Producto más barato: " + minDouble + ", Clave: " + minKey);

        //Orden alfabetico
        for (Map.Entry<String, Double> producto : productos.entrySet()){

            System.out.println("\n" + producto);
        }
    }
}