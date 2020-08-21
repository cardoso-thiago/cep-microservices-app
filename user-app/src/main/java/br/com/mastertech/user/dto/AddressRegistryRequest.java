package br.com.mastertech.user.dto;

import br.com.mastertech.user.dto.builder.AddressRegistryRequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressRegistryRequest {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("rua")
    private String street;
    @JsonProperty("bairro")
    private String district;
    @JsonProperty("cidade")
    private String city;
    @JsonProperty("estado")
    private String state;

    public AddressRegistryRequest(String name, String street, String district, String city, String state) {
        this.name = name;
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public static AddressRegistryRequestBuilder builder(){
        return AddressRegistryRequestBuilder.anAddressRegistryRequest();
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
