package br.com.mastertech.user.client.builder;

import br.com.mastertech.user.client.Cep;

public final class CepBuilder {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    private CepBuilder() {
    }

    public static CepBuilder aCep() {
        return new CepBuilder();
    }

    public CepBuilder logradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public CepBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public CepBuilder localidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public CepBuilder uf(String uf) {
        this.uf = uf;
        return this;
    }

    public Cep build() {
        return new Cep(logradouro, bairro, localidade, uf);
    }
}
