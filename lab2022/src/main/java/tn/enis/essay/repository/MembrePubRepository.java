package tn.enis.essay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.enis.essay.entity.Membre_Pub_Ids;
import tn.enis.essay.entity.Publication_Member;

public interface MembrePubRepository extends JpaRepository<Publication_Member, Membre_Pub_Ids> {
	@Query("select m from Publication_Member m where auteur_id=:x")
	List<Publication_Member> findpubId(@Param ("x") Long autId);
}
