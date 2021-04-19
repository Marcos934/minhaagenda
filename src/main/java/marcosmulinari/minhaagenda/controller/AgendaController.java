package marcosmulinari.minhaagenda.controller;

import marcosmulinari.minhaagenda.model.AgendaModel;
import marcosmulinari.minhaagenda.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    private AgendaRepository repository;

    @GetMapping(path= "/*")
    public String check(){
        return "API deve ser acessada via Front-end";
    }


    //Retorna todos os contatos
    @GetMapping(path= "/api/contatos",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<AgendaModel> contatos(){
        return repository.findAll();
    }

    //Cria novo contato na agenda
    @PostMapping(path = "/api/novo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public AgendaModel salvarContato(@RequestBody AgendaModel contato){
        return repository.save(contato);
    }

    //Editar contato na agenda
    @PutMapping(path = "/api/editar",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity atualizar(@RequestBody AgendaModel contato){
        return repository.findById(contato.getId())
                .map(
                        alterar->{
                            alterar.setNome(contato.getNome());
                            alterar.setSexo(contato.getSexo());
                            alterar.setTelefone(contato.getTelefone());
                            alterar.setEmail(contato.getEmail());
                            AgendaModel atualizar = repository.save(alterar);
                            return ResponseEntity.ok().body(atualizar);
                        }
                ).orElse(ResponseEntity.notFound().build());
    }



    //Busca Por ID do contato
    @GetMapping(path= "/api/buscar/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity findById(@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }



}
