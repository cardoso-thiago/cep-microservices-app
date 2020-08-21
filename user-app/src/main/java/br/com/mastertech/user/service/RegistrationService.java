package br.com.mastertech.user.service;

import br.com.mastertech.user.client.Cep;
import br.com.mastertech.user.client.ZuulClient;
import br.com.mastertech.user.dto.UserRequest;
import br.com.mastertech.user.entity.AddressRegistryEntity;
import br.com.mastertech.user.mapper.DataMapper;
import br.com.mastertech.user.repository.AddressRegistryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RegistrationService {

    private final AddressRegistryRepository addressRegistryRepository;
    private final ZuulClient zuulClient;

    public RegistrationService(AddressRegistryRepository addressRegistryRepository, ZuulClient zuulClient) {
        this.addressRegistryRepository = addressRegistryRepository;
        this.zuulClient = zuulClient;
    }

    public AddressRegistryEntity registerUser(UserRequest user) {
        Cep cep = zuulClient.getCep(user.getZipCode());
        AddressRegistryEntity addressRegistryEntity = DataMapper.INSTANCE.userAndCepToAddressRegistryRequest(user, cep);
        return addressRegistryRepository.save(addressRegistryEntity);
    }

    public List<AddressRegistryEntity> getAllRegistries() {
        Iterable<AddressRegistryEntity> iterable = addressRegistryRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }
}
