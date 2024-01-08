package engtelecom.bcd.model.acampamento;

import engtelecom.bcd.model.Jovem;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@IdClass(AcampamentoId.class)
@ToString(exclude = "jovem")
public class Acampamentos {
    @Id
    @ManyToOne
    @NonNull
    private Jovem jovem;

    @Id
    @NonNull
    private Date data;
}
