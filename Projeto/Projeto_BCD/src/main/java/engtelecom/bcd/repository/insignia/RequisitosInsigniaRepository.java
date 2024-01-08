package engtelecom.bcd.repository.insignia;

import engtelecom.bcd.model.insignia.RequisitosInsignia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RequisitosInsigniaRepository extends CrudRepository<RequisitosInsignia, Integer> {
    Optional<List<RequisitosInsignia>> findByInsignia_IdInsignias(Integer idInsignia);

    Iterable<RequisitosInsignia> findAllByInsignia_IdInsignias(Integer idInsignia);
}
