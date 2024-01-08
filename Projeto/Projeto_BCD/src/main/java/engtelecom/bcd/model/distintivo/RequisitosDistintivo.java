package engtelecom.bcd.model.distintivo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"distintivo", "progressoDistintivos"})
@RequiredArgsConstructor
public class RequisitosDistintivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRequisitosDistintivo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idDistintivos")
    @NonNull
    private Distintivos distintivo;

    @Column(nullable = false, unique = true, length = 500)
    @NonNull
    private String requisito;

    @OneToMany(mappedBy = "requisitosDistintivo")
    private List<ProgressoDistintivo> progressoDistintivos = new ArrayList<>();
}
