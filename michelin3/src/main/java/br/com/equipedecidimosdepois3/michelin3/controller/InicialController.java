package br.com.equipedecidimosdepois3.michelin3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InicialController {
    @GetMapping("/paginaInicial")
    public String exibirPaginaInicial() {
        return "html/paginaInicial";
    }
}
