package gws.api.aplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_demandas")
public class DemandasModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_demanda", nullable = false)
    private UUID idDemanda;

    @Column(nullable = false,unique = false)
    private String titulo;
    @Column(nullable = false,unique = false)
    private String logo;
    @Column(nullable = false,unique = false)
    private String descricao;
    @Column(nullable = false,unique = false)
    private String prioridade;
    @Column(nullable = false,unique = false)
    private boolean privacidade;
    @Column(nullable = false,unique = false)
    private String status;
    @Column(nullable = false,unique = false)
    private LocalDate dataInicio;
    @Column(nullable = false,unique = false)
    private LocalDate dataFinal;
    @Column(nullable = false,unique = false)
    private int custo;
    @Column(nullable = false,unique = false)
    private String anexo;
}
