package marcosmulinari.minhaagenda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {

    @GetMapping(path= "/*")
    public String check(){
        return "API deve ser acessada via Front-end";
    }

    @GetMapping(path= "/api/buscar/{nome}")
    public ResponseEntity buscarContato(@PathVariable("nome") String nome){
        return null;
    }

}
