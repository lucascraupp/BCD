package engtelecom.bcd.model.especialidade;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"especialidades"})
@RequiredArgsConstructor
public class Areas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAreas;

    @Column(nullable = false, length = 45)
    @NonNull
    private String area;

    @OneToMany(mappedBy = "area", fetch = FetchType.EAGER)
    private List<Especialidades> especialidades = new ArrayList<>();
}
