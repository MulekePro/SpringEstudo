package com.example.demo.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor

public class Pessoa {


    private int idade;
    private String nome;
    private int id;

    public Pessoa(String nome, Integer idade, int id) {
    }
}
