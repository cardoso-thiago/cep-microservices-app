package br.com.mastertech.user.client;

import br.com.mastertech.user.exception.CepServiceDownException;

public class CepFallback implements ZuulClient {
    @Override
    public Cep getCep(String cep) {
        throw new CepServiceDownException();
    }
}
