package com.library.apiLibrary.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String nacionalidad;

    private String biografia;
}
