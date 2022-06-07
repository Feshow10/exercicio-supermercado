package com.feshow10.supermercado.service.impl;

import com.feshow10.supermercado.entity.Unidade;
import com.feshow10.supermercado.entity.dto.UnidadeDto;
import com.feshow10.supermercado.repository.UnidadeRepository;
import com.feshow10.supermercado.service.IUnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadeServiceImpl implements IUnidadeService {
    @Autowired
    private UnidadeRepository repository;

    @Override
    public Unidade create(UnidadeDto form) {
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
    public Optional<Unidade> get(Long id) {
        return repository.findById(id);
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
