package com.feshow10.supermercado.service;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.form.UnidadeForm;

import java.util.List;

public interface IUnidadeService {

    default Unidade create(UnidadeForm form){
        return null;
    }

    default Unidade get(Long id) {
        return null;
    }

    default List<Unidade> getAll() {
        return null;
    }

    //Unidade update(Long id, UnidadeUpdateForm formUpdate);

}
