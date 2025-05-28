package Ejercicio3_LinkedList;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Cola de atención al cliente
        * añade 3 clientes a la cola
        * Atiende al primero(eliminalo)
        * añade un cliente "Priritario" al incio
        * Imprime quien sigue en la fila
        * */

        LinkedList<String> clientes = new LinkedList<>();
        clientes.add("Cliente 1 - Maria");
        clientes.add("Cliente 2 - Iván");
        clientes.add("Cliente 3 - Fabiola");

        System.out.println("Se atendio al primer cliente");
        clientes.removeFirst();

        System.out.println("Llego un cliente prioritario que hay que atender");
        clientes.addFirst("Cliente prioritario - Don Victor");

        System.out.println("-------------------------Cola de atención--------------------------");
        int numero = 1;
        for (String cliente : clientes){
            System.out.println(cliente);
        }
    }
}