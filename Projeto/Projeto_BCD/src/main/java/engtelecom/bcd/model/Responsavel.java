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
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Responsavel;

    @Column(nullable = false, length = 45)
    @NonNull
    private String nome;

    @Column(nullable = false, unique = true, length = 45)
    @NonNull
    private String cpf;

    @Column(nullable = false, length = 45)
    @NonNull
    private String telefone;

    @Column(nullable = false, length = 45)
    @NonNull
    private String email;

    @ManyToMany(mappedBy = "responsaveis")
    private List<Jovem> jovens = new ArrayList<>();

    public boolean adicionaJovem(Jovem jovem){
        return jovens.add(jovem);
    }
}
