package com.ejemploHeroku.ejemplohiberus.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Persona {

    @Id
    private Long id;
}
