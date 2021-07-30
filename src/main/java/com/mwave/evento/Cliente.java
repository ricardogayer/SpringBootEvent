package com.mwave.evento;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
    private LocalDate nascimento;

}
