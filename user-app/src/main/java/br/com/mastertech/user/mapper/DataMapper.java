package br.com.mastertech.user.mapper;

import br.com.mastertech.user.client.Cep;
import br.com.mastertech.user.dto.AddressRegistryRequest;
import br.com.mastertech.user.dto.UserRequest;
import br.com.mastertech.user.entity.AddressRegistryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);

    AddressRegistryRequest addressEntityToAddressRequest(AddressRegistryEntity addressRegistryEntity);
    List<AddressRegistryRequest> addressEntityToAddressRequest(List<AddressRegistryEntity> addressRegistryEntity);

    @Mappings({
            @Mapping(source = "user.name", target = "name"),
            @Mapping(source = "cep.logradouro", target = "street"),
            @Mapping(source = "cep.bairro", target = "district"),
            @Mapping(source = "cep.localidade", target = "city"),
            @Mapping(source = "cep.uf", target = "state")
    })
    AddressRegistryEntity userAndCepToAddressRegistryRequest(UserRequest user, Cep cep);
}
