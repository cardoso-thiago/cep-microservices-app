package br.com.mastertech.user.config;

import br.com.mastertech.user.client.CepFallback;
import feign.Feign;
import feign.RetryableException;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class ResilienceConfiguration {
    @Bean
    public Feign.Builder builder(){
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new CepFallback(), RetryableException.class)
                .build();
        return Resilience4jFeign.builder(decorators);
    }
}
