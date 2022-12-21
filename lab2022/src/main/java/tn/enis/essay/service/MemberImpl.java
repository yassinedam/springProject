package tn.enis.essay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.essay.Bean.PublicationBean;
import tn.enis.essay.entity.EnseignantChercheur;
import tn.enis.essay.entity.Etudiant;
import tn.enis.essay.entity.Member;
import tn.enis.essay.entity.Membre_Pub_Ids;
import tn.enis.essay.entity.Publication_Member;
import tn.enis.essay.proxy.PublicationServiceProxy;
import tn.enis.essay.repository.EnseignantRepository;
import tn.enis.essay.repository.EtudiantRepository;
import tn.enis.essay.repository.MemberRepository;
import tn.enis.essay.repository.MembrePubRepository;
@Service
public class MemberImpl implements IMemberService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantRepository enseignantRepository;
	@Autowired
	MembrePubRepository membrepubrepository;
	@Autowired
	PublicationServiceProxy proxy;
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

	@Override
	public void affecterauteurTopublication(Long idauteur, Long idpub) {
		Member mbr= memberRepository.findById(idauteur).get();
		Publication_Member mbs= new Publication_Member();
		mbs.setAuteur(mbr);
		mbs.setId(new Membre_Pub_Ids(idpub, idauteur));
		membrepubrepository.save(mbs);		
	}

	@Override
	public List<PublicationBean> findPublicationparauteur(Long idauteur) {
		List<PublicationBean> pubs=new ArrayList<PublicationBean>();
		List<Publication_Member>
		idpubs=membrepubrepository.findpubId(idauteur);
		idpubs.forEach(s->{
		System.out.println(s);
		pubs.add(proxy.findpubById(s.getId().getPublication_id()))
		;
		}
		);

		return pubs;
	}

}
