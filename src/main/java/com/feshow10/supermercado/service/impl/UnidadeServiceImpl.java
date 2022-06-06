package com.feshow10.supermercado.service.impl;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.form.UnidadeForm;
import com.feshow10.supermercado.repository.UnidadeRepository;
import com.feshow10.supermercado.service.IUnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeServiceImpl implements IUnidadeService {
    @Autowired
    private UnidadeRepository repository;

    @Override
    public Unidade create(UnidadeForm form) {
        Unidade unidade = new Unidade();
        unidade.setNome(form.getNome());
        unidade.setEndereco(form.getEndereco());
        unidade.setNumeroDoEndereco(form.getNumeroDoEndereco());
        unidade.setComplementoDoEndereco(form.getComplementoDoEndereco());
        unidade.setCEP(form.getCEP());
        unidade.setVolumeMaximo(form.getVolumeMaximo());

        return repository.save(unidade);
    }

    @Override
    public Unidade get(Long id) {
        return null;
    }

    @Override
    public List<Unidade> getAll() {
        return repository.findAll();
    }

    //@Override
    //public Unidade update(Long id, UnidadeUpdateForm formUpdate) {
    //  return null;
    //}
}
