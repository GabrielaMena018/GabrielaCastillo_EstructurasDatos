package Ejercicio1_HashSet;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> usuarios = new HashSet<>();

        usuarios.add("gaby44108");
        usuarios.add("fabiola80");
        usuarios.add("IvanHernandez");
        usuarios.add("Engineer");
        usuarios.add("fabiola80");

        System.out.println("---------------------LISTA DE USUARIOS------------------");
        System.out.println(usuarios);
        System.out.println("Existe el usuario Engineer: " + usuarios.contains("Engineer"));
    }
}