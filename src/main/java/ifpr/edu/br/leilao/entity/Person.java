package ifpr.edu.br.leilao.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "person")
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private String cpf;
    private String password;

    private String cep;

}