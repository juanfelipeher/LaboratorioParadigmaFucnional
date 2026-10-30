package com.laboratorio.Ejercicios;

import java.util.List;

public class Ejercicio2Notas {

    public static void ejecutar() {
        System.out.println("=== EJERCICIO 2: Procesamiento de notas ===");

        List<Double> notas = List.of(2.5, 4.0, 3.5, 1.8, 4.8, 3.0, 2.9);

        System.out.println("Notas originales: " + notas);
        System.out.println("Notas procesadas (aprobadas >= 3.0, incremento 0.2, máx 5.0):");

        notas.stream()
             .filter(nota -> nota >= 3.0)              
             .map(nota -> nota + 0.2)                  
             .map(nota -> nota > 5.0 ? 5.0 : nota)     
             .forEach(System.out::println);           

        System.out.println();
    }
}

