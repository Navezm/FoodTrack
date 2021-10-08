package be.TechnofuturTIC.foodtrack.repositories;

import be.TechnofuturTIC.foodtrack.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
