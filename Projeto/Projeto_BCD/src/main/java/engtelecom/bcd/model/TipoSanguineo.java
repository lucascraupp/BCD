package engtelecom.bcd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = "jovens")
@RequiredArgsConstructor
public class TipoSanguineo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoSanguineo;

    @Column(nullable = false, unique = true, length = 10)
    @NonNull
    private String tipoSanguineo;

    @OneToMany(mappedBy = "tipoSanguineo")
    private List<Jovem> jovens = new ArrayList<>();

    @Override
    public String toString(){
        return tipoSanguineo;
    }
}
