package br.com.mastertech.user.entity;

import br.com.mastertech.user.entity.builder.AddressRegistryEntityBuilder;

import javax.persistence.*;

@Entity
@Table(name = "address_registry")
public class AddressRegistryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String district;
    private String city;
    private String state;

    public AddressRegistryEntity() {
    }

    public AddressRegistryEntity(String name, String street, String district, String city, String state) {
        this.name = name;
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public static AddressRegistryEntityBuilder builder() {
        return AddressRegistryEntityBuilder.anAddressRegistryEntity();
    }

    public Long getId() {
        return id;
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
