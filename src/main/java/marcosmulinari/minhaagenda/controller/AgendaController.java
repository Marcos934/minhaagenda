package marcosmulinari.minhaagenda.controller;

import marcosmulinari.minhaagenda.model.AgendaModel;
import marcosmulinari.minhaagenda.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    private AgendaRepository repository;

    @GetMapping(path= "/*")
    public String check(){
        return "API deve ser acessada via Front-end";
    }

    @GetMapping(path= "/api/buscar/{nome}")
    public ResponseEntity buscarContato(@PathVariable("nome") String nome){
        return null;
    }

    @GetMapping(path= "/api/")
    public List<AgendaModel> contatos(){
        return repository.findAll();
    }

}
