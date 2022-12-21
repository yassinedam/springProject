package tn.enis.essay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.enis.essay.entity.EnseignantChercheur;
import tn.enis.essay.entity.Etudiant;
import tn.enis.essay.entity.Member;
import tn.enis.essay.service.IMemberService;

@RestController
public class IMemberController {
	@Autowired
	IMemberService memberService;
	@GetMapping(value="/Members")
	public List<Member> findMembers(){
		return memberService.findAll();
	}
	@GetMapping(value="/Members/{id}")
	public Member findMemberById(@PathVariable Long id){
		return memberService.findMember(id);
	}
	@GetMapping(value="/membre/search/cin")
	public Member findOneMemberByCin(@RequestParam String cin)
	{
	return memberService.findByCin(cin);
	}
	@GetMapping(value="/membre/search/email")
	public Member findOneMemberByEmail(@RequestParam String email)
	{
	return memberService.findByEmail(email);
	}
	@PostMapping(value="/membres/enseignant")
	public Member addMembre(@RequestBody EnseignantChercheur m)
	{
	return memberService.addMember(m);
	}
	@PostMapping(value="/membres/etudiant")
	public Member addMembre(@RequestBody Etudiant e)
	{
	return memberService.addMember(e);
	}
	@GetMapping("/fullmember/{id}")
	public Member findAFullMember(@PathVariable(name="id") Long id)
	{

	Member mbr=memberService.findMember(id);
	mbr.setPubs(memberService.findPublicationparauteur(id));

	return mbr;
	}
	
	
	
}
