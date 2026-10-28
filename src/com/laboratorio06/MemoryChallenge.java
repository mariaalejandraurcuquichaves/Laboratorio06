package com.laboratorio06;

public class MemoryChallenge {
    public static void main(String[] args) {
        System.out.println("=== RETO INTEGRADOR: SEGUIMIENTO DE MASCOTAS ===");

        Mascota m1 = new Mascota("Rocky", "Perro", 4);
        Mascota m2 = m1; 

        m2.setNombre("Zeus");
        
        System.out.println("m1 nombre: " + m1.getNombre());
        System.out.println("m2 nombre: " + m2.getNombre());

        Mascota m3 = null;
        try {
            System.out.println(m3.getNombre()); 
        } catch (NullPointerException e) {
            System.out.println("¡Capturado! Error evitado: Se intentó acceder a un método con una referencia nula (null).");
        }
    }
}