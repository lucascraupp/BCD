package engtelecom.bcd.model.insignia;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"insignia", "progressoInsignias"})
@RequiredArgsConstructor
public class RequisitosInsignia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRequisitosInsignia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idInsignias")
    @NonNull
    private Insignias insignia;

    @Column(nullable = false, unique = true, length = 500)
    @NonNull
    private String requisito;

    @OneToMany(mappedBy = "requisitosInsignia")
    private List<ProgressoInsignia> progressoInsignias = new ArrayList<>();
}
