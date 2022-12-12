package tn.enis.essay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.essay.entity.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findByCin(String cin);
	List<Member>findByNomStartingWith(String caractere);
	Member findByEmail(String email);

}
