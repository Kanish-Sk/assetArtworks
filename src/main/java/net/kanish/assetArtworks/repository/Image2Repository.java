package net.kanish.assetArtworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kanish.assetArtworks.model.Image2;

@Repository
public interface Image2Repository extends JpaRepository<Image2, Long> {

}
