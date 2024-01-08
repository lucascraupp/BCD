package engtelecom.bcd.repository;

import engtelecom.bcd.model.Responsavel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> {
    Optional<Responsavel> findByCpf(String cpf);
}
