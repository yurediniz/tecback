package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Filme {

    @Id
    @GeneratedValue
    private  Integer id;
    private  String filme;
    private  String genero;
    private  int ano;

}
