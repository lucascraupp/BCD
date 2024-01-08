package engtelecom.bcd.model.insignia;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"requisitosInsignia"})
@RequiredArgsConstructor
public class Insignias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInsignias;

    @Column(nullable = false, unique = true, length = 45)
    @NonNull
    private String nome;

    @OneToMany(mappedBy = "insignia")
    private List<RequisitosInsignia> requisitosInsignia = new ArrayList<>();
}
