package tn.enis.publication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.enis.publication.entity.Publication;
import tn.enis.publication.repository.PublicationRepository;

public class PublicationImpl implements IPublicationService {
	@Autowired
	PublicationRepository publicationRepository;
	@Override
	public Publication addPublication(Publication p) {
		publicationRepository.save(p);
		return p;
	}

	@Override
	public void deletePublication(Long id) {
		publicationRepository.deleteById(id);
	}

	@Override
	public Publication updatePublication(Publication p) {
		return publicationRepository.saveAndFlush(p);
	}

	@Override
	public Publication findPublication(Long id) {
		Publication p = publicationRepository.findById(id).get();
		return p;
	}

	@Override
	public List<Publication> findAll() {
		return publicationRepository.findAll();
	}

	@Override
	public Publication findByTitre(String titre) {
		Publication p = publicationRepository.findByTitre(titre);
		return p;
	}

	@Override
	public Publication findByType(String type) {
		Publication p = publicationRepository.findByType(type);
		return p;
	}

}
