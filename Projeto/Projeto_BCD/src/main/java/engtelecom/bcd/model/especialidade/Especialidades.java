package engtelecom.bcd.model.especialidade;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"area", "requisitosEspecialidade"})
@RequiredArgsConstructor
public class Especialidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecialidades;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idAreas")
    @NonNull
    private Areas area;

    @Column(nullable = false, length = 45)
    @NonNull
    private String especialidade;

    @OneToMany(mappedBy = "especialidade")
    private List<RequisitosEspecialidade> requisitosEspecialidade = new ArrayList<>();
}
