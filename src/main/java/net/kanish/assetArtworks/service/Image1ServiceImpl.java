package net.kanish.assetArtworks.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanish.assetArtworks.model.Image1;
import net.kanish.assetArtworks.repository.Image1Repository;

@Service
public class Image1ServiceImpl implements Image1Service{

	@Autowired
	private Image1Repository repo;
	
	@Override
	public Image1 create(Image1 image1) {
		return repo.save(image1);
	}	

	@Override
	public List<Image1> viewAll() {
		return (List<Image1>) repo.findAll();
	}

	@Override
	public Image1 viewById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}
}
