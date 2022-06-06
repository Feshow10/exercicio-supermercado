package com.feshow10.supermercado.controller;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.form.UnidadeForm;
import com.feshow10.supermercado.service.impl.UnidadeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/unidades")

public class UnidadeController {

    @Autowired
    private UnidadeServiceImpl service;

    @PostMapping
    public Unidade create(@Valid @RequestBody UnidadeForm form){
        return service.create(form);
    }

    @GetMapping("/unidades/")
    public List<Unidade> getAll(){
        return service.getAll();
    }

    @GetMapping("/unidades/{id}")
    public Unidade get(Long id){
        return service.get(id);
    }
}
