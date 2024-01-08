package engtelecom.bcd.model.insignia;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ProgressoInsigniaId implements Serializable {
    private Integer jovem;

    private Integer requisitosInsignia;
}
