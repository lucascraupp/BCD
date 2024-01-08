package engtelecom.bcd.model.especialidade;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"especialidade", "progressoEspecialidade"})
@RequiredArgsConstructor
public class RequisitosEspecialidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRequisitosEspecialidade;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idEspecialidades")
    @NonNull
    private Especialidades especialidade;

    @Column(nullable = false, unique = true, length = 500)
    @NonNull
    private String requisito;

    @OneToMany(mappedBy = "requisitosEspecialidade")
    private List<ProgressoEspecialidade> progressoEspecialidade = new ArrayList<>();
}
