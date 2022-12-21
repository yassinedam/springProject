package tn.enis.publication.service;

import java.util.List;

import tn.enis.publication.entity.Publication;


public interface IPublicationService {
	//Crud sur les membres
		public Publication addPublication(Publication p);
		public void deletePublication(Long id) ;
		public Publication updatePublication(Publication p) ;
		public Publication findPublication(Long id) ;
		public List<Publication> findAll();
		//Filtrage par propriété
		public Publication findByTitre(String titre);
		public Publication findByType(String type);

}
