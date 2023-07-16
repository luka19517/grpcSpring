package dev.rulex.auth.server.domain;

import org.springframework.data.repository.CrudRepository;


public interface KorisnikRepository extends CrudRepository<KorisnikEntity, Integer> {

    KorisnikEntity findByUsername(String username);
}
