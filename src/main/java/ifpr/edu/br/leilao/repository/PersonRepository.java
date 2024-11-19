package ifpr.edu.br.leilao.repository;

import ifpr.edu.br.leilao.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {

}
