package br.com.mastertech.cep.controller;

import br.com.mastertech.cep.client.CepClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {

    private final CepClient cepClient;

    public CepController(CepClient cepClient) {
        this.cepClient = cepClient;
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity getCep(@PathVariable("cep") String cep) {
        return ResponseEntity.ok(cepClient.getCep(cep));
    }
}
