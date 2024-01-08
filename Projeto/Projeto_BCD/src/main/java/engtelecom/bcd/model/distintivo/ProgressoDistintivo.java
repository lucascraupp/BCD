package engtelecom.bcd.model.distintivo;

import engtelecom.bcd.model.Jovem;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"jovem", "requisitosDistintivo"})
@IdClass(ProgressoDistintivoId.class)
@RequiredArgsConstructor
public class ProgressoDistintivo {
    @Id
    @ManyToOne
    @NonNull
    private Jovem jovem;

    @Id
    @ManyToOne
    @NonNull
    private RequisitosDistintivo requisitosDistintivo;

    @Column(nullable = false)
    @NonNull
    private Date data;

    public Integer getIdRequisitosDistintivo() {
        return this.requisitosDistintivo.getIdRequisitosDistintivo();
    }
}
