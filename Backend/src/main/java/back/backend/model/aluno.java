package back.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity(name="aluno")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class aluno {
    @Id
    String matricula;

    String nome;

    String curso;

    @OneToMany
    @JoinColumn(name = "instituicao_id")
    Set<instituicao> instituicoes;
}
