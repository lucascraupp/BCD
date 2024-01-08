package engtelecom.bcd.repository.especialidade;

import engtelecom.bcd.model.especialidade.Especialidades;
import engtelecom.bcd.model.especialidade.ProgressoEspecialidade;
import engtelecom.bcd.model.especialidade.ProgressoEspecialidadeId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProgressoEspecialidadeRepository extends CrudRepository<ProgressoEspecialidade, ProgressoEspecialidadeId> {
    Iterable<ProgressoEspecialidade> findAllByJovem_Cpf(String cpf);

    Iterable<ProgressoEspecialidade> findAllByRequisitosEspecialidade_Especialidade(Especialidades epecialidade);

    Iterable<ProgressoEspecialidade> findAllByJovem_CpfAndRequisitosEspecialidade_Especialidade(String cpf, Especialidades especialidade);
}
