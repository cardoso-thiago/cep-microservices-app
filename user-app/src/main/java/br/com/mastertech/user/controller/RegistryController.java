package br.com.mastertech.user.controller;

import br.com.mastertech.user.dto.AddressRegistryRequest;
import br.com.mastertech.user.dto.UserRequest;
import br.com.mastertech.user.entity.AddressRegistryEntity;
import br.com.mastertech.user.mapper.DataMapper;
import br.com.mastertech.user.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class RegistryController {

    private final RegistrationService registrationService;

    public RegistryController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registry")
    public ResponseEntity registry() {
        List<AddressRegistryEntity> listOfRegistries = registrationService.getAllRegistries();
        List<AddressRegistryRequest> addressRegistryRequests = DataMapper.INSTANCE.addressEntityToAddressRequest(listOfRegistries);
        return ResponseEntity.ok().body(addressRegistryRequests);
    }

    @PostMapping("/registry")
    public ResponseEntity post(@RequestBody UserRequest user) {
        AddressRegistryEntity addressRegistryEntity = registrationService.registerUser(user);
        AddressRegistryRequest addressRegistryRequest = DataMapper.INSTANCE.addressEntityToAddressRequest(addressRegistryEntity);
        return ResponseEntity.created(URI.create("")).body(addressRegistryRequest);
    }
}
