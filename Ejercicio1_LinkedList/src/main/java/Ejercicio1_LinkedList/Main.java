package Ejercicio1_LinkedList;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*PLAYLIST DE MUSICA
    *
    * Escribe el nombre de tu Top 10 de musica y agregalas en el orden que tu quieras
    * añade 3 canciones al final.
    * agrega una cación como reproducir siguinet (al incio)
    * Elimina la ultima canción
    * Imprime la Playlist en orden
    * */

        LinkedList<String> Playlist = new LinkedList<>();
        Playlist.add("Manuel Turizo – La Bachata");
        Playlist.add("Mora – Memorias");
        Playlist.add("Álvaro Díaz – Problemón (feat. Rauw Alejandro)");
        Playlist.add("Nicky Jam – El Perdón (con Enrique Iglesias");
        Playlist.add("Manuel Turizo – Una Lady Como Tú");
        Playlist.add("Álvaro Díaz – 1000Canciones (feat. Sen Senra)");
        Playlist.add("Nicky Jam – Travesuras");
        Playlist.add("Manuel Turizo – Culpables (con Karol G)");
        Playlist.add("Mora – Tuyo");
        Playlist.add("Luis Fonsi – Despacito");

        //Añadir 3 canciones al final
        Playlist.addLast("Linkin Park – Numb");
        Playlist.addLast("Ed Sheeran – Shape of You");
        Playlist.addLast("Dua Lipa – Levitating");

        //Agerar canción al incio
        Playlist.addFirst("Reproducir Siguiente");

        //Eliminar la ultima canción
        Playlist.removeLast();

        //Imprimir la playlist en orden
        System.out.println("-------------------PLAYLIST----------------------");
        int index = 1;
        for (String cancion : Playlist){
            System.out.println(index++ + "." + cancion);
        }
    }
}