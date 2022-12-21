package tn.enis.publication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import tn.enis.publication.entity.Publication;
import tn.enis.publication.service.IPublicationService;

public class IPublicationController {
	@Autowired
	IPublicationService pubService;
	@GetMapping(value="/Publications")
	public List<Publication> findPubs(){
		return pubService.findAll();
	}
	@GetMapping(value="/Publications/{id}")
	public Publication findpubById(@PathVariable Long id){
		return pubService.findPublication(id);
	}
	@GetMapping(value="/Publications/search/cin")
	public Publication findPublicationByTitre(@RequestParam String titre)
	{
	return pubService.findByTitre(titre);
	}
	@GetMapping(value="/Publications/search/email")
	public Publication findPublicationByType(@RequestParam String type)
	{
	return pubService.findByType(type);
	}
	@PostMapping(value="/Publications/Publication")
	public Publication addPublication(@RequestBody Publication p)
	{
	return pubService.addPublication(p);
	}
	
}
