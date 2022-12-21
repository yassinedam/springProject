package tn.enis.essay.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data @AllArgsConstructor @NoArgsConstructor
public class Membre_Pub_Ids implements Serializable{
	private Long publication_id;
	private Long auteur_id;
}
