package com.cenfotec.clasedos.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" , nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;



}
