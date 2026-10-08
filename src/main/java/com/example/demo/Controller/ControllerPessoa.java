package com.example.demo.Controller;

import com.example.demo.Entidades.Pessoa;
import com.example.demo.Servicos.ServicosPessoa;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerPessoa {

    private final ServicosPessoa servicosPessoa;

    public ControllerPessoa(ServicosPessoa servicosPessoa) {
        this.servicosPessoa = servicosPessoa;
    }




    @PostMapping("/criar")
    public void CreatePessoa(@RequestParam String nome, @RequestParam Integer idade, @RequestParam int id){

        if(nome != null && idade != null){
        Pessoa pessoa = new Pessoa(nome,idade, id);

        ServicosPessoa.create(pessoa);
        }
        System.out.println("Algum dos parametros esta NULO");

    }


        @GetMapping("/buscar")
        public void Buscar(@RequestParam int id){
       servicosPessoa.b(id);


        }

    @DeleteMapping("/Deletar")
    public void Deletar(){


    }


}
