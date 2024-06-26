package tech.buildrun.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.spring_security.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
