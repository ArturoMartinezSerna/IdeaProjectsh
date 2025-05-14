package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorBancaOnline {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

}
