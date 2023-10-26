package gws.api.aplication.repositories.usersrepositories;

import gws.api.aplication.models.users.ConsultorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorRepository extends JpaRepository<ConsultorModel, String> {
}
