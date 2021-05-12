package metier;

public class Vin {
	private String nom;
	private double prix;
	private double millesime;
	private String cepage;
	private String breve;
	private String description;
	private String image; 

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public double getMillesime() {
		return millesime;
	}

	public void setMillesime(double millesime) {
		this.millesime = millesime;
	}
	
	public String getCepage() {
		return cepage;
	}

	public void setCepage(String cepage) {
		this.cepage = cepage;
	}
	
	public String getBreve() {
		return breve;
	}

	public void setBreve(String breve) {
		this.breve= breve;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public Vin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
