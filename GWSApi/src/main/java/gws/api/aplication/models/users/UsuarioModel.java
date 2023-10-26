package gws.api.aplication.models.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.serializer.Serializer;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
 public class UsuarioModel implements Serializable {

   @Serial
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID id;
    @Column(nullable = false,unique = false)
    private String nome;
    @Column(nullable = false,unique = false)
    private String sobrenome;
    @Column(nullable = false,unique = true)
    private String telefone;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = false)
    private String senha;
    @Column(nullable = false,unique = false)
    private LocalDateTime dataCadastro;
    @Column(nullable = false,unique = false)
    private LocalDateTime dataFerias;
    @Column(nullable = false,unique = false)
    private String designacao;
    @Column(nullable = false,unique = false)
    private String cidade;
    @Column(nullable = false,unique = false)
    private String estado;
    @Column(nullable = false,unique = false)
    private LocalDateTime horasSemanais;
    @Column(nullable = true,unique = false)
    private String foto;
    @Column(nullable = true,unique = false)
    private String descricao;



}
