package engtelecom.bcd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"jovens"})
@RequiredArgsConstructor
public class Alergias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlergias;

    @Column(nullable = false, unique = true, length = 45)
    @NonNull
    private String alergia;

    @ManyToMany(mappedBy = "alergias")
    private List<Jovem> jovens = new ArrayList<>();

    public boolean adicionaJovem(Jovem jovem) {
        return this.jovens.add(jovem);
    }

    @Override
    public String toString() {
        return this.alergia;
    }
}
