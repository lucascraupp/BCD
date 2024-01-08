package engtelecom.bcd.repository.distintivo;

import engtelecom.bcd.model.distintivo.ProgressoDistintivo;
import engtelecom.bcd.model.distintivo.ProgressoDistintivoId;
import org.springframework.data.repository.CrudRepository;

public interface ProgressoDistintivoRepository extends CrudRepository<ProgressoDistintivo, ProgressoDistintivoId> {
    Iterable<ProgressoDistintivo> findAllByJovem_Cpf(String cpf);
}
