package br.com.mastertech.user.client;

import br.com.mastertech.user.config.ResilienceConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ZUUL", configuration = ResilienceConfiguration.class)
public interface ZuulClient {

    @GetMapping("/cep/{cep}")
    Cep getCep(@PathVariable("cep") String cep);
}
