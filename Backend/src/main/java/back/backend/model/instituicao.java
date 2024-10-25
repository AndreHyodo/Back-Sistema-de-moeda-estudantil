package back.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity(name="instituicao")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class instituicao {
    @Id
    String codigo;
    String nome;
}
