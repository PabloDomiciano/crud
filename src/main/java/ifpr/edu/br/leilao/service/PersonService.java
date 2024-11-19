package ifpr.edu.br.leilao.service;

import ifpr.edu.br.leilao.entity.Person;
import ifpr.edu.br.leilao.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person create(Person person){
        return personRepository.save(person);
    }

    public void delete(Long id){
        personRepository.deleteById(id);
    }

    public List<Person> getPesoa(){
       return personRepository.findAll();
    }

}
