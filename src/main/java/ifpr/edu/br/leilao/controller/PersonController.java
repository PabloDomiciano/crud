package ifpr.edu.br.leilao.controller;

import ifpr.edu.br.leilao.entity.Person;
import ifpr.edu.br.leilao.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/person")
@RestController
@RequiredArgsConstructor
public class PersonController {

    @Autowired
    private  PersonService personService;

    @GetMapping("/lista")
    public ResponseEntity<List<Person>> listarTodos(){
        List<Person> novaPessoa = personService.getPesoa();
        return ResponseEntity.ok(novaPessoa);
    }

    @PostMapping
    public ResponseEntity<Person> criarPessoa(Person person){
        Person novaPessoa = personService.create(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPessoa);
    }



}
