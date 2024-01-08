package engtelecom.bcd.model.distintivo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgressoDistintivoId implements Serializable {
    private Integer jovem;

    private Integer requisitosDistintivo;
}
