package engtelecom.bcd.model.acampamento;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class AcampamentoId implements Serializable {
    private Integer jovem;

    private Date data;
}
