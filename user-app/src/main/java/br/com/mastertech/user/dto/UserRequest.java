package br.com.mastertech.user.dto;

import br.com.mastertech.user.dto.builder.UserRequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("cep")
    private String zipCode;

    public UserRequest(String name, String zipCode) {
        this.name = name;
        this.zipCode = zipCode;
    }

    public static UserRequestBuilder builder(){
        return UserRequestBuilder.anUserRequest();
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }
}
