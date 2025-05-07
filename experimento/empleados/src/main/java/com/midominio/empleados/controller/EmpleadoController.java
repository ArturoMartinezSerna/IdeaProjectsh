package com.midominio.empleados.controller;


import com.midominio.empleados.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller

public class EmpleadoController {

    private static ArrayList<Empleado> empleados = new ArrayList<>();

    @GetMapping("/") // Llama al archivo que nombra esta funcion con lo indicado en el parentesis. Es decir. Al llamar al puerto 8080/, te devuelve index
    public String llamarIndex(Model model) {
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("puestos", Empleado.Puesto.values());
        return "index"; // Llama al archivo de la vista con nombre index y lo muestras
    }

    @GetMapping("/empleado/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado, Model model) {
        // Agregar ese empleado a una coleccion de empleados
        empleados.add(empleado);
        model.addAttribute("empleados", empleado);
        return "crud";
    }
}
