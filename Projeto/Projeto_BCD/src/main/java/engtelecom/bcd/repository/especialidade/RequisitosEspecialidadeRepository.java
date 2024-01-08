package engtelecom.bcd.repository.especialidade;

import engtelecom.bcd.model.especialidade.RequisitosEspecialidade;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RequisitosEspecialidadeRepository extends CrudRepository<RequisitosEspecialidade, Integer> {
    Optional<List<RequisitosEspecialidade>> findByEspecialidade_IdEspecialidades(Integer idEspecialidade);

    Iterable<RequisitosEspecialidade> findAllByEspecialidade_IdEspecialidades(Integer id);
}