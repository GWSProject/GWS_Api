package gws.api.aplication.repositories.usersrepositories;

import gws.api.aplication.models.users.GestorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorRepository extends JpaRepository<GestorModel, String> {
}
