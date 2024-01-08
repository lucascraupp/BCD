package engtelecom.bcd.model.especialidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ProgressoEspecialidadeId implements Serializable {
    private Integer jovem;

    private Integer requisitosEspecialidade;
}
