package com.feshow10.supermercado.controller;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.dto.UnidadeDto;
import com.feshow10.supermercado.service.impl.UnidadeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unidades")

public class UnidadeController {

    @Autowired
    private UnidadeServiceImpl service;

    @PostMapping
    public Unidade create(@Valid @RequestBody UnidadeDto form){
        return service.create(form);
    }

    @GetMapping()
    public List<Unidade> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Unidade> get(@PathVariable Long id){
        return service.get(id);
    }
}
