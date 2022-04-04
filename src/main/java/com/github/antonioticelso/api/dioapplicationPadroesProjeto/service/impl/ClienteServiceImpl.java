package com.github.antonioticelso.api.dioapplicationPadroesProjeto.service.impl;

import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.Cliente;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementaçao da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo Spring (via {@link Autowired})
 * Com isso, pode trata-la como um <b>Singleton</b>
 *
 * @author prado
 */

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
