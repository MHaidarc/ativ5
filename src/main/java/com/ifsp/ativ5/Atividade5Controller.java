package com.ifsp.ativ5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Atividade5Controller {
    
    public List<Personagem> personagens = new ArrayList<Personagem>();
    
    @GetMapping("/listarPersonagens")
    public String listarPersonagens(Model model) {

        personagens.add(new Personagem("Homer", 38));
        personagens.add(new Personagem("Marge", 38));
        personagens.add(new Personagem("Bart", 10));

        model.addAttribute("personagens", personagens);

        return "personagens.html";
    }

    public List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @GetMapping("/listarTarefas")
    public String listarTarefas(Model model) {

        model.addAttribute("tarefas", tarefas);

        return "tarefas.html";
    }

    //TODO: POSTMAPPING DAORINHA
}
