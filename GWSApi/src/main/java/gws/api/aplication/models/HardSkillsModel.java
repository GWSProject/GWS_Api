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
@Table(name = "tb_hardskills")
public class HardSkillsModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hardskill", nullable = false)
    private UUID idHardSkills;

    @Column(nullable = false,unique = true)
    private String nome;
}
