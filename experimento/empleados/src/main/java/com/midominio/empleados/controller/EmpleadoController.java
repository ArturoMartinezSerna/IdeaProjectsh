package com.midominio.empleados.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmpleadoController {

    @GetMapping("/") // Llama al archivo que nombra esta funcion con lo indicado en el parentesis. Es decir. Al llamar al puerto 8080/, te devuelve index
    public String llamarIndex() {
        return "index"; // Llama al archivo de la vista con nombre index y lo muestras
    }
}
