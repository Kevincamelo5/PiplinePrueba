package com.ejemplo.prueba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TareaServiceTest {

    @Test
    public void testAgregarYListarTareas() {
        TareaService servicio = new TareaService();
        servicio.agregarTarea("Aprender Jenkins");
        assertEquals(1, servicio.listarTareas().size());
    }

    @Test
    public void testCompletarTarea() {
        TareaService servicio = new TareaService();
        servicio.agregarTarea("Configurar pipeline");
        servicio.completarTarea(0);
        assertTrue(servicio.listarTareas().get(0).estaCompletada());
    }

    @Test
    public void testEliminarTarea() {
        TareaService servicio = new TareaService();
        servicio.agregarTarea("Tarea a eliminar");
        boolean eliminada = servicio.eliminarTarea(0);
        assertTrue(eliminada);
        assertEquals(0, servicio.listarTareas().size());
    }
}
