package engtelecom.bcd.model.distintivo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"requisitosDistintivos"})
@RequiredArgsConstructor
public class Distintivos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDistintivos;

    @Column(nullable = false, length = 45)
    @NonNull
    private String nome;

    @OneToMany(mappedBy = "distintivo")
    private List<RequisitosDistintivo> requisitosDistintivos = new ArrayList<>();
}
