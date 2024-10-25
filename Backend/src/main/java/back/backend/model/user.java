package back.backend.model;

import back.backend.component.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class user {
    @Id
    String nome;
    String email;
    String senha;
    String cpf;
    UserRole tipo;
}
