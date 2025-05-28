package Ejercicio2_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*
        * Guardar en un Treemap las temperaturas de 5 ciudades
        * Clave: nombre ciudad
        * Valor: temperatura
        * Imprime las ciudades en orden alfabetico
        * Muestra la ciudad más fria y la más calida
        * */

        TreeMap<String, Double> ciudades = new TreeMap<>();

        //añadir 5 ciudaddes
        ciudades.put("Bogotá", 12.5);
        ciudades.put("Barcelona", 22.0);
        ciudades.put("Sassari", 19.5 );
        ciudades.put("Casablanca", 26.7);
        ciudades.put("Viña del mar", 17.5);

        System.out.println(ciudades);


        // Inicializar el máximo y mínimo
        double maxValue = Double.MIN_VALUE; // Inicializar con el menor valor double
        double minValue = Double.MAX_VALUE; // Inicializar con el mayor valor double
        String minKey = null;
        String maxKey = null;

        for (Map.Entry<String, Double> entry : ciudades.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }

            if (value < minValue) {
                minValue = value;
                minKey = key;
            }
        }


            // Imprimir los valores máximo y mínimo
            System.out.println("Ciudad más calida: " + maxValue + ", Clave: " + maxKey);
            System.out.println("ciudad más fria: " + minValue + ", Clave: " + minKey);

        //Imprimir las ciudades en orden alfabetico
        for (Map.Entry<String, Double> ciudad : ciudades.entrySet()){
            System.out.println("\nCiudad: " + ciudad.getKey() + "\nTemperatura: " + ciudad.getValue());
        }
    }
}