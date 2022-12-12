package tn.enis.essay.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity @DiscriminatorValue("etd") 
@Getter @Setter
public class Etudiant extends Member{
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;
	
	public Etudiant(String cin, String nom, String prenom, Date date, byte photo, String cv, String email,
			String password, Date dateInscription, String diplome, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
