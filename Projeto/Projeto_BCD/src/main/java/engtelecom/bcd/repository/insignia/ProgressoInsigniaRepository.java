package engtelecom.bcd.repository.insignia;

import engtelecom.bcd.model.insignia.ProgressoInsignia;
import engtelecom.bcd.model.insignia.ProgressoInsigniaId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProgressoInsigniaRepository extends CrudRepository<ProgressoInsignia, ProgressoInsigniaId> {
    Iterable<ProgressoInsignia> findAllByJovem_Cpf(String cpf);
}
