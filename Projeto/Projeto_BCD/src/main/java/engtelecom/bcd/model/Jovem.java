package engtelecom.bcd.model;

import engtelecom.bcd.model.acampamento.Acampamentos;
import engtelecom.bcd.model.distintivo.ProgressoDistintivo;
import engtelecom.bcd.model.especialidade.ProgressoEspecialidade;
import engtelecom.bcd.model.insignia.ProgressoInsignia;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString(exclude = {"tipoSanguineo", "alergias", "responsaveis",
        "progressoDistintivos", "progressoInsignias", "progressoEspecialidades", "acampamentos"})
public class Jovem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJovem;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idTipoSanguineo")
    @NonNull
    private TipoSanguineo tipoSanguineo;

    @Column(nullable = false, length = 45)
    @NonNull
    private String nome;

    @Column(nullable = false)
    @NonNull
    private Date dataNasc;

    @Column(nullable = false, length = 45)
    @NonNull
    private String endereco;

    @Column(nullable = false, unique = true, length = 45)
    @NonNull
    private String cpf;

    @Column(nullable = false, length = 45)
    @NonNull
    private String telefone;

    @Column(nullable = false, length = 45)
    @NonNull
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @NonNull
    private Set<Alergias> alergias = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @NonNull
    private Set<Responsavel> responsaveis = new HashSet<>(  );

    @OneToMany(mappedBy = "jovem")
    private List<ProgressoDistintivo> progressoDistintivos = new ArrayList<>();

    @OneToMany(mappedBy = "jovem")
    private List<ProgressoInsignia> progressoInsignias = new ArrayList<>();

    @OneToMany(mappedBy = "jovem", fetch = FetchType.EAGER)
    private List<ProgressoEspecialidade> progressoEspecialidades = new ArrayList<>();

    @OneToMany(mappedBy = "jovem")
    private List<Acampamentos> acampamentos = new ArrayList<>();

    public boolean adicionaAlergia(Alergias alergia) {
        return this.alergias.add(alergia);
    }

    public boolean adicionaResponsavel(Responsavel responsavel) {
        return this.responsaveis.add(responsavel);
    }

    @Override
    public String toString() {
        Set<Alergias> alergias = this.alergias;
        Set<Responsavel> responsaveis = this.responsaveis;

        String string = "\n\nNome: " + this.nome + ",\n" +
                "Data de nascimento: " + this.dataNasc + ",\n" +
                "Endereço: " + this.endereco + ",\n" +
                "CPF: " + this.cpf + ",\n" +
                "Tipo Sangúineo: " + this.tipoSanguineo + ",\n" +
                "Alergias: ";

        for (Alergias alergia : alergias) {
            string += alergia + ", ";
        }

        string += "\nResponsáveis: ";
        for (Responsavel responsavel : responsaveis) {
            string += responsavel.getNome() + ", ";
        }

        return string + "\n" +
                "Telefone: " + this.telefone + ",\n" +
                "Email: " + this.email + "\n";
    }
}
