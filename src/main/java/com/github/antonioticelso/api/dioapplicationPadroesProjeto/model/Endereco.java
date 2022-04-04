package com.github.antonioticelso.api.dioapplicationPadroesProjeto.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Atributos deste modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org Para isso, usamos o JSON de retorno da API do ViaCEP
 *
 * @see <a href="https://jsonchema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCep</a>
 *
 * @author prado
 *
 */

@Entity
@Data
public class Endereco {

    @Id
    private String cep;

    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

}
