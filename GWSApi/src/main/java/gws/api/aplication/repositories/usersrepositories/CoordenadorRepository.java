package gws.api.aplication.repositories.usersrepositories;

import gws.api.aplication.models.users.CoordenadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordenadorRepository extends JpaRepository<CoordenadorModel, String> {
}
