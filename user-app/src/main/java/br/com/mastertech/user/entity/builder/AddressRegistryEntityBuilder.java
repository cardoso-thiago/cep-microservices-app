package br.com.mastertech.user.entity.builder;

import br.com.mastertech.user.entity.AddressRegistryEntity;

public final class AddressRegistryEntityBuilder {
    private String name;
    private String street;
    private String district;
    private String city;
    private String state;

    private AddressRegistryEntityBuilder() {
    }

    public static AddressRegistryEntityBuilder anAddressRegistryEntity() {
        return new AddressRegistryEntityBuilder();
    }

    public AddressRegistryEntityBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AddressRegistryEntityBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressRegistryEntityBuilder district(String district) {
        this.district = district;
        return this;
    }

    public AddressRegistryEntityBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressRegistryEntityBuilder state(String state) {
        this.state = state;
        return this;
    }

    public AddressRegistryEntity build() {
        return new AddressRegistryEntity(name, street, district, city, state);
    }
}
