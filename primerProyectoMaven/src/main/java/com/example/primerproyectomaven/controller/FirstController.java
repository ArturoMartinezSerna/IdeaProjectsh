package com.example.primerproyectomaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class FirstController {


    @GetMapping("/")
    public String mostrar(Model model) {
        // Generamos un dato del lado del servidor y luego lo mostramos en la vista
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            lista.add(i + (int)(Math.random() * 10));
        }
        model.addAttribute("lista", lista);
        model.addAttribute("nombre", "Arturo");
        return "meow.html";
    }

    @GetMapping("/foto")
    public String mostrarFoto() {
        return "foto.html";
    }
}
