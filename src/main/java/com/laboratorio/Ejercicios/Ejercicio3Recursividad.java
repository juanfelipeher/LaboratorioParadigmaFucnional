package com.laboratorio.Ejercicios;

import java.util.Scanner;

public class Ejercicio3Recursividad {

    public static int potencia(int base, int exponente) {
        
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser un número entero mayor o igual a 0.");
        }
        
        // Caso base: Cualquier número elevado a la potencia 0 da como resultado 1.
        if (exponente == 0) {
            return 1;
        }
        
        // Caso recursivo: Multiplica la base por la función llamándose a sí misma 
        // disminuyendo el exponente en 1 (base^(exponente - 1)).
        return base * potencia(base, exponente - 1);
    }

    public static void ejecutar() {
        System.out.println("=== EJERCICIO 3: Potencia mediante recursividad (Dinámico) ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número base: ");
        int base = scanner.nextInt();

        System.out.print("Ingresa el exponente (>= 0): ");
        int exponente = scanner.nextInt();

        try {
            
            int resultado = potencia(base, exponente);
            
            System.out.println("----------------------------------------");
            System.out.println("Resultado de " + base + " elevado a la " + exponente + " = " + resultado);
            System.out.println("----------------------------------------");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        scanner.close(); 
    }
}