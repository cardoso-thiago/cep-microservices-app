package br.com.mastertech.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta de CEP está temporariamente indisponível.")
public class CepServiceDownException extends RuntimeException {}