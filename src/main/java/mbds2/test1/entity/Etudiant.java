package mbds2.test1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")


public class Etudiant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id ;
	private String nom ;
	private String prenom ;
	private String filière ;
	private int age ;
	private String niveau ;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFilière() {
		return filière;
	}
	public void setFilière(String filière) {
		this.filière = filière;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	

}
