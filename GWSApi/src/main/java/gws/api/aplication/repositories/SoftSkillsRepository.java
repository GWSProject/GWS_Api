package gws.api.aplication.repositories;

import gws.api.aplication.DTOs.SoftSkillsDTOs;
import gws.api.aplication.models.SoftSkillsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SoftSkillsRepository extends JpaRepository<SoftSkillsModel, UUID> {
    SoftSkillsModel findByNome(String nome);
}
