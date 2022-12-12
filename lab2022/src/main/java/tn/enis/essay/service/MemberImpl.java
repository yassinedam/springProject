package tn.enis.essay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.essay.entity.EnseignantChercheur;
import tn.enis.essay.entity.Etudiant;
import tn.enis.essay.entity.Member;
import tn.enis.essay.repository.EnseignantRepository;
import tn.enis.essay.repository.EtudiantRepository;
import tn.enis.essay.repository.MemberRepository;
@Service
public class MemberImpl implements IMemberService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantRepository enseignantRepository;
	@Override
	public Member addMember(Member m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMember(Long id) {
		memberRepository.deleteById(id);
	}

	@Override
	public Member updateMember(Member p) {
		return memberRepository.saveAndFlush(p);
	}

	@Override
	public Member findMember(Long id) {
		Member m=memberRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	@Override
	public Member findByCin(String cin) {
		Member m=memberRepository.findByCin(cin);
		return m;
	}

	@Override
	public Member findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	@Override
	public List<Member> findByNom(String nom) {
		return memberRepository.findByNomStartingWith(nom) ;
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		return etudiantRepository.findByDiplome(diplome) ;
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		return enseignantRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		return enseignantRepository.findByEtablissement(etablissement);
	}

}
