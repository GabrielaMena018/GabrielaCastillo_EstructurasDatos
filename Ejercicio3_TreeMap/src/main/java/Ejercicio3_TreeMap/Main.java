package Ejercicio3_TreeMap;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*RANKING DE PUNTAJES
        *
        * Crear un treeMap donde las
        * claves sena nombres de jugadores y
        * los valores sean sus puntajes
        * Ordenar los jugadores por nombre
        * Imprimir el jugador con el puntaje más alto (pista: recorer el mapa)
        * */

        TreeMap<String,Integer> jugadores = new TreeMap<>();

        jugadores.put("Messi", 93);
        jugadores.put("Ronaldo", 92);
        jugadores.put("Mbappé", 91);
        jugadores.put("Haaland", 90);
        jugadores.put("Rudiger", 88);

        //Imprimir el jugador con puntaje más alto
        Integer MaxValue = Integer.MIN_VALUE;
        String MaxKey = null;

        for (Map.Entry<String, Integer> value : jugadores.entrySet()){
            String llave = value.getKey();
            Integer Valor = value.getValue();

            if (Valor > MaxValue){
                MaxValue = Valor;
                MaxKey = llave;
            }
        }

        System.out.println("\nEl jugador con puntaje MAximo es: " + MaxKey + " con un puntaje de: " + MaxValue);

        System.out.println("\n-----------------------LISTADO DE JUGADORES-----------------------");
        //Ordenar los jugadores por nombre
        for (Map.Entry<String, Integer> jugador : jugadores.entrySet()){
            System.out.println("Jugador: " + jugador.getKey() + " Puntaje: " + jugador.getValue());
        }

    }
}