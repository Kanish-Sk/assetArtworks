package net.kanish.assetArtworks.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kanish.assetArtworks.model.Image1;

@Repository
public interface Image1Repository extends JpaRepository<Image1, Long>{

}
