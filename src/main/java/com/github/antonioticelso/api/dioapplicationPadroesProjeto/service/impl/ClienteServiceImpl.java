package com.github.antonioticelso.api.dioapplicationPadroesProjeto.service.impl;

import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.Cliente;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.ClienteRepository;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.Endereco;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.model.EnderecoRepository;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.service.ClienteService;
import com.github.antonioticelso.api.dioapplicationPadroesProjeto.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementaçao da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo Spring (via {@link Autowired})
 * Com isso, pode trata-la como um <b>Singleton</b>
 *
 * @author prado
 */

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private String cep(Cliente cliente) {
        return cliente.getEndereco().getCep();
    }

    private void salvarClienteComCep(Cliente cliente) {
        Endereco endereco = enderecoRepository.findById(cep(cliente)).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep(cliente));
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
