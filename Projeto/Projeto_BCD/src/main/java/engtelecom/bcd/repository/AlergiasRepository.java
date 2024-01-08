package engtelecom.bcd.repository;

import engtelecom.bcd.model.Alergias;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AlergiasRepository extends CrudRepository<Alergias, Integer> {
    Optional<Alergias> findByAlergia(String alergia);
}
