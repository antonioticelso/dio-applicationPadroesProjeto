package com.github.antonioticelso.api.dioapplicationPadroesProjeto.service;

import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.Cliente;

/**
 * Difine o padrao <b>Strategy</b> no dominio do cliente.
 * Com isso, se necessario, podemos ter multiplas implementaçoes dessa interface.
 *
 * @author prado
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
