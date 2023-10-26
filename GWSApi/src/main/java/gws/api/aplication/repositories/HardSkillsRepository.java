package gws.api.aplication.repositories;

import gws.api.aplication.models.HardSkillsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HardSkillsRepository extends JpaRepository<HardSkillsModel, UUID> {
    HardSkillsModel findByNome(String nome);
}
