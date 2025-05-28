package Ejercicio2_LinkedList;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
    * Historial de navegación
    *
    * Añade 5 paginas
    * Simula un boton "Atras" (elimina la ultima pagina)
    * imprime el historial actual
    * */
        Scanner sc = new Scanner(System.in);
        LinkedList<String> paginas = new LinkedList<>();
        paginas.add("www.Github.com");
        paginas.add("www.zoom.com");
        paginas.add("www.daisyUI.com");
        paginas.add("www.figma.com");
        paginas.add("www.netecad.com");

        System.out.println("ATRÁS");
        System.out.println("Escribe Click para precionar el botón");
        String boton = sc.nextLine();
        if (Objects.equals(boton, "Click") || Objects.equals(boton, "click")){
            paginas.removeLast();
            System.out.println("--------------------HISTORIAL ACTUAL------------------");
            System.out.println("\n" + paginas);
        }else {
            System.out.println("--------------------HISTORIAL-------------------");
            System.out.println(paginas);
        }


    }
}