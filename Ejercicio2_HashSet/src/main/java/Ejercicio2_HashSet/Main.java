package Ejercicio2_HashSet;

import java.lang.invoke.SwitchPoint;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

//Control de asistentes a un evento
//Se escaneen codigos de barra usando String
//Si un codigo ya fue escaneado muestra un mnesaje: "Ya registrado"
//Al final imprime la lista de asistentes unicos
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String asistenteQr;
        Boolean existencia;
        Set<String> asistentes = new HashSet<>();
        String respuesta;

        do{
                    System.out.println("Ingrese el codigo de invitado");
                    asistenteQr = sc.nextLine();
                    existencia = asistentes.contains(asistenteQr);
                    if (existencia) {
                        System.out.println("\nCodigo ya registrado");
                    } else {
                        System.out.println("Codigo registrado, Bienvenido a la fiesta");
                        asistentes.add(asistenteQr);
                    }

                     System.out.println("--------------Desea agregar otro invitado------------------");
                      respuesta = sc.nextLine();

        }while(Objects.equals(respuesta, "si"));

        System.out.println("\n---------Asistentes------------");
        System.out.println("\n" + asistentes);
    }
}



