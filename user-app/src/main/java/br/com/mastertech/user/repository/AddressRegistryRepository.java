package br.com.mastertech.user.repository;

import br.com.mastertech.user.entity.AddressRegistryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRegistryRepository extends CrudRepository<AddressRegistryEntity, Long> {}
