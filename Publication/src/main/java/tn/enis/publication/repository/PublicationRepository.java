package tn.enis.publication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.publication.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
	Publication findByTitre(String titre);
	Publication findByType(String type);


}
