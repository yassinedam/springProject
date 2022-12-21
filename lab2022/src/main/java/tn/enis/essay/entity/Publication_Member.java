package tn.enis.essay.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Publication_Member {
	@EmbeddedId
	private Membre_Pub_Ids id;
	@ManyToOne @MapsId("auteur_id")
	private Member auteur;
}
