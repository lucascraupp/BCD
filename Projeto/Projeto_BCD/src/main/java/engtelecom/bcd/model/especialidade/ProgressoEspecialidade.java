package engtelecom.bcd.model.especialidade;

import engtelecom.bcd.model.Jovem;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"jovem", "requisitosEspecialidade"})
@IdClass(ProgressoEspecialidadeId.class)
@RequiredArgsConstructor
public class ProgressoEspecialidade {
    @Id
    @ManyToOne
    @NonNull
    private Jovem jovem;

    @Id
    @ManyToOne
    @NonNull
    private RequisitosEspecialidade requisitosEspecialidade;

    @Column(nullable = false)
    @NonNull
    private Date data;

    public Integer getIdRequisitoEspecialidade() {
        return this.requisitosEspecialidade.getIdRequisitosEspecialidade();
    }
}
