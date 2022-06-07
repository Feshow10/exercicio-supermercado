package com.feshow10.supermercado.service;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.dto.UnidadeDto;

import java.util.List;
import java.util.Optional;

public interface IUnidadeService {

    Unidade create(UnidadeDto form);

    Optional<Unidade> get(Long id);

    List<Unidade> getAll();

    //Unidade update(Long id, UnidadeUpdateForm formUpdate);

}
