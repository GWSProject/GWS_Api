package gws.api.aplication.models.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// sem uso no momento

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class ConsultorModel extends UsuarioModel{
    @Column(nullable = false,unique = false)
    private String tipoUsuario = "Consultor";

}
