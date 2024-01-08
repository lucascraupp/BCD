package engtelecom.bcd.model.insignia;

import engtelecom.bcd.model.Jovem;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"jovem", "requisitosInsignia"})
@IdClass(ProgressoInsigniaId.class)
@RequiredArgsConstructor
public class ProgressoInsignia {
    @Id
    @ManyToOne
    @NonNull
    private Jovem jovem;

    @Id
    @ManyToOne
    @NonNull
    private RequisitosInsignia requisitosInsignia;

    @Column(nullable = false)
    @NonNull
    private Date data;

    public Integer getIdRequisitoInsignia() {
        return this.requisitosInsignia.getIdRequisitosInsignia();
    }
}
