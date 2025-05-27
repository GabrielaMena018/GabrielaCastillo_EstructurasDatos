package Ejercicio3_HashSet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Dada uan lista de palabras (eje: "hola", "mundo", "hola", "java"), usa un Hashset para filtrarlas palbaras únicas y mostrarlas en mayusculas
* */
public class Main {
    public static void main(String[] args) {
        Set<String> palabras = new HashSet<>();


        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("hola");
        palabras.add("java");

        Iterator<String> iterador = palabras.iterator();

        System.out.println("---------Lista de palabras-----------");
        while(iterador.hasNext()){
            String valor = iterador.next();
            System.out.println(valor.toUpperCase());
        }
    }
}