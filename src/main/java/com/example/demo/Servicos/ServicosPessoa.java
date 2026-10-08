package com.example.demo.Servicos;

import com.example.demo.Entidades.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicosPessoa {

    static List<Pessoa> listaPessoa = new ArrayList<>();

    public static void create(Pessoa pessoa) {
     listaPessoa.add(pessoa);
    }

    public boolean buscar(int ID) {
       for(Pessoa pessoa : listaPessoa){
           if(pessoa.getId() == ID){

               return true;
           }


       }
        System.out.println("Essa pessoa nao existe com esse id");
        return false;
    }


    public boolean deletar(int id){

        for(Pessoa pessoa : listaPessoa){
            if(pessoa.getId() == id){
            listaPessoa.remove(pessoa);
            return true;
            }
        }
        return false;
    }
}
