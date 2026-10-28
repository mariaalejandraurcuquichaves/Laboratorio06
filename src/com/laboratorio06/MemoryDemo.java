package com.laboratorio06;

public class MemoryDemo {

    public static void main(String[] args) {
        System.out.println("=== INICIO DE MEMORY DEMO ===");

        int edadBase = 3;
        modificarPrimitivo(edadBase);
        System.out.println("Edad base después del método (sigue igual por valor): " + edadBase);

        Mascota miMascota = new Mascota("Firulais", "Perro", edadBase);
        System.out.println("Antes de modificar: " + miMascota);

        modificarObjeto(miMascota);
        System.out.println("Después de modificar estado (cambió en el Heap): " + miMascota);

        reasignarReferencia(miMascota);
        System.out.println("Después de reasignar referencia (la original no cambia): " + miMascota);
    }

    public static void modificarPrimitivo(int edad) {
        edad = 10; 
        System.out.println("Dentro de modificarPrimitivo, edad = " + edad);
    }

    public static void modificarObjeto(Mascota m) {
        m.setNombre("Max"); 
        m.setEdad(5);
    }

    public static void reasignarReferencia(Mascota m) {
        m = new Mascota("Luna", "Gato", 2);
        System.out.println("Dentro de reasignarReferencia, m = " + m);
    }
}