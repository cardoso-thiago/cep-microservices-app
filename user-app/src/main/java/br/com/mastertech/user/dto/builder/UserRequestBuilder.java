package br.com.mastertech.user.dto.builder;

import br.com.mastertech.user.dto.UserRequest;

public final class UserRequestBuilder {
    private String name;
    private String zipCode;

    private UserRequestBuilder() {
    }

    public static UserRequestBuilder anUserRequest() {
        return new UserRequestBuilder();
    }

    public UserRequestBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserRequestBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public UserRequest build() {
        return new UserRequest(name, zipCode);
    }
}
