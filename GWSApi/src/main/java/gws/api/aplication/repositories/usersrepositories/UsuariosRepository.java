package gws.api.aplication.repositories.usersrepositories;

import gws.api.aplication.models.users.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
}
