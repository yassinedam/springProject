package tn.enis.essay.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @DiscriminatorValue("esg")
@Getter @Setter
@NoArgsConstructor
public class EnseignantChercheur extends Member{
	
	private String grade; 
	private String etablissement ;
	@OneToMany(mappedBy = "encadrant")
	private List<Etudiant> etudiant;
	
	public EnseignantChercheur(String cin, String nom, String prenom, Date date, byte photo, String cv, String email,
			String password, String grade, String etablissement, List<Etudiant> etudiant) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
		this.etudiant = etudiant;
	}
	
	
	
}
