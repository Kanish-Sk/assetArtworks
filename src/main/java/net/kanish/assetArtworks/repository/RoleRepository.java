package net.kanish.assetArtworks.repository;

import net.kanish.assetArtworks.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}