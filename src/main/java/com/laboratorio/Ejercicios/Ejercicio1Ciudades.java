package com.laboratorio.Ejercicios;

import java.util.List;

public class Ejercicio1Ciudades {

    public static void ejecutar() {
        System.out.println("=== EJERCICIO 1: Ciudades con Streams ===");

        List<String> ciudades = List.of(
            "Medellin", "Bogota", "Cali", "Pereira",
            "Monteria", "Marinilla", "Malpelo", "Barranquilla"
        );

        System.out.println("Ciudades originales: " + ciudades);
        System.out.println("Resultado (Ciudades que empiezan con 'M', en mayúsculas y ordenadas):");
        
        ciudades.stream()
                .filter(c -> c.startsWith("M"))   
                .map(String::toUpperCase)               
                .sorted()                               
                .forEach(System.out::println);          

        System.out.println();
    }
}
