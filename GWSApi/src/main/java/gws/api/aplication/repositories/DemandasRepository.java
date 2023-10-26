package gws.api.aplication.repositories;

import gws.api.aplication.models.DemandasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemandasRepository extends JpaRepository<DemandasModel, UUID> {
    DemandasModel findByTitulo(String titulo);
}
