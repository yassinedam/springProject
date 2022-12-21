package tn.enis.essay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import tn.enis.essay.Bean.PublicationBean;
import tn.enis.essay.entity.Etudiant;
import tn.enis.essay.entity.Member;
import tn.enis.essay.proxy.PublicationServiceProxy;
import tn.enis.essay.repository.MemberRepository;
import tn.enis.essay.service.IMemberService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Lab2022Application implements CommandLineRunner {
	@Autowired
	IMemberService MemberImpl;
	//@Autowired
	//PublicationServiceProxy publicationServiceProxy;
	public static void main(String[] args) {
		SpringApplication.run(Lab2022Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Etudiant e1 = new Etudiant("11124621","Dammak","yassine",null,(byte) 00000001,"Link","yassine.dammak@enis.tn","hasshede",null,"diplome",null);
		//Etudiant e3 = new Etudiant("22222222","Dammak","yassine",null,(byte) 00000010,"Link","yassine.dammak@enis.tn","hasshede",null,"diplome",null);
		//memberRepository.save(e1);
		//memberRepository.save(e2);
		//memberRepository.deleteById(1L);
		/*List<Member> Members= memberRepository.findAll();
		Members.forEach(m->{
			System.out.println(m.getNom()+" "+m.getPrenom()+" "+m.getEmail());
		}
		);*/
		//MemberImpl.addMember(e3);
		//MemberImpl.deleteMember(5L);
		/*PublicationBean publication= publicationServiceProxy.findpubById(1L);
		System.out.println(publication.getTitre());*/
		
	}

}
