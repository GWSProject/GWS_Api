package gws.api.aplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_clientes")
public class ClientesModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente", nullable = false)
    private UUID idClientes;

    @Column(name = "nome_empresa")
    private String nomeEmpresa;
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;


}
