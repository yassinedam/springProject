package tn.enis.essay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.essay.entity.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant>findByDiplome(String diplome);
	List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String
	diplome);

}
