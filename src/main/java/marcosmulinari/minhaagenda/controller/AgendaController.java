package marcosmulinari.minhaagenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {

    @GetMapping(path= "/*")
    public String check(){
        return "API deve ser acessada via Front-end";
    }

    @GetMapping(path= "/api/criar")
    public String criarContato(){
        return "criar contato";
    }

}
