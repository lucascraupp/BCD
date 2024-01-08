package engtelecom.bcd.repository;

import engtelecom.bcd.model.Jovem;
import engtelecom.bcd.model.acampamento.AcampamentoId;
import engtelecom.bcd.model.acampamento.Acampamentos;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AcampamentosRepository  extends CrudRepository<Acampamentos, AcampamentoId> {
    Optional<Acampamentos> findByJovemAndData(Jovem jovem, Date data);

    List<Acampamentos> findAllByJovem_Cpf(String cpf);
}