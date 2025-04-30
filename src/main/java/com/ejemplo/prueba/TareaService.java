package com.ejemplo.prueba;

import java.util.ArrayList;
import java.util.List;

public class TareaService {
    private List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public List<Tarea> listarTareas() {
        return new ArrayList<>(tareas);
    }

    public boolean completarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).marcarComoCompletada();
            return true;
        }
        return false;
    }

    public boolean eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.remove(index);
            return true;
        }
        return false;
    }
}
