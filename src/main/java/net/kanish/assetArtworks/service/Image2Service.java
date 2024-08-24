package net.kanish.assetArtworks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.kanish.assetArtworks.model.Image2;

@Service
public interface Image2Service {

	public Image2 create(Image2 image2);
	public List<Image2> viewAll();
    public Image2 viewById(long id);
	public void deleteById(long id);
}
