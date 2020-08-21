package br.com.mastertech.user.dto.builder;

import br.com.mastertech.user.dto.AddressRegistryRequest;

public final class AddressRegistryRequestBuilder {
    private String name;
    private String street;
    private String district;
    private String city;
    private String state;

    private AddressRegistryRequestBuilder() {
    }

    public static AddressRegistryRequestBuilder anAddressRegistryRequest() {
        return new AddressRegistryRequestBuilder();
    }

    public AddressRegistryRequestBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AddressRegistryRequestBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressRegistryRequestBuilder district(String district) {
        this.district = district;
        return this;
    }

    public AddressRegistryRequestBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressRegistryRequestBuilder state(String state) {
        this.state = state;
        return this;
    }

    public AddressRegistryRequest build() {
        return new AddressRegistryRequest(name, street, district, city, state);
    }
}
