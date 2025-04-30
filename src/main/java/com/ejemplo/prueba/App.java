package com.ejemplo.prueba;

public class App {
    public static void main(String[] args) {
        TareaService servicio = new TareaService();
        servicio.agregarTarea("Estudiar Jenkins");
        servicio.agregarTarea("Hacer pipeline");

        servicio.completarTarea(0);

        for (Tarea t : servicio.listarTareas()) {
            System.out.println(t);
        }
    }
}
