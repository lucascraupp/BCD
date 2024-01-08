package engtelecom.bcd.repository;

import engtelecom.bcd.model.Jovem;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface JovemRepository extends CrudRepository<Jovem, Integer> {
    Optional<Jovem> findByCpf(String cpf);
}
