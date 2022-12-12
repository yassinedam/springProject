package tn.enis.essay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.essay.entity.EnseignantChercheur;
@Repository
public interface EnseignantRepository extends JpaRepository<EnseignantChercheur, Long> {
	List<EnseignantChercheur>findByGrade(String grade);
	List<EnseignantChercheur>findByEtablissement(String etablissement);
}
